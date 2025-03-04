CREATE EXTENSION IF NOT EXISTS pgcrypto;

INSERT INTO users (
    first_name, middle_name, last_name, mobile, email, password_hash, 
    is_admin, is_vendor, registered_at, last_login, intro, profile
) VALUES 
    ('Sumayyah', 'Abdulmoeen', 'Albarakati', '555-123-4567', 'sumayyah.albarakati@gmail.com', crypt('UserPassword123', gen_salt('bf')), TRUE, FALSE, '2023-10-26', '2023-10-27', 'Welcome to my profile!', 'Interested in technology.'),
    ('Abdullah', 'Mohammed', 'Al Saud', '555-987-6543', 'abdullah.alsaud@hotmail.com', crypt('Craftsman2023', gen_salt('bf')), FALSE, TRUE, '2023-10-25', '2023-10-27', 'I sell handmade crafts.', 'Love crafting.'),
    ('Noura', 'Khaled', 'Aldossary', '555-567-8901', 'noura.aldossary@outlook.com', crypt('LeaderPass789', gen_salt('bf')), TRUE, TRUE, '2023-10-24', '2023-10-26', 'I manage a team.', 'Experienced leader.'),
    ('Faisal', 'Ali', 'Alghamdi', '555-112-2334', 'faisal.alghamdi@gmail.com', crypt('StudentLife456', gen_salt('bf')), FALSE, FALSE, '2023-10-23', '2023-10-25', 'I am a student.', 'Studying computer science.'),
    ('Laila', 'Saad', 'Alshahri', '555-445-5667', 'laila.alshahri@uqu.com', crypt('FinancePro2023', gen_salt('bf')), TRUE, FALSE, '2023-10-22', '2023-10-24', 'I work in finance.', 'Financial analyst.'),
    ('Saad', 'Abdulrahman', 'Alasiri', '555-778-8990', 'saad.alasiri@rawafed.com', crypt('ArtisticSoul88', gen_salt('bf')), FALSE, TRUE, '2023-10-21', '2023-10-23', 'I create art.', 'Passionate artist.'),
    ('Aisha', 'Omar', 'Alzahran', '555-223-3445', 'aisha.alzahran@gmail.com', crypt('Consultant123', gen_salt('bf')), TRUE, FALSE, '2023-10-20', '2023-10-22', 'I am a consultant.', 'Business strategist.'),
    ('Khalid', 'Fahad', 'Alotaibi', '555-889-9001', 'khalid.alotaibi@hotmail.com', crypt('WriterPass987', gen_salt('bf')), FALSE, FALSE, '2020-10-19', '2023-10-21', 'I am a writer.', 'Creative writer.'),
    ('Nasser', 'Turki', 'Alrashidi', '555-334-4556', 'nasser.alrashidi@outlook.com', crypt('Entrepreneur99', gen_salt('bf')), TRUE, TRUE, '2023-10-18', '2023-10-20', 'I am an entrepreneur.', 'Tech startup founder.'),
    ('Amal', 'Salem', 'Alshammari', '555-667-7889', 'amal.alshammari@gmail.com', crypt('Designer1234', gen_salt('bf')), FALSE, FALSE, '2023-10-17', '2023-10-19', 'I am a designer.', 'Graphic designer.');

SELECT * FROM users;

INSERT INTO address (user_id, line1, line2, city, province, country) VALUES
    (1, 'King Fahd Rd', 'Building 410', 'Makkah', 'Makkah', 'Saudi Arabia'),
    (2, 'Prince Sultan St', 'Villa 5', 'Riyadh', 'Riyadh', 'Saudi Arabia'),
    (3, 'Olaya St', 'Office 202', 'Dammam', 'Eastern Province', 'Saudi Arabia'),
    (4, 'Corniche Rd', 'Suite 8B', 'Khobar', 'Eastern Province', 'Saudi Arabia'),
    (5, 'Tahlia St', 'House 1035', 'Jeddah', 'Makkah', 'Saudi Arabia'),
    (6, 'King Abdullah Rd', 'Building 204', 'Madinah', 'Madinah', 'Saudi Arabia'),
    (7, 'Al Malaz St', 'Compound A-4', 'Riyadh', 'Riyadh', 'Saudi Arabia'),
    (8, 'Al Balad St', 'House 11', 'Jeddah', 'Makkah', 'Saudi Arabia'),
    (9, 'Al Khaleej Rd', 'Office 305', 'Jubail', 'Eastern Province', 'Saudi Arabia'),
    (10, 'Al Faisaliah St', 'Villa 20', 'Tabuk', 'Tabuk', 'Saudi Arabia');
	
