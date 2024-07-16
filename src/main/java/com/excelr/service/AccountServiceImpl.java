package com.excelr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.model.Account;
import com.excelr.model.AccountView;
import com.excelr.repo.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired private AccountRepo repo;
	@Override
	public String registerNew(AccountView acv) {
		String res=null;
		if(acv.getPassword().equals(acv.getConfirmPassword())) {
		Account ac=	new Account();
		acv.getConfirmPassword();
		ac.setAccountNo(acv.getAccountNo());
		ac.setName(acv.getName());
		ac.setPassword(acv.getPassword());
		acv.setConfirmPassword(res);
		ac.setAmount(acv.getAmount());
		ac.setAddress(acv.getAddress());
		ac.setMobileNo(acv.getMobile());
		repo.save(ac);
		res="Registartion success";
		}else {
			res="Confirm Password Not Matched";
		}
		return res;
		
	}

	@Override
	public String showBal(Account ac) {
		Account ac1 = repo.findById((int) ac.getAccountNo()).get();
		if (ac.getName().equalsIgnoreCase(ac1.getName()) && ac.getPassword().equals(ac1.getPassword()))
			return "Your Current Balance is " + ac1.getAmount();
		else
			return "Invalid User Name or Password";
	}

	@Override
	public String withdrawAm(Account ac) {
			Account ac1 = repo.findById((int) ac.getAccountNo()).get();
			if (ac.getName().equalsIgnoreCase(ac1.getName()) && ac.getPassword().equals(ac1.getPassword())) {
				if(ac1.getAmount() >= ac.getAmount()) {
				ac1.setAmount(ac1.getAmount() - ac.getAmount());
				repo.save(ac1);
				return "Your Balance is " + (ac1.getAmount() + ac.getAmount())
						+ " your Balance After widthdraw is " + ac1.getAmount();
				}
				else
					return "Inseficent Funds in Your Account";
			} else
				return "Invalid User Name or Password";
		}
	

	@Override
	public String depositeAm(Account ac) {
			Account ac1 = repo.findById((int) ac.getAccountNo()).get();
			if (ac.getName().equalsIgnoreCase(ac1.getName()) && ac.getPassword().equals(ac1.getPassword())) {
				ac1.setAmount(ac1.getAmount() + ac.getAmount());
				repo.save(ac1);
				return "Your Balance is " + (ac1.getAmount() - ac.getAmount()) + " your Balance After Deposite is "
						+ ac1.getAmount();
			} else
				return "Invalid User Name or Password";
		}
	

	@Override
	public String transferAm(AccountView acv) {
		Account ac1 = repo.findById((int) acv.getAccountNo()).get();
		Account ac2 = repo.findById((int) acv.getTargetAccountNo()).get();
		if (acv.getName().equalsIgnoreCase(ac1.getName()) && acv.getPassword().equals(ac1.getPassword())) {
			ac1.setAmount(ac1.getAmount() - acv.getAmount());
			ac2.setAmount(ac2.getAmount() + acv.getAmount());
			repo.save(ac1);
			repo.save(ac2);
			return "Your Balance is " + (ac1.getAmount() + acv.getAmount())
					+ " your Balance After Transfer is " + ac1.getAmount()
					+" Target Ac Balance is "+(ac2.getAmount()-acv.getAmount())
					+" Target Ac Balance After Transfer is " + ac2.getAmount();
		} else
			return "Invalid User Name or Password";
	}
	

	@Override
	public String deleteAc(Account ac) {
		Account ac1 = repo.findById((int) ac.getAccountNo()).get();
		if (ac.getName().equalsIgnoreCase(ac1.getName()) && ac.getPassword().equals(ac1.getPassword()))
			return "Account Delete Success";
		else
			return "Invalid User Name or Password";
	}

	@Override
	public String showBal(long accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
