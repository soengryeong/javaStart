package com.human.ex;

import java.util.Scanner;

public class classBank {
	public static int Balance=0;
	public static Scanner sc = new Scanner(System.in);
    public static void bankstart() {
    	System.out.println("���Ͻô� ������ �����ϼ���(1.���� 2.��� 3.�ܾ�Ȯ��)");
		int num1 = sc.nextInt();
		switch(num1) {
		case 1: 
			System.out.println("���� ������ �����ϼ̽��ϴ�");
			deposit();
			break;
		case 2:
			System.out.println("��� ������ �����ϼ̽��ϴ�");
			withdraw();
			break;
		case 3:
			System.out.println("�ܾ� Ȯ���� ��û�ϼ̽��ϴ�");
			Balance();
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
    }
    public static void deposit() {
		System.out.println("�󸶸� �����Ͻðڽ��ϱ�?(����� -1)");
		int num = sc.nextInt();
		Balance = Balance+num;
		System.out.println("���� �ܾ���"+Balance+"�Դϴ�");
		System.out.println("�߰� �Ա��Ͻðڽ��ϱ�? (1-yes,2-����,3-ó������)");
		int num2 = sc.nextInt();
		switch(num2) {
		case 1: 
			deposit();
			break;
		case 2:
			System.out.println("����Ǿ����ϴ�. �̿����ּż� �����մϴ�");
			break;
		case 3:
			bankstart();
			break;
		}
    }
    public static void withdraw() {
    	System.out.println("���� �ܾ���"+Balance+"�Դϴ�");
    	System.out.println("���Ͻô� ��ݾ��� �Է����ּ���:");
    	int num3 = sc.nextInt();
    	if(Balance<num3) {
    		System.out.println("�ݾ��� �����մϴ�");
    		
    	}else {
    		int withdraw;
    		withdraw = Balance-num3;
    		System.out.println("��� �� �ܾ���"+withdraw+"�Դϴ�");
    		System.out.println("ó������ �ǵ����� �����ø� 1��, "
    				+ " ���Ḧ ���Ͻø� 2���� �Է����ּ���");
    		int num4 = sc.nextInt();
    		switch(num4) {
    		case 1:
    			bankstart();
    		case 2: 
    			System.out.println("����Ǿ����ϴ�");
    		     break;
    		}
    	}
    }
    public static void Balance() {
    	System.out.println("���� �ܾ���"+Balance+"�Դϴ�");
    	return;
    }
	public static void main(String[] args) {
		bankstart();
	
		
		
		

		

	}

}
