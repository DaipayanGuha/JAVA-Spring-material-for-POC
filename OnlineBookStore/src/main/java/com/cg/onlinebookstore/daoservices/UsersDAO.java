package com.cg.onlinebookstore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinebookstore.beans.Users;

public interface UsersDAO extends JpaRepository<Users, Integer>{

}
