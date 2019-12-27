package com.hcl.bank;

import java.util.Scanner;

public class SearchAccountMain {
public static void main(String[] args) {
	int accountNo;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter account no");
	accountNo=sc.nextInt();
	AccountDAO dao=new AccountDAO();
	Account account=dao.searchAccount(accountNo);
	if(account!=null){
		System.out.println("name "+account.getFirstName());
		System.out.println("lastb name "+account.getLastName());
		System.out.println("city "+account.getCity());
		System.out.println("state "+account.getState());
		System.out.println("amount "+account.getAmount());
		System.out.println("cheqfacil "+account.getCheqFacil());
		System.out.println("account type "+account.getAccountType());
		}
	}
}
