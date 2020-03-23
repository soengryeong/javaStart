package com.human.ex;

import java.util.Scanner;

public class classBank {
	public static int Balance=0;
	public static Scanner sc = new Scanner(System.in);
    public static void bankstart() {
    	System.out.println("원하시는 업무를 선택하세요(1.예금 2.출금 3.잔액확인)");
		int num1 = sc.nextInt();
		switch(num1) {
		case 1: 
			System.out.println("예금 업무를 선택하셨습니다");
			deposit();
			break;
		case 2:
			System.out.println("출금 업무를 선택하셨습니다");
			withdraw();
			break;
		case 3:
			System.out.println("잔액 확인을 요청하셨습니다");
			Balance();
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
    }
    public static void deposit() {
		System.out.println("얼마를 저축하시겠습니까?(종료는 -1)");
		int num = sc.nextInt();
		Balance = Balance+num;
		System.out.println("현재 잔액은"+Balance+"입니다");
		System.out.println("추가 입금하시겠습니까? (1-yes,2-종료,3-처음으로)");
		int num2 = sc.nextInt();
		switch(num2) {
		case 1: 
			deposit();
			break;
		case 2:
			System.out.println("종료되었습니다. 이용해주셔서 감사합니다");
			break;
		case 3:
			bankstart();
			break;
		}
    }
    public static void withdraw() {
    	System.out.println("현재 잔액은"+Balance+"입니다");
    	System.out.println("원하시는 출금액을 입력해주세요:");
    	int num3 = sc.nextInt();
    	if(Balance<num3) {
    		System.out.println("금액이 부족합니다");
    		
    	}else {
    		int withdraw;
    		withdraw = Balance-num3;
    		System.out.println("출금 후 잔액은"+withdraw+"입니다");
    		System.out.println("처음으로 되돌가고 싶으시면 1번, "
    				+ " 종료를 원하시면 2번을 입력해주세요");
    		int num4 = sc.nextInt();
    		switch(num4) {
    		case 1:
    			bankstart();
    		case 2: 
    			System.out.println("종료되었습니다");
    		     break;
    		}
    	}
    }
    public static void Balance() {
    	System.out.println("현재 잔액은"+Balance+"입니다");
    	return;
    }
	public static void main(String[] args) {
		bankstart();
	
		
		
		

		

	}

}
