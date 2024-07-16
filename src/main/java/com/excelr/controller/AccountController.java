package com.excelr.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Account;
import com.excelr.model.AccountView;
import com.excelr.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService service;
	@PostMapping("/save")
	public String saveData(@RequestBody AccountView acv) {		
		String save=service.registerNew(acv);
		return save;
		
		}
	
	@GetMapping("getone/{accountNo}")
	public String GetOne(@PathVariable Account accountNo) {
		String one=service.showBal(accountNo);
		return one;
	}	
	@PostMapping("/withdraw")
	public String withDraw(@RequestBody Account ac) {
		String with=service.withdrawAm(ac);
		return with;
	}
	
	@PostMapping("/deposit")
	public String deposit(@RequestBody Account ac) {
		String depo=service.depositeAm(ac);
		return depo;
	}
	@PostMapping("/transfer")
	public String viewTranfer(@RequestBody AccountView acv) {
		String tras=service.transferAm(acv);
		return tras;
	}	
    @DeleteMapping("/delete")
          public String deleteAc(Account ac) {
    		return service.deleteAc(ac);
    	}
	}
	

	
		



