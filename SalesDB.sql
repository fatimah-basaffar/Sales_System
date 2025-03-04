CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    middle_name VARCHAR(50),
    last_name VARCHAR(50) NOT NULL,
    mobile VARCHAR(15) UNIQUE,  
	email VARCHAR(100) UNIQUE NOT NULL,
    password_hash TEXT NOT NULL,
    is_admin BOOLEAN DEFAULT FALSE,
    is_vendor BOOLEAN DEFAULT FALSE,
    registered_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    last_login TIMESTAMP DEFAULT NULL,
    intro TEXT,
    profile TEXT
);


CREATE TABLE address (
    address_id SERIAL PRIMARY KEY,
    user_id INT NOT NULL,
    line1 VARCHAR(50),
    line2 VARCHAR(50),
    city VARCHAR(50),
    province VARCHAR(50),
    country VARCHAR(32),
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);

CREATE TABLE product (
    product_id BIGINT PRIMARY KEY,
    user_id BIGINT,
    time VARCHAR(75),
    slug VARCHAR(100),
    summary TEXT,  -- Corrected: TINYTEXT to TEXT
    type SMALLINT,
    sku VARCHAR(100),
    price FLOAT,
    discount FLOAT,
    quantity SMALLINT,
    is_available BOOLEAN,
    created_at DATE,
    updated_at DATE,
    published_at DATE,
    starts_at DATE,
    ends_at DATE,
    content TEXT,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE orders (
    order_id BIGINT PRIMARY KEY,
    user_id BIGINT,
    session_id VARCHAR(100),
    token VARCHAR(100),
    subtotal FLOAT,
    item_discount FLOAT,
    vat FLOAT,
    shipping FLOAT,
    total FLOAT,
    promo_code VARCHAR(50),
    discount FLOAT,
    grand_total FLOAT,
    created_at DATE,
    updated_at DATE,
    content TEXT,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE order_item (
    order_item_id BIGINT PRIMARY KEY,
    product_id BIGINT,
    order_id BIGINT,
    sku VARCHAR(100),
    price FLOAT,
    discount FLOAT,
    quantity SMALLINT,
    created_at DATE,
    updated_at DATE,
    published_at DATE,
    FOREIGN KEY (product_id) REFERENCES product(product_id),
    FOREIGN KEY (order_id) REFERENCES orders(order_id)
);

CREATE TABLE transactions (
    transaction_id SERIAL PRIMARY KEY,
    user_id INT NOT NULL,
    order_id INT NOT NULL,
    code VARCHAR(100) UNIQUE,
    mode SMALLINT CHECK (mode IN (1, 2, 3, 4)), -- 1 = Cash, 2 = Card, 3 = Bank Transfer, 4 = Tamara 
    state SMALLINT CHECK (state IN (0, 1, 2)), -- 0 = Failed, 1 = Completed, 2 = in-progress
    content TEXT,
    FOREIGN KEY (order_id) REFERENCES orders(order_id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);

CREATE TABLE product_review (
    product_review_id SERIAL PRIMARY KEY,
    product_id BIGINT NOT NULL,
    rating INT CHECK (rating BETWEEN 1 AND 5),
    published INT DEFAULT 0,
    created_at DATE DEFAULT CURRENT_TIMESTAMP,
    published_at DATE NULL,
    content TEXT,
    FOREIGN KEY (product_id) REFERENCES product(product_id) ON DELETE CASCADE
);

CREATE TABLE category (
    category_id SERIAL PRIMARY KEY,
    title VARCHAR(75) NOT NULL,
    slug VARCHAR(100) UNIQUE NOT NULL,
    content TEXT
);

CREATE TABLE product_category (
    product_id BIGINT NOT NULL,
    category_id INT NOT NULL,
    PRIMARY KEY (product_id, category_id),
    FOREIGN KEY (product_id) REFERENCES product(product_id) ON DELETE CASCADE,
    FOREIGN KEY (category_id) REFERENCES category(category_id) ON DELETE CASCADE
);