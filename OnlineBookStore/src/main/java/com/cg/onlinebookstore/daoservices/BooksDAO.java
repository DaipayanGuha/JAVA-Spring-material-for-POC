package com.cg.onlinebookstore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinebookstore.beans.Books;

public interface BooksDAO extends JpaRepository<Books, Long>{

}
