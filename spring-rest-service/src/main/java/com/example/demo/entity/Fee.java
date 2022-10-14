package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tieto_fee")
public class Fee {
	
	@Id
	private int id;
	
	//no column bcz its a single literal word.
	private String branch;
	private String year;
	private double amount;
	public Fee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fee(int id, String branch, String year, double amount) {
		super();
		this.id = id;
		this.branch = branch;
		this.year = year;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Fee [id=" + id + ", branch=" + branch + ", year=" + year + ", amount=" + amount + "]";
	}
	
	
	
	

}
