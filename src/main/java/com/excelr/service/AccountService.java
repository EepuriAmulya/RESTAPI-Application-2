package com.excelr.service;

import com.excelr.model.Account;
import com.excelr.model.AccountView;

public interface AccountService {

	public String registerNew(AccountView acv);
	public String showBal(long accountNo);
	public String withdrawAm(Account ac);
	public String depositeAm(Account ac);
	public String transferAm(AccountView acv);
	public String deleteAc(Account ac);
	String showBal(Account ac);
	
	
}
