import java.util.Scanner;
import java.util.Random;

public class Java0316 {

	public static void main(String[] args) {
		// 10���ȿ� ���� ���ߴ� ���� 
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int RandomNumber = rd.nextInt(10);
		boolean isOk=false;
		
		for(int i=0;i<11;i++) {
		System.out.println("0~9���� ���ڸ� �Է��ϼ���");
		System.out.println("["+i+"��° ����]");
		int userNumber = Integer.parseInt(sc.nextLine());
		if(RandomNumber>userNumber) {
			
			System.out.println(userNumber+"�� ū �� �Դϴ�.");
			
		}else if(RandomNumber==userNumber) {
			
			System.out.println(i+"��° �����Դϴ�.");
			isOk = true;
			break;
		}else {
			System.out.println(userNumber+"�� ���� �� �Դϴ�.");
		}
		}
		if(isOk==false) {
			System.out.println("10���ȿ� ������ ���߽��ϴ�.");
		}
	}

}
