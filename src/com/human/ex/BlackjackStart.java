package com.human.ex;

import java.util.Random;

public class BlackjackStart {

	public static void main(String[] args) {
		int deck[] = new int[52];
		String cardShape[]= {"�����̽�","Ŭ�ι�","���̾�","��Ʈ"};
		String cardNumber[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//		deck[0]=0;
//		deck[1]=1;
		for (int i = 0; i < 52; i++) {
			deck[i] = i;
		} 
		//ī�带 �����.
		Random rd=new Random();
		for(int i=0; i<10000;i++) {
		int rNumber=rd.nextInt(52);
		int temp;
		temp=deck[0];
		deck[0]=deck[rNumber];
		deck[rNumber]=temp;
		}
		//ī�带 ���徿 �̾Ƽ� �÷��̾�� �ִ� �۾�
		int deckIndex=0;
		int userAdeck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int userBdeck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int userAIndex=0;
		int userBIndex=0;
		
		userAdeck[userAIndex]=deck[deckIndex];
		deckIndex++;
		userAIndex++;
		userBdeck[userBIndex]=deck[deckIndex];
		userBIndex++;
		deckIndex++;
		//userA�� userB�� � ī�带 �޾Ҵ��� ����غ���.
		System.out.println("AUserCard");
		for(int i:userAdeck) {
			if(i!=-1) {
				System.out.println(i+"");
				System.out.println("ī����"+cardShape[i/cardNumber.length]);
				System.out.println("ī�����"+cardNumber[i%cardNumber.length]);
			}
			
		}
		System.out.println("BUserCard");
		for(int i=0; i<userBIndex; i++) {
			System.out.println(userBdeck[i]+""); 
			System.out.println("ī����"+cardShape[userBdeck[i]/cardNumber.length]);
			System.out.println("ī�����"+cardNumber[userBdeck[i]%cardNumber.length]);
		}
		
		
		
		
		//ī�� ���.
//		for(int i:deck) {
//			System.out.println(i+"");
//			System.out.println("ī����"+cardShape[i/cardNumber.length]);
//			System.out.println("ī�����"+cardNumber[i%cardNumber.length]);
//		}

	}

}
