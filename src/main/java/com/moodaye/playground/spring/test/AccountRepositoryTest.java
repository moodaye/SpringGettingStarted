package com.moodaye.playground.spring.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.moodaye.playground.spring.config.AppConfig;
import com.moodaye.playground.spring.repository.AccountRepository;
import com.moodaye.playground.spring.repository.JdbcAccountRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
@ContextConfiguration(classes=AppConfig.class)
@Transactional
public class AccountRepositoryTest {

//	@Autowired
	JdbcAccountRepository repository;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetAccountCounts() {
//		assertEquals(3, repository.getAccountCounts());
	}

}
