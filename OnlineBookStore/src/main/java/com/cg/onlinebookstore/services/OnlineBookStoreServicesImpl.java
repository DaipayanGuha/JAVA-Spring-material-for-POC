package com.cg.onlinebookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.onlinebookstore.beans.Books;
import com.cg.onlinebookstore.beans.Users;
import com.cg.onlinebookstore.daoservices.BooksDAO;
import com.cg.onlinebookstore.daoservices.ReviewsDAO;
import com.cg.onlinebookstore.daoservices.UsersDAO;
import com.cg.onlinebookstore.exceptions.BookDetailsNotFoundException;
@Component("onlineBookStoreServices")
public class OnlineBookStoreServicesImpl implements OnlineBookStoreServices{

	@Autowired
	BooksDAO booksDao;
	
	@Autowired
	ReviewsDAO reviewsDAO;
	
	@Autowired
	UsersDAO usersDao;
	
	@Override
	public Books insertBookDetails(Books book) {
		return booksDao.save(book);
	}

	

	@Override
	public List<Books> getAllBookDetails() {
		return booksDao.findAll();
	}

	@Override
	public boolean removeBookDetails(long isbnNumber) throws BookDetailsNotFoundException {
		Books book = getBookDetailsByIsbn(isbnNumber);
		booksDao.delete(book);
		return true;
	}

	@Override
	public Books insertComments(long isbnNumber, int userId) throws BookDetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean rateBook(long isbnNumber, int userId) throws BookDetailsNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeComments(long isbnNumber, int userId) throws BookDetailsNotFoundException {
		//usersDao.findById(userId).orElseThrow(() -> new UserDeta
		Books book = getBookDetailsByIsbn(isbnNumber);
		book.getBookReviews();
		return false;
	}

	@Override
	public Users orderBook(long isbnNumber) throws BookDetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Books getBookDetails(String bookTitle) throws BookDetailsNotFoundException {
		//return booksDao.findOne(example).orElseThrow(() -> new BookDetailsNotFoundException("No book found with title "+bookTitle));
		return null;
	}



	@Override
	public Books getBookDetailsByIsbn(long isbnNumber) throws BookDetailsNotFoundException {
		return booksDao.findById(isbnNumber).orElseThrow(()->new BookDetailsNotFoundException("No books found with isbn "+isbnNumber));
	}

	

}