SELECT * FROM address;

INSERT INTO product (product_id, user_id, time, slug, summary, type, sku, price, discount, quantity, is_available, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES
	(1, 2, '08:00', 'elegant-thobe', 'Elegant thobe for special occasions.', 1, 'D-001', 350.00, 0.00, 10, TRUE, '2023-10-27 09:00', '2023-10-27 10:00', '2023-10-27 11:00', '2023-10-27', '2023-11-27', 'Made of high-quality fabric.'),
	(2, 2, '19:30', 'luxury-abaya', 'Luxury embroidered abaya.', 1, 'A-001', 500.00, 0.10, 5, TRUE, '2023-10-27 18:00', '2023-10-27 19:00', '2023-10-27 20:00', '2023-10-27', '2023-11-27', 'Unique design.'),
	(3, 5, '14:00', 'book-saudi-history', 'Book about the history of Saudi Arabia.', 0, 'B-001', 50.00, 0.05, 20, TRUE, '2023-10-27 13:00', '2023-10-27 14:00', '2023-10-27 15:00', '2023-10-27', '2023-11-27', 'Informative and interesting.'),
	(4, 5, '09:00', 'arabic-language-course', 'Course to learn the Arabic language.', 0, 'C-001', 400.00, 0.00, 10, FALSE, '2023-10-27 08:00', '2023-10-27 09:00', '2023-10-27 10:00', '2023-10-27', '2023-11-27', 'For beginners and advanced learners.'),
	(5, 2, '20:00', 'wool-shawl', 'Warm wool shawl.', 1, 'S-001', 75.00, 0.15, 15, TRUE, '2023-10-27 19:00', '2023-10-27 20:00', '2023-10-27 21:00', '2023-10-27', '2023-11-27', 'Suitable for winter.'),
	(6, 2, '10:30', 'leather-bag', 'Handmade leather bag.', 1, 'HB-001', 200.00, 0.00, 8, TRUE, '2023-10-27 09:30', '2023-10-27 10:30', '2023-10-27 11:30', '2023-10-27', '2023-11-27', 'Stylish and practical.'),
	(7, 5, '15:45', 'book-arabic-literature', 'Book on Arabic literature.', 0, 'LA-001', 60.00, 0.10, 12, TRUE, '2023-10-27 14:45', '2023-10-27 15:45', '2023-10-27 16:45', '2023-10-27', '2023-11-27', 'For literature lovers.'),
	(8, 5, '08:15', 'photography-course', 'Course in the art of photography.', 0, 'PC-001', 550.00, 0.00, 7, TRUE, '2023-10-27 07:15', '2023-10-27 08:15', '2023-10-27 09:15', '2023-10-27', '2023-11-27', 'Learn from experts.'),
	(9, 2, '21:00', 'traditional-coffee-set', 'Traditional Arabic coffee set.', 1, 'CS-001', 150.00, 0.05, 10, TRUE, '2023-10-27 20:00', '2023-10-27 21:00', '2023-10-27 22:00', '2023-10-27', '2023-11-27', 'Enjoy authentic Arabic coffee.'),
	(10, 2, '11:30', 'perfume-oud', 'Luxurious perfume with oud scent.', 1, 'PO-001', 250.00, 0.00, 5, TRUE, '2023-10-27 10:30', '2023-10-27 11:30', '2023-10-27 12:30', '2023-10-27', '2023-11-27', 'Long-lasting and captivating fragrance.'),
	(11, 5, '16:00', 'calligraphy-set', 'Set for practicing Arabic calligraphy.', 0, 'CA-001', 80.00, 0.10, 15, TRUE, '2023-10-27 15:00', '2023-10-27 16:00', '2023-10-27 17:00', '2023-10-27', '2023-11-27', 'Perfect for aspiring calligraphers.'),
	(12, 5, '09:45', 'cooking-class', 'Online cooking class for Saudi dishes.', 0, 'CC-001', 300.00, 0.00, 8, FALSE, '2023-10-27 08:45', '2023-10-27 09:45', '2023-10-27 10:45', '2023-10-27', '2023-11-27', 'Learn to prepare delicious meals.'),
	(13, 2, '18:30', 'gold-bracelet', 'Elegant gold bracelet.', 1, 'JB-001', 400.00, 0.05, 7, FALSE, '2023-10-27 17:30', '2023-10-27 18:30', '2023-10-27 19:30', '2023-10-27', '2023-11-27', 'A beautiful addition to any outfit.'),
	(14, 2, '11:00', 'silver-ring', 'Stylish silver ring.', 1, 'SR-001', 100.00, 0.10, 12, TRUE, '2023-10-27 10:00', '2023-10-27 11:00', '2023-10-27 12:00', '2023-10-27', '2023-11-27', 'Modern and chic.');

SELECT * FROM product;

INSERT INTO orders (order_id, user_id, session_id, token, subtotal, item_discount, vat, shipping, total, promo_code, discount, grand_total, created_at, updated_at, content) VALUES
	(1, 1, 'session_1', 'token_1', 250.00, 0.00, 37.50, 20.00, 307.50, 'PROMO10', 10.00, 297.50, '2023-10-27 10:00', '2023-10-27 11:00', 'Order #1 - Electronics'),
	(2, 3, 'session_2', 'token_2', 150.00, 15.00, 20.25, 10.00, 165.25, NULL, 0.00, 165.25, '2023-10-27 14:30', '2023-10-27 15:30', 'Order #2 - Clothing'),
	(3, 1, 'session_3', 'token_3', 500.00, 0.00, 75.00, 20.00, 595.00, NULL, 0.00, 595.00, '2023-10-27 18:00', '2023-10-27 19:00', 'Order #3 - Books'),
	(4, 2, 'session_4', 'token_4', 120.00, 12.00, 16.20, 5.00, 129.20, 'SUMMER20', 20.00, 109.20, '2023-10-27 09:15', '2023-10-27 10:15', 'Order #4 - Home Goods'),
	(5, 5, 'session_5', 'token_5', 300.00, 0.00, 45.00, 15.00, 360.00, NULL, 0.00, 360.00, '2023-10-27 12:45', '2023-10-27 13:45', 'Order #5 - Beauty Products'),
	(6, 3, 'session_6', 'token_6', 450.00, 45.00, 54.75, 25.00, 484.75, 'FALL15', 15.00, 469.75, '2023-10-27 16:20', '2023-10-27 17:20', 'Order #6 - Furniture'),
	(7, 1, 'session_7', 'token_7', 80.00, 8.00, 10.80, 10.00, 92.80, NULL, 0.00, 92.80, '2023-10-27 08:50', '2023-10-27 09:50', 'Order #7 - Toys'),
	(8, 2, 'session_8', 'token_8', 200.00, 0.00, 30.00, 20.00, 250.00, 'WINTER25', 25.00, 225.00, '2023-10-27 19:55', '2023-10-27 20:55', 'Order #8 - Jewelry'),
	(9, 5, 'session_9', 'token_9', 350.00, 35.00, 47.25, 15.00, 377.25, NULL, 0.00, 377.25, '2023-10-27 11:25', '2023-10-27 12:25', 'Order #9 - Sports Equipment'),
	(10, 3, 'session_10', 'token_10', 550.00, 0.00, 82.50, 30.00, 662.50, 'SPRING10', 10.00, 652.50, '2023-10-27 15:00', '2023-10-27 16:00', 'Order #10 - Garden Supplies');

SELECT * FROM orders;

INSERT INTO order_item (order_item_id, product_id, order_id, sku, price, discount, quantity, created_at, updated_at, published_at) VALUES
	(1, 1, 1, 'D-001', 350.00, 0.00, 1, '2023-10-27 10:05', '2023-10-27 11:05', '2023-10-27 11:05'),
	(2, 2, 1, 'A-001', 500.00, 0.10, 1, '2023-10-27 10:10', '2023-10-27 11:10', '2023-10-27 11:10'),
	(3, 3, 2, 'B-001', 50.00, 0.05, 2, '2023-10-27 14:35', '2023-10-27 15:35', '2023-10-27 15:35'),
	(4, 4, 2, 'C-001', 400.00, 0.00, 1, '2023-10-27 14:40', '2023-10-27 15:40', '2023-10-27 15:40'),
	(5, 5, 3, 'S-001', 75.00, 0.15, 3, '2023-10-27 18:05', '2023-10-27 19:05', '2023-10-27 19:05'),
	(6, 6, 3, 'HB-001', 200.00, 0.00, 1, '2023-10-27 18:10', '2023-10-27 19:10', '2023-10-27 19:10'),
	(7, 7, 4, 'LA-001', 60.00, 0.10, 2, '2023-10-27 09:20', '2023-10-27 10:20', '2023-10-27 10:20'),
	(8, 8, 4, 'PC-001', 550.00, 0.00, 1, '2023-10-27 09:25', '2023-10-27 10:25', '2023-10-27 10:25'),
	(9, 9, 5, 'CS-001', 150.00, 0.05, 2, '2023-10-27 12:50', '2023-10-27 13:50', '2023-10-27 13:50'),
	(10, 10, 5, 'PO-001', 250.00, 0.00, 1, '2023-10-27 12:55', '2023-10-27 13:55', '2023-10-27 13:55'),
	(11, 11, 6, 'CA-001', 80.00, 0.10, 3, '2023-10-27 16:25', '2023-10-27 17:25', '2023-10-27 17:25'),
	(12, 12, 6, 'CC-001', 300.00, 0.00, 1, '2023-10-27 16:30', '2023-10-27 17:30', '2023-10-27 17:30'),
	(13, 13, 7, 'JB-001', 400.00, 0.05, 1, '2023-10-27 08:55', '2023-10-27 09:55', '2023-10-27 09:55'),
	(14, 14, 7, 'SR-001', 100.00, 0.10, 2, '2023-10-27 09:00', '2023-10-27 10:00', '2023-10-27 10:00');

SELECT * FROM order_item;

INSERT INTO transactions (user_id, order_id, code, mode, state, content) VALUES
    (1, 1, 'TRX001', 1, 1, 'Payment completed via Cash'),
    (2, 2, 'TRX002', 2, 0, 'Payment failed due to card error'),
    (1, 3, 'TRX003', 3, 2, 'Payment in-progress through Bank Transfer'),
    (4, 4, 'TRX004', 1, 1, 'Payment completed via Cash'),
    (7, 5, 'TRX005', 4, 1, 'Payment completed via Tamara (installment plan)'),
    (6, 6, 'TRX006', 2, 2, 'Payment in-progress via Card'),
    (10, 7, 'TRX007', 3, 1, 'Payment completed via Bank Transfer'),
    (5, 8, 'TRX008', 4, 0, 'Payment failed due to Tamara authorization error'),
    (3, 9, 'TRX009', 1, 2, 'Payment in-progress via Cash'),
    (9, 10, 'TRX010', 3, 1, 'Payment completed via Bank Transfer');

SELECT * FROM transactions;

INSERT INTO category (title, slug, content) VALUES
	('Electronics', 'electronics', 'Electronic gadgets and devices'),
	('Books', 'books', 'Various books and literature'),
	('Clothing', 'clothing', 'Men and women clothing'),
	('Home Appliances', 'home-appliances', 'Appliances for home use'),
	('Sports', 'sports', 'Sports equipment and accessories');

SELECT * FROM category;

INSERT INTO product_review (product_id, rating, published, content) VALUES
	(1, 5, 1, 'Excellent product!'),
	(2, 4, 1, 'Very good, but could be better'),
	(3, 3, 0, 'Average quality'),
	(4, 5, 1, 'Highly recommend!'),
	(5, 2, 0, 'Not satisfied with the quality');

SELECT * FROM product_review;

INSERT INTO product_category (product_id, category_id) VALUES
	(1, 1),
	(2, 2),
	(3, 3),
	(4, 4),
	(5, 5);
	
SELECT * FROM product_category;