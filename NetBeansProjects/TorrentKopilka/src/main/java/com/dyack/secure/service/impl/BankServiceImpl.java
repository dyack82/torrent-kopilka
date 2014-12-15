package com.dyack.secure.service.impl;

import com.dyack.secure.entity.Bank;
import com.dyack.secure.repository.BankRepository;
import com.dyack.secure.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class BankServiceImpl implements BankService {
 
    @Autowired
    private BankRepository bankRepository;
 
    @Override
    public Bank addBank(Bank bank) {
        Bank savedBank = bankRepository.saveAndFlush(bank);
 
        return savedBank;
    }
 
    @Override
    public void delete(long id) {
        bankRepository.delete(id);
    }
 
    @Override
    public Bank getByName(String name) {
        return bankRepository.findByName(name);
    }
 
    @Override
    public Bank editBank(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }
 
    @Override
    public List<Bank> getAll() {
        return bankRepository.findAll();
    }

    @Override
    public Bank getById(long id) {
        return bankRepository.findById(id);
    }
}
