package com.moodaye.playground.spring.entities;
import java.math.BigDecimal;

import org.springframework.stereotype.Component;

//@Component
public class Account {
	
	private Long id;
	private BigDecimal balance;
	
	public Account(Long id, BigDecimal balance){
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public Long getId() {
		return id;
	}

	@Override
	public int hashCode(){
		int prime = 31;
		int result = 1;
		
		result = prime*result + (id != null? id.hashCode() : 0);
		return result;
	}

	@Override
	public boolean equals(Object obj){
		if (obj == null) return false;
		if (this == obj) return true;
	
		if (obj.getClass() == this.getClass()){
			Account accObj = (Account) obj;
			if(accObj.getBalance() == this.getBalance())
					return true;
		}
		
		return false;
	}
}
