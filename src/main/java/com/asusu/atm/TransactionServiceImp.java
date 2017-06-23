package com.asusu.atm;

import com.asusu.atm.Transaction;
import com.asusu.atm.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TransactionServiceImp implements TransactionService{
	
	private TransactionRepository transactionRepository;

	
	@Autowired
	
	public void setTransactionRepository(TransactionRepository transactionRepository) {
		this.transactionRepository=transactionRepository;
	}
	
	
			
	@Override
	public Iterable<Transaction> listAllTransactions() {
		
		return transactionRepository.findAll();
	}

	@Override
	public Transaction getTransactionByAcct(Integer accountno) {
		
		return transactionRepository.findOne(accountno);
	}
	
  
	

	@Override
	public Transaction saveTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		return transactionRepository.save(transaction);
	}
	
	
	// After overriding interfaces, one can write own methods too!

    public Transaction getTransactionById(Integer id) {
        return transactionRepository.findOne(id);
    }
	
	public Transaction computeBalance(long amount, String action){
		// not implemented yet
		Transaction newbalance = new Transaction();
		
		return newbalance;
	}
	
	

}
