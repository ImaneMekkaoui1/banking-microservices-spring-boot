package org.mekkaoui.bankaccountservice.service;

import org.mekkaoui.bankaccountservice.dto.BankAccountRequestDTO;
import org.mekkaoui.bankaccountservice.dto.BankAccountResponseDTO;

public interface AccountService {

     BankAccountResponseDTO addAccount(BankAccountRequestDTO accountDTO);

     BankAccountResponseDTO updateAccount(
             String id,
             BankAccountRequestDTO accountDTO
     );

}
