package com.cg.onlinebookstore.beans;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import oracle.sql.BLOB;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="isbn_gen")
	@SequenceGenerator(name="isbn_gen", sequenceName="isbn_gen", allocationSize=1, initialValue=1000000000)
	private long isbnNumber;
	
	private BookCategory bookCategory;
	@Column(unique=true)
	private String bookTitle;
	private String authorName;
	private BLOB coverImage;
	private double price;
	private LocalDate publishDate;
	@ManyToOne
	private Users users;
	@OneToMany(mappedBy = "books" , cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@MapKey
	private Map<Integer, Reviews> bookReviews = new HashMap<Integer, Reviews>();
	public Books() {
		super();
	}
	public Books(long isbnNumber, BookCategory bookCategory, String bookTitle, String authorName, BLOB coverImage,
			double price, LocalDate publishDate, Users users, Map<Integer, Reviews> bookReviews) {
		super();
		this.isbnNumber = isbnNumber;
		this.bookCategory = bookCategory;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.coverImage = coverImage;
		this.price = price;
		this.publishDate = publishDate;
		this.users = users;
		this.bookReviews = bookReviews;
	}
	public Books(BookCategory bookCategory, String bookTitle, String authorName, BLOB coverImage, double price,
			LocalDate publishDate, Users users, Map<Integer, Reviews> bookReviews) {
		super();
		this.bookCategory = bookCategory;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.coverImage = coverImage;
		this.price = price;
		this.publishDate = publishDate;
		this.users = users;
		this.bookReviews = bookReviews;
	}
	
	public Books(String bookTitle, String authorName, double price) {
		super();
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
	}
	public long getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(long isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	public BookCategory getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public BLOB getCoverImage() {
		return coverImage;
	}
	public void setCoverImage(BLOB coverImage) {
		this.coverImage = coverImage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public Map<Integer, Reviews> getBookReviews() {
		return bookReviews;
	}
	public void setBookReviews(Map<Integer, Reviews> bookReviews) {
		this.bookReviews = bookReviews;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((bookCategory == null) ? 0 : bookCategory.hashCode());
		result = prime * result + ((bookReviews == null) ? 0 : bookReviews.hashCode());
		result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
		result = prime * result + ((coverImage == null) ? 0 : coverImage.hashCode());
		result = prime * result + (int) (isbnNumber ^ (isbnNumber >>> 32));
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publishDate == null) ? 0 : publishDate.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		Books other = (Books) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (bookCategory != other.bookCategory)
			return false;
		if (bookReviews == null) {
			if (other.bookReviews != null)
				return false;
		} else if (!bookReviews.equals(other.bookReviews))
			return false;
		if (bookTitle == null) {
			if (other.bookTitle != null)
				return false;
		} else if (!bookTitle.equals(other.bookTitle))
			return false;
		if (coverImage == null) {
			if (other.coverImage != null)
				return false;
		} else if (!coverImage.equals(other.coverImage))
			return false;
		if (isbnNumber != other.isbnNumber)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publishDate == null) {
			if (other.publishDate != null)
				return false;
		} else if (!publishDate.equals(other.publishDate))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Books [isbnNumber=" + isbnNumber + ", bookCategory=" + bookCategory + ", bookTitle=" + bookTitle
				+ ", authorName=" + authorName + ", coverImage=" + coverImage + ", price=" + price + ", publishDate="
				+ publishDate + "]";
	}

}
