package com.cg.payroll.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.payroll.beans.Associate;

public interface AssociateDAO  extends JpaRepository<Associate, Integer>          {
/*
 @Query(value="from Associate a wherea.firstName=:name")
	List<Associate>getAllAssociateByName(String name);*/
}
