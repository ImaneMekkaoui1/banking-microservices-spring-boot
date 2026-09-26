package org.mekkaoui.bankaccountservice.repositories;

import org.mekkaoui.bankaccountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
