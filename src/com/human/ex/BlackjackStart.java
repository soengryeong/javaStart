package com.human.ex;

import java.util.Random;
import java.util.Scanner;

public class BlackjackStart {

	public static void main(String[] args) {
		int deck[] = new int[52]; // 카드deck저장공간생성
		// 카드모양
		String cardShape[] = { "스페이스", "클로바", "다이아", "하트" };
		// 카드숫자
		String cardNumber[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
//		deck[0]=0;
//		deck[1]=1;
		for (int i = 0; i < 52; i++) {
			deck[i] = i;
		}
		// 카드를 섞어보자.
		Random rd = new Random();
		for (int i = 0; i < 10000; i++) {
			int rNumber = rd.nextInt(52);
			int temp;
			temp = deck[0];
			deck[0] = deck[rNumber];
			deck[rNumber] = temp;
		}
		// 카드를 한장씩 뽑아서 플레이어에게 주는 작업
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
			   System.out.println("AUser님 카드를 수령하시겠습니까? 0-no 1=yes");
			   if(sc.nextLine().equals("0")) {
				userAFlag=false;
			   };
			}
			if(userBFlag) {
			   System.out.println("BUser님 카드를 수령하시겠습니까?");
			   if(sc.nextLine().equals("0")) {
			   userBFlag=false;
			   };
			}
			//둘다 카드를 안받는다고 하면?
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
		
		
		

		// 점수 계산
		// userAdeck점수계산
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
				// A있으면 10을 더해서 22가 넘지 않으면 scoreASum에 10을
				// 더해주고 넘으면 안더해주면 된다.
				if ((scoreASum + 10) <= 21) {
					scoreASum = scoreASum + 10;
				}
			}
		}
		System.out.println("totalAUser:" + scoreASum);
		if(scoreASum>21) {
			System.out.println("21를 초과");
			break;
		}

	//userBDeck점수 계산
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
			      //A있으면 10을더해서 22가 넘지않으면 scoureASum에 10을 
			     //더해주고 넘으면 안더해주면된다.
			      if((scoreBSum+10)<=21) {
			       scoreBSum=scoreBSum+10;
			      }    
			     }
			    }  
			    System.out.println("totalBUser:"+scoreBSum);
				if(scoreBSum>21) {
					System.out.println("21를 초과");
					break;
				}
		
		
		// userA와 userB가 어떤 카드를 받았는지 출력해보자.
				//A유저의 받은 카드 출력
				System.out.println("AUserCard");
				for (int i : userAdeck) {
					if (i != -1) {
						System.out.print(i + "");
						System.out.print("카드모양" + cardShape[i / cardNumber.length]);
						System.out.print("카드숫자" + cardNumber[i % cardNumber.length]);
					}

				}
				//B유저의 받은 카드출력
				System.out.println("");
				System.out.println("BUserCard");
				for (int i = 0; i < userBIndex; i++) {
					// System.out.println(userBdeck[i]+"");
					System.out.print("카드모양" + cardShape[userBdeck[i] / cardNumber.length]);
					System.out.print("카드숫자" + cardNumber[userBdeck[i] % cardNumber.length]);
				}
		

	
		}
		// 승패 결정
		// "A승리","B승리","무승부"
		String playState = "계속";
		if (scoreBSum > 21) {
			playState = "B승리";
		} else {
			if (scoreBSum > 21) {
				playState = "A승리";
			} else {
				if (scoreASum > scoreBSum) {
					playState = "A승리";
				} else if (scoreASum == scoreBSum) {
					playState = "무승부";
				} else {
					playState = "B승리";
				}
			}
		}
		System.out.println(playState);

		// 카드 출력.
//		for(int i:deck) {
//			System.out.println(i+"");
//			System.out.println("카드모양"+cardShape[i/cardNumber.length]);
//			System.out.println("카드숫자"+cardNumber[i%cardNumber.length]);
//		}

	}

}
