package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="account1")
public class Account {

	@Id
	private long accountNo;
	private String name;
	private String password;
	private double amount;
	private String address;
	private long mobileNo;
	public Account() {
		super();
	}
	Account(long accountNo, String name, String password, double amount, String address, long mobileNo) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", password=" + password + ", amount=" + amount
				+ ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}
	
	}
