package com.moodaye.playground.spring.repository;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

import com.moodaye.playground.spring.entities.Account;

@Repository
@Transactional
public class JdbcAccountRepository implements AccountRepository{
	
	JdbcTemplate template;
	
	@Autowired
	public JdbcAccountRepository(DataSource ds){
		this.template = new JdbcTemplate(ds);
	}

	//@Override
	public int getAccountCounts() {
		String sqlQuery = "select count(*) from Account";
		return template.queryForObject(sqlQuery, Integer.class);
	}

	@Override
	public Account getAccount(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long createAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long deleteAccount(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long updateBalance(Long id, BigDecimal newBalance) {
		// TODO Auto-generated method stub
		return null;
	}

}
