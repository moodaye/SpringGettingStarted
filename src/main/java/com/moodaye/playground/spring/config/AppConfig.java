package com.moodaye.playground.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages="com.moodaye.playground.spring")
public class AppConfig {

	@Bean (name="dataSource", destroyMethod="shutdown")
	@Profile("test")
	public DataSource h2DataSource(){
		return new EmbeddedDatabaseBuilder()
				.generateUniqueName(true)
				.addScript("schema.sql")
				.addScript("data.sql")
				.setScriptEncoding("UTF-8")
				.setType(EmbeddedDatabaseType.H2)
				.ignoreFailedDrops(true)
				.build();
	}
	
	@Bean(name="transactionManager")
	@Profile("test")
	public PlatformTransactionManager createTxManagerForTest(){
		return new DataSourceTransactionManager(h2DataSource());
	}

}
