package org.mekkaoui.bankaccountservice.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mekkaoui.bankaccountservice.enums.AccountType;

import java.util.Date;

@Data @Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountRequestDTO {

    private Double balance;
    private String currency;
    private AccountType type;
}
