package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "middle_name", length = 50)
    private String middleName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    @Column(name = "mobile", length = 15, unique = true)
    private String mobile;

    @Column(name = "email", length = 100, unique = true, nullable = false)
    private String email;

    @Column(name = "password_hash", nullable = false, columnDefinition = "TEXT")
    private String passwordHash;

    @Column(name = "is_admin", columnDefinition = "TINYINT") // Use TINYINT or Boolean
    private Boolean admin; // Use wrapper class for Boolean

    @Column(name = "is_vendor", columnDefinition = "TINYINT")
    private Boolean vendor;

    @Column(name = "registered_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registeredAt;

    @Column(name = "last_login")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;

    @Column(name = "intro")
    private String intro;

    @Column(name = "profile")
    private String profile;

    
    public User() {
		super();
	}

	public User(int userId, String firstName, String middleName, String lastName, String mobile, String email,
			String passwordHash, Boolean admin, Boolean vendor, Date registeredAt, Date lastLogin, String intro,
			String profile) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.passwordHash = passwordHash;
		this.admin = admin;
		this.vendor = vendor;
		this.registeredAt = registeredAt;
		this.lastLogin = lastLogin;
		this.intro = intro;
		this.profile = profile;
	}

	public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getVendor() {
        return vendor;
    }

    public void setVendor(Boolean vendor) {
        this.vendor = vendor;
    }

    public Date getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Date registeredAt) {
        this.registeredAt = registeredAt;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", mobile=" + mobile + ", email=" + email + ", passwordHash=" + passwordHash + ", admin="
				+ admin + ", vendor=" + vendor + ", registeredAt=" + registeredAt + ", lastLogin=" + lastLogin
				+ ", intro=" + intro + ", profile=" + profile + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(admin, email, firstName, intro, lastLogin, lastName, middleName, mobile, passwordHash,
				profile, registeredAt, userId, vendor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(admin, other.admin) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(intro, other.intro)
				&& Objects.equals(lastLogin, other.lastLogin) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(middleName, other.middleName) && Objects.equals(mobile, other.mobile)
				&& Objects.equals(passwordHash, other.passwordHash) && Objects.equals(profile, other.profile)
				&& Objects.equals(registeredAt, other.registeredAt) && userId == other.userId
				&& Objects.equals(vendor, other.vendor);
	}
    
}