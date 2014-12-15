package com.dyack.secure.repository;

import com.dyack.secure.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface BankAccountRepositroy extends JpaRepository<BankAccount, Long>{
}
