package com.cg.onlinebookstore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinebookstore.beans.Reviews;

public interface ReviewsDAO extends JpaRepository<Reviews, Integer>{

}
