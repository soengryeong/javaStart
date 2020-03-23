package com.human.ex;

import java.util.Random;
import java.util.Scanner;

public class blackjakPratice {
	public static int deckindex = 0; // 다음 사용할 카드인덱스
	// p1
	public static int p1Deck[] = new int[10]; // p1의 카드목록
	public static int p1Index = 0; // p1의 카드 목록에 인덱스
	public static boolean P1Flag = true; // P1이 카드를 받을 건지 안받을건지
	// p2
	public static int p2Deck[] = new int[10]; // p2의 카드목록
	public static int p2Index = 0; // p1의 카드 목록에 인덱스
	public static boolean P2Flag = true; // P2이 카드를 받을 건지 안받을건지

	public static Scanner sc = new Scanner(System.in);
	// 카드생성
	public static int deck[] = new int[52];

	public static void createDeck() {
		for (int i = 1; i < 52; i++) {
			deck[i] = i;
		}
	}

	// 카드 섞기
	public static void mixDeck() {
		Random rd = new Random();
		int rand;
		int temp;
		
		for(int i=0; i<10000; i++) {
			rand = rd.nextInt(52); //변수 rand에 랜섬수 52넣음.
			temp = deck[0];
			deck[0] = deck[rand];
			deck[rand]= temp;
			
			
		}
	}

	public static void main(String[] args) {

	}

}
