package com.human.ex;

import java.util.Random;
import java.util.Scanner;

public class BlackjackStart {

	public static void main(String[] args) {
		int deck[] = new int[52]; // ī��deck�����������
		// ī����
		String cardShape[] = { "�����̽�", "Ŭ�ι�", "���̾�", "��Ʈ" };
		// ī�����
		String cardNumber[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
//		deck[0]=0;
//		deck[1]=1;
		for (int i = 0; i < 52; i++) {
			deck[i] = i;
		}
		// ī�带 �����.
		Random rd = new Random();
		for (int i = 0; i < 10000; i++) {
			int rNumber = rd.nextInt(52);
			int temp;
			temp = deck[0];
			deck[0] = deck[rNumber];
			deck[rNumber] = temp;
		}
		// ī�带 ���徿 �̾Ƽ� �÷��̾�� �ִ� �۾�
		int deckIndex = 0;
		int userAdeck[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		int userBdeck[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		int userAIndex = 0;
		int userBIndex = 0;
		boolean userAFlag=true;
		boolean userBFlag=true;
		
        Scanner sc=new Scanner(System.in);
        int scoreASum = 0;
        int scoreBSum = 0;
		for (int j = 0; j < 10; j++) {
			if(userAFlag) {
			   System.out.println("AUser�� ī�带 �����Ͻðڽ��ϱ�? 0-no 1=yes");
			   if(sc.nextLine().equals("0")) {
				userAFlag=false;
			   };
			}
			if(userBFlag) {
			   System.out.println("BUser�� ī�带 �����Ͻðڽ��ϱ�?");
			   if(sc.nextLine().equals("0")) {
			   userBFlag=false;
			   };
			}
			//�Ѵ� ī�带 �ȹ޴´ٰ� �ϸ�?
			if(!(userAFlag || userBFlag)) {
				break;
			}
			
			if(userAFlag) {
			userAdeck[userAIndex] = deck[deckIndex];
			deckIndex++;
			userAIndex++;
			}
			if(userBFlag) {
			userBdeck[userBIndex] = deck[deckIndex];
			userBIndex++;
			deckIndex++;
			}
		
		
		

		// ���� ���
		// userAdeck�������
		scoreASum=0;
		for (int i = 0; i < userAIndex; i++) {
			int scoreA = 0;
			scoreA = userAdeck[i] % 13 + 1;
			if (scoreA > 10) {
				scoreA = 10;
			}
			scoreASum=scoreASum+scoreA;
			
			
		}
		// A 1 or 11
		for (int i = 0; i < userAIndex; i++) {
			if (userAdeck[i] % 13 == 0) {
				// A������ 10�� ���ؼ� 22�� ���� ������ scoreASum�� 10��
				// �����ְ� ������ �ȴ����ָ� �ȴ�.
				if ((scoreASum + 10) <= 21) {
					scoreASum = scoreASum + 10;
				}
			}
		}
		System.out.println("totalAUser:" + scoreASum);
		if(scoreASum>21) {
			System.out.println("21�� �ʰ�");
			break;
		}

	//userBDeck���� ���
		   scoreBSum=0;
		   for(int i=0;i<userBIndex;i++) {
			     int scoureB=0;
			     scoureB=userBdeck[i]%13+1;
			    if(scoureB>10) {
			      scoureB=10;
			     }
			     scoreBSum=scoreBSum+scoureB;
			    }
			    //A 1 or 11
			    for(int i=0;i<userBIndex;i++) {
			 
			     if(userBdeck[i]%13==0) {
			      //A������ 10�����ؼ� 22�� ���������� scoureASum�� 10�� 
			     //�����ְ� ������ �ȴ����ָ�ȴ�.
			      if((scoreBSum+10)<=21) {
			       scoreBSum=scoreBSum+10;
			      }    
			     }
			    }  
			    System.out.println("totalBUser:"+scoreBSum);
				if(scoreBSum>21) {
					System.out.println("21�� �ʰ�");
					break;
				}
		
		
		// userA�� userB�� � ī�带 �޾Ҵ��� ����غ���.
				//A������ ���� ī�� ���
				System.out.println("AUserCard");
				for (int i : userAdeck) {
					if (i != -1) {
						System.out.print(i + "");
						System.out.print("ī����" + cardShape[i / cardNumber.length]);
						System.out.print("ī�����" + cardNumber[i % cardNumber.length]);
					}

				}
				//B������ ���� ī�����
				System.out.println("");
				System.out.println("BUserCard");
				for (int i = 0; i < userBIndex; i++) {
					// System.out.println(userBdeck[i]+"");
					System.out.print("ī����" + cardShape[userBdeck[i] / cardNumber.length]);
					System.out.print("ī�����" + cardNumber[userBdeck[i] % cardNumber.length]);
				}
		

	
		}
		// ���� ����
		// "A�¸�","B�¸�","���º�"
		String playState = "���";
		if (scoreBSum > 21) {
			playState = "B�¸�";
		} else {
			if (scoreBSum > 21) {
				playState = "A�¸�";
			} else {
				if (scoreASum > scoreBSum) {
					playState = "A�¸�";
				} else if (scoreASum == scoreBSum) {
					playState = "���º�";
				} else {
					playState = "B�¸�";
				}
			}
		}
		System.out.println(playState);

		// ī�� ���.
//		for(int i:deck) {
//			System.out.println(i+"");
//			System.out.println("ī����"+cardShape[i/cardNumber.length]);
//			System.out.println("ī�����"+cardNumber[i%cardNumber.length]);
//		}

	}

}
