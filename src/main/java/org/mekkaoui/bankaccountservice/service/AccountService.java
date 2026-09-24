package org.mekkaoui.bankaccountservice.service;

import org.mekkaoui.bankaccountservice.dto.BankAccountRequestDTO;
import org.mekkaoui.bankaccountservice.dto.BankAccountRespnseDTO;
import org.mekkaoui.bankaccountservice.entities.BankAccount;

public interface AccountService {
     BankAccountRespnseDTO addAccount(BankAccountRequestDTO accountDTO);

}
