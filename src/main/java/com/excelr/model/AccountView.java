package com.excelr.model;

public class AccountView {
	private long accountNo;
	private String name;
	private String password;
	private String confirmPassword;
	private double amount;
	private String address;
	private long mobile;
	private long targetAccountNo;
	AccountView() {
		super();
	}
	AccountView(long accountNo, String name, String password, String confirmPassword, double amount, String address,
			long mobile, long targetAccountNo) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.amount = amount;
		this.address = address;
		this.mobile = mobile;
		this.targetAccountNo = targetAccountNo;
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public long getTargetAccountNo() {
		return targetAccountNo;
	}
	public void setTargetAccountNo(long targetAccountNo) {
		this.targetAccountNo = targetAccountNo;
	}
	@Override
	public String toString() {
		return "AccountView [accountNo=" + accountNo + ", name=" + name + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", amount=" + amount + ", address=" + address + ", mobile="
				+ mobile + ", targetAccountNo=" + targetAccountNo + "]";
	}
	
}
