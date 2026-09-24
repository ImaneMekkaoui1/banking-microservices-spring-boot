package org.mekkaoui.bankaccountservice.mappers;

import org.mekkaoui.bankaccountservice.dto.BankAccountRequestDTO;
import org.mekkaoui.bankaccountservice.dto.BankAccountRespnseDTO;
import org.mekkaoui.bankaccountservice.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountRespnseDTO fromBankAccount(BankAccount bankAccount) {
        BankAccountRespnseDTO bankAccountRespnseDTO = new BankAccountRespnseDTO();
        BeanUtils.copyProperties(bankAccount, bankAccountRespnseDTO);
        return bankAccountRespnseDTO;
    }


}
