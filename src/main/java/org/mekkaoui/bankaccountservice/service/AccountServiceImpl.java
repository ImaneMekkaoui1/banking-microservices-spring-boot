package org.mekkaoui.bankaccountservice.service;

import org.mekkaoui.bankaccountservice.dto.BankAccountRequestDTO;
import org.mekkaoui.bankaccountservice.dto.BankAccountRespnseDTO;
import org.mekkaoui.bankaccountservice.entities.BankAccount;
import org.mekkaoui.bankaccountservice.mappers.AccountMapper;
import org.mekkaoui.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;
@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public BankAccountRespnseDTO addAccount(BankAccountRequestDTO accountDTO) {

        // DTO Request → Entity(Mapping)
        BankAccount bankAccount = BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .createdAt(new Date())
                .balance(accountDTO.getBalance())
                .type(accountDTO.getType())
                .currency(accountDTO.getCurrency())
                .build();


        BankAccount saveBankAccount = bankAccountRepository.save(bankAccount);

        BankAccountRespnseDTO bankAccountRespnseDTO = accountMapper.fromBankAccount(saveBankAccount);

        return bankAccountRespnseDTO;
    }
}