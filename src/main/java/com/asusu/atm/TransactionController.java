package com.asusu.atm;


import com.asusu.atm.Transaction;
import com.asusu.atm.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;










@Controller
public class TransactionController {
	
	private TransactionService transactionService;
	
	
	@Autowired
	public void setTransactionService(TransactionService transactionService) {
		this.transactionService = transactionService;
	}
	
	
	
	@RequestMapping(value="/transactions", method=RequestMethod.GET)
	
	public String list(Model model) {
		model.addAttribute("transactions", transactionService.listAllTransactions());
		System.out.println("Returning list of transactions:");   // just for testing, not suppose to be here
		return "transactions";
		
	
	@RequestMapping("transactions/{id}")
		
		public String showTransaction(PathVariable Integer id, Model model) {
			model.addAttribute("transaction", transactionService.getTransactionById(id));
			return "transactionsshow";
		}
			
		
	
 @RequestMapping(value="transaction", method=RequestMethod.POST)
 
 public String saveTransactiont(Transaction transaction){
	 
	 transactionService.saveTransaction(transaction);
	 
	 return "redirect:/transaction/" + transaction.getId();
 }
	
	
		
		
		
		
		
		
		
	@RequestMapping("transaction/new")
	
	public String newTransaction(Model model) {
		model.addAttribute("transaction", new Transaction());
		return "transactionform";
	}
		
		
		
		
		
		
		
		
		
		

		
		
	}
	
	

}
