package com.example.demo.entity;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name = "address_id")
    private int addressId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "line1", length = 50)
    private String line1;

    @Column(name = "line2", length = 50)
    private String line2;
    
    @Column(name = "city", length = 50)
    private String city;
    
    @Column(name = "province", length = 50)
    private String province;
    
    @Column(name = "country", length = 32)
    private String country;
    
    
    public Address() {
		super();
	}

	public Address(int addressId, User user, String line1, String line2, String city, String province,
			String country) {
		super();
		this.addressId = addressId;
		this.user = user;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.province = province;
		this.country = country;
	}
	
	
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", user=" + user + ", line1=" + line1 + ", line2=" + line2
				+ ", city=" + city + ", province=" + province + ", country=" + country + "]";
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(addressId, city, country, line1, line2, province, user);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return addressId == other.addressId && Objects.equals(city, other.city)
				&& Objects.equals(country, other.country)
				&& Objects.equals(line1, other.line1) && Objects.equals(line2, other.line2)
				&& Objects.equals(province, other.province) && Objects.equals(user, other.user);
	}
    
    
}
