package com.example.demo.services;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Fee;
import com.example.demo.repository.FeeRepository;

@Service
public class FeeService {
	@Autowired
	private FeeRepository repo;


	public FeeService() {
		super();
		
	}
	
	public Fee add(Fee entity ) throws SQLException {
		
		return this.repo.save(entity);
	}
	
	public List<Fee> findAll(){
		return this.repo.findAll();
	}
	
	
	
	public Optional<Fee> findById(int key){
		return this.repo.findById(key);
	}
	
	public void deleteById(int id) {
		if(this.repo.existsById(id)) {
		 this.repo.deleteById(id);
		}else {
			
			throw new RuntimeException("Element not found !!!");
		}
	}
	
	public int update(double amount,int id) {
		return this.repo.updateAmount(amount,id);
	}
	
//	public List<Fee> findByBranch(String branch){
//		return this.repo.findByBranch(branch);
//	}
	
	
	public List<Fee> findByBranchName(String branch){
	return this.repo.findByBranchName(branch);
}
	
	
}

