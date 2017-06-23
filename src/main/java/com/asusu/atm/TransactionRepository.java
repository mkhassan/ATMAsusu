package com.asusu.atm;


import org.springframework.data.repository.CrudRepository;


import com.asusu.atm.Transaction;




public interface TransactionRepository  extends CrudRepository<Transaction, Integer>{

}
