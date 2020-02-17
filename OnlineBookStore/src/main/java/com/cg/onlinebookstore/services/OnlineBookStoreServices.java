package com.cg.onlinebookstore.services;

import java.util.List;

import com.cg.onlinebookstore.beans.Books;
import com.cg.onlinebookstore.beans.Users;
import com.cg.onlinebookstore.exceptions.BookDetailsNotFoundException;



public interface OnlineBookStoreServices {
	Books insertBookDetails(Books book);
	Books getBookDetails(String bookTitle) throws BookDetailsNotFoundException;
	List<Books> getAllBookDetails();
	boolean removeBookDetails(long isbnNumber) throws BookDetailsNotFoundException;
	Books insertComments(long isbnNumber,int userId) throws BookDetailsNotFoundException;
	boolean rateBook(long isbnNumber,int userId) throws BookDetailsNotFoundException;
	boolean removeComments(long isbnNumber,int userId) throws BookDetailsNotFoundException;
	Users orderBook(long isbnNumber) throws BookDetailsNotFoundException;
	Books getBookDetailsByIsbn(long isbnNumber) throws BookDetailsNotFoundException;

}
