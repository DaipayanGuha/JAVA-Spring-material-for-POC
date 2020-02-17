package com.cg.onlinebookstore.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String locality;
	private String city;
	private String country;
	private long zipCode;
	public Address() {
		super();
	}
	public Address(String locality, String city, String country, long zipCode) {
		super();
		this.locality = locality;
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((locality == null) ? 0 : locality.hashCode());
		result = prime * result + (int) (zipCode ^ (zipCode >>> 32));
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (locality == null) {
			if (other.locality != null)
				return false;
		} else if (!locality.equals(other.locality))
			return false;
		if (zipCode != other.zipCode)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Address [locality=" + locality + ", city=" + city + ", country=" + country + ", zipCode=" + zipCode
				+ "]";
	}
	
	
}
