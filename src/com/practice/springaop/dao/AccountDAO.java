package com.practice.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount(Account account, boolean var) {
		System.out.println(getClass() + "Add Account using DB Call");
	}
}
