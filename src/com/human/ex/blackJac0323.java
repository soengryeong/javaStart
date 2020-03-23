package com.human.ex;

import java.util.Random;
import java.util.Scanner;

public class blackJac0323 {
	public static int deckIndex = 0; // ���� ����� ī���ε���
	// p1
	public static int p1Deck[] = new int[10]; // p1�� ī����
	public static int p1Index = 0; // p1ī�� ��Ͽ� �ε���
	public static boolean p1Flag = true; // ����ڰ� ī�带 ���� ������
	// p2
	public static int p2Deck[] = new int[10]; // p2�� ī����
	public static int p2Index = 0; // p2ī�� ��Ͽ� �ε���
	public static boolean p2Flag = true; // ����ڰ� ī�带 ���� ������

	public static Scanner sc = new Scanner(System.in);
	public static int deck[] = new int[52];
	public static void playGame() {
		 createDeck();
	 	 mixDeck();
	 	 for(int i=0; i<3; i++) {
	 		 getP1Card();
	 		 if(getsum(p1Deck,p1Index)>21) {
	 			 break;
	 		 }
			 getP2Card();
			 if(getsum(p2Deck,p2Index)>21) {
	 			 break;
	 		 };
	 		 if(p1Flag==false&&p2Flag==false) {
	 			 System.out.println("�� �÷��̾ ī�� ������ �����Ͽ����ϴ�.");
	 			 break;
	 		 }
			 gameDisplay();
	 	 }
	 	System.out.println("--------------------");
	 	gameDisplay();
	  	System.out.println(whoIswin());
	}
	public static String whoIswin() { //���� �̰����
		int p1=getsum(p1Deck,p1Index);
		int p2=getsum(p2Deck,p2Index);
		String playState="";
		if(p1>21) {//���� ī����� p1�� ��
			playState="p2�¸�";
		}else if(p2>21){
			playState="p1�¸�";      	
		}else if(p1>p2) {
			playState="p1�¸�";
		}else if(p1==p2) {
			playState="���º�";
		}else {
			playState="p2�¸�";
		}
		return playState;
	}
	public static int getsum(int[] deck,int index) {
		int sum=0;
		for(int i=0; i<index; i++) { //a=1,j,q,k=10;
			int score=0;
			score=deck[i]%13+1;
			if(score>10) {
				score=10;
			}
			sum=sum+score;
		} //aó�� 11�� ó�� ������ 21
		// a�� 11�� �ٲ��� �� 21�� �Ѿ�� �ٲ��� �ʰ� 21�� �Ѿ�� ������ �ٲ��ش�.
		for(int i=0; i<index; i++) {
			if(deck[i]%13==0) {
				if(sum+10<=21) {
					sum=sum+10;
				}
			}
		}
		return sum;
		
	}
	public static void gameDisplay( ) {
		System.out.println(">>ī�� ��Ȳ");
		deckDisplay(p1Deck,p1Index,"P1");
		System.out.println("p1����>>"+getsum(p1Deck,p1Index));
		deckDisplay(p2Deck,p2Index,"P2");
		System.out.println("p2����>>"+getsum(p2Deck,p2Index));
		
	}

	public static void createDeck() {
		// ī�����
		for (int i = 0; i < 52; i++) {
			deck[i] = i;
		}
	}

	// ī�弯��
	public static void mixDeck() {
    	Random rd=new Random();
		int rand;
		int temp;
		
		for(int i=0; i<10000; i++) {
			rand=rd.nextInt(52);  //���� �� �ֱ�
			temp=deck[0];
			deck[0]=deck[rand];
			deck[rand]= temp;
			
		}// P1 ī��ޱ�
	}

	public static void getP1Card() {
		if (p1Flag) {
			System.out.println("P1��, ī�带 �ްڽ��ϱ�? 0=no,1-yes");
			if (sc.nextLine().equals("0")) {
				p1Flag = false;
			}
			if (p1Flag) {// ī�� �޴� �۾�
				p1Deck[p1Index] = deck[deckIndex];
				deckIndex++;
				p1Index++;
			}
		}
	}
       //P2ī��ޱ�
	public static void getP2Card() {
		if (p2Flag) {
			System.out.println("P2��, ī�带 �ްڽ��ϱ�? 0=no,1-yes");
			if (sc.nextLine().equals("0")) {
				p2Flag = false;
			}
			if (p2Flag) {// ī�� �޴� �۾�
				p2Deck[p2Index] = deck[deckIndex];
				deckIndex++;
				p2Index++;
			}
		}
	}
    public static void deckDisplay(int deck[],int index,String title) {
    	//deckDisplay(); deck������ �迭�� ���
    	String cardShape[] = {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
    	String cardNumber[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    	System.out.print(title+":");
    	for(int i=0; i<index; i++) {
    		//ī���� ������ �ش� 0~3
    	    int cardSIndex=deck[i]/cardNumber.length; 
    		System.out.print(cardShape[cardSIndex]+",");
    		//ī����� ���� 0~12
    	    int cardNIndex=deck[i]%cardNumber.length; 
    		System.out.print(cardNumber[cardNIndex]+",");
    	
    }
    	System.out.println();
    }
    public static void deckDisplay() {
    	//deckDisplay(); deck������ �迭�� ���
    	String cardShape[] = {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
    	String cardNumber[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    	System.out.print("p1: ");
    	for(int i=0; i<p1Index; i++) {
    		//ī���� ������ �ش� 0~3
    	    int cardSIndex=p1Deck[i]/cardNumber.length; 
    		System.out.print(cardShape[cardSIndex]+",");
    	    int cardNIndex=p1Deck[i]%cardNumber.length; 
    		System.out.print(cardNumber[cardNIndex]+",");
    	
    }
    	  
    }
	public static void main(String[] args) {
		playGame();
	}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
