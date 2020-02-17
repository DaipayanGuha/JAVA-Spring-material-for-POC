package com.cg.onlinebookstore.beans;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	@Email
	@Column(unique = true)
	private String userEmailId;
	@Column(unique = true)
	private String password;
	@Column(unique = true)
	private long phoneNumber;
	private boolean adminRights;
	@Embedded
	private Address address;
	@OneToMany(mappedBy = "users", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@MapKey
	private Map<Long, Books> bookMap = new HashMap<>();
	//@OneToOne(cascade = CascadeType.ALL)
   // private Reviews reviews;
	public Users() {
		super();
	}

	public Users(int userId, String userName, @Email String userEmailId, String password, long phoneNumber,
			boolean adminRights, Address address, Map<Long, Books> bookMap) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmailId = userEmailId;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.adminRights = adminRights;
		this.address = address;
		this.bookMap = bookMap;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isAdminRights() {
		return adminRights;
	}
	public void setAdminRights(boolean adminRights) {
		this.adminRights = adminRights;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Map<Long, Books> getBookMap() {
		return bookMap;
	}
	public void setBookMap(Map<Long, Books> bookMap) {
		this.bookMap = bookMap;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (adminRights ? 1231 : 1237);
		result = prime * result + ((bookMap == null) ? 0 : bookMap.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		result = prime * result + ((userEmailId == null) ? 0 : userEmailId.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (adminRights != other.adminRights)
			return false;
		if (bookMap == null) {
			if (other.bookMap != null)
				return false;
		} else if (!bookMap.equals(other.bookMap))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (userEmailId == null) {
			if (other.userEmailId != null)
				return false;
		} else if (!userEmailId.equals(other.userEmailId))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userEmailId=" + userEmailId + ", password="
				+ password + ", phoneNumber=" + phoneNumber + ", adminRights=" + adminRights + ", address=" + address
				+ "]";
	}

	

}
