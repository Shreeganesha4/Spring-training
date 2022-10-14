package com.example.demo.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Fee;
// in JpaRepository<T, ID> T is table class name and ID is primary key
public interface FeeRepository extends JpaRepository<Fee, Integer> {

	/* if u give as findByBranchName will get an exception as there is no property as branchName
	public List<Fee> findByBranch(String srchString);                */
	
	
	//following method need not follow DSL naming convention
	// we are adding @Query annotation and passing query
	//@Query(value="select * from tieto_fee where branch=:srchString",nativeQuery=true)
	//public List<Fee> findByBranchName(@Param("srchString")String srchString);
	
	
	//JPQL
	//use class name and property name instaed of table and column name
	@Query(value="From Fee where branch=:srchString",nativeQuery=false)
	public List<Fee> findByBranchName(@Param("srchString")String srchString);
	
	@Modifying
	@Transactional
	@Query(value="update tieto_fee set amount=:revisedAmount where id=:id",nativeQuery=true)
	public int updateAmount(@Param("revisedAmount") double revisedAmount,@Param("id")int id);
}
