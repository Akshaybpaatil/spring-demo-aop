package com.practice.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogging {

	// @Before("execution(public void addAccount())")
	// @Before("execution(public void
	// com.practice.springaop.dao.AccountDAO.addAccount())")
	// @Before("execution(public void add*())")
	// @Before("execution(* add*())")
	// @Before("execution(* add*(com.practice.springaop.dao.Account))")
	// @Before("execution(* add*(com.practice.springaop.dao.Account,..))")
	// @Before("execution(* add*(..))")
	@Before("execution(* com.practice.springaop.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n====>>> Executing @Before advice on addAccount()");
	}
}
