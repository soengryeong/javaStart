package com.human.ex;

import java.util.Random;
import java.util.Scanner;

public class blackjakPratice {
	public static int deckindex = 0; // ���� ����� ī���ε���
	// p1
	public static int p1Deck[] = new int[10]; // p1�� ī����
	public static int p1Index = 0; // p1�� ī�� ��Ͽ� �ε���
	public static boolean P1Flag = true; // P1�� ī�带 ���� ���� �ȹ�������
	// p2
	public static int p2Deck[] = new int[10]; // p2�� ī����
	public static int p2Index = 0; // p1�� ī�� ��Ͽ� �ε���
	public static boolean P2Flag = true; // P2�� ī�带 ���� ���� �ȹ�������

	public static Scanner sc = new Scanner(System.in);
	// ī�����
	public static int deck[] = new int[52];

	public static void createDeck() {
		for (int i = 1; i < 52; i++) {
			deck[i] = i;
		}
	}

	// ī�� ����
	public static void mixDeck() {
		Random rd = new Random();
		int rand;
		int temp;
		
		for(int i=0; i<10000; i++) {
			rand = rd.nextInt(52); //���� rand�� ������ 52����.
			temp = deck[0];
			deck[0] = deck[rand];
			deck[rand]= temp;
			
			
		}
	}

	public static void main(String[] args) {

	}

}
