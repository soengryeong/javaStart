package com.human.ex;

import java.util.Random;

public class BlackjackStart {

	public static void main(String[] args) {
		int deck[] = new int[52];
		String cardShape[]= {"스페이스","클로바","다이아","하트"};
		String cardNumber[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//		deck[0]=0;
//		deck[1]=1;
		for (int i = 0; i < 52; i++) {
			deck[i] = i;
		} 
		//카드를 섞어보자.
		Random rd=new Random();
		for(int i=0; i<10000;i++) {
		int rNumber=rd.nextInt(52);
		int temp;
		temp=deck[0];
		deck[0]=deck[rNumber];
		deck[rNumber]=temp;
		}
		//카드를 한장씩 뽑아서 플레이어에게 주는 작업
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
		//userA와 userB가 어떤 카드를 받았는지 출력해보자.
		System.out.println("AUserCard");
		for(int i:userAdeck) {
			if(i!=-1) {
				System.out.println(i+"");
				System.out.println("카드모양"+cardShape[i/cardNumber.length]);
				System.out.println("카드숫자"+cardNumber[i%cardNumber.length]);
			}
			
		}
		System.out.println("BUserCard");
		for(int i=0; i<userBIndex; i++) {
			System.out.println(userBdeck[i]+""); 
			System.out.println("카드모양"+cardShape[userBdeck[i]/cardNumber.length]);
			System.out.println("카드숫자"+cardNumber[userBdeck[i]%cardNumber.length]);
		}
		
		
		
		
		//카드 출력.
//		for(int i:deck) {
//			System.out.println(i+"");
//			System.out.println("카드모양"+cardShape[i/cardNumber.length]);
//			System.out.println("카드숫자"+cardNumber[i%cardNumber.length]);
//		}

	}

}
