package com.asusu.atm;

import com.asusu.atm.Transaction;

public interface TransactionService {
	
	
	Iterable<Transaction> listAllTransactions();
	
	Transaction getTransactionByAcct(Integer accounttno);

	
	Transaction saveTransaction(Transaction transaction);
	
    Transaction getTransactionById(Integer id); 
    
    Transaction computeBalance(long amount, String action);
	
	
}
