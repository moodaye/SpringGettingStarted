package com.moodaye.playground.spring.repository;

import java.math.BigDecimal;

import com.moodaye.playground.spring.entities.Account;

public interface AccountRepository {
	int getAccountCounts();
	Account getAccount(Long id);
	Long createAccount(Account account);
	Long deleteAccount(Long id);
	Long updateBalance(Long id, BigDecimal newBalance);

}
