import java.util.Scanner;
import java.util.Random;

public class Java0316 {

	public static void main(String[] args) {
		// 10번안에 숫자 맞추는 게임 
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int RandomNumber = rd.nextInt(10);
		boolean isOk=false;
		
		for(int i=0;i<11;i++) {
		System.out.println("0~9까지 숫자를 입력하세요");
		System.out.println("["+i+"번째 도전]");
		int userNumber = Integer.parseInt(sc.nextLine());
		if(RandomNumber>userNumber) {
			
			System.out.println(userNumber+"더 큰 수 입니다.");
			
		}else if(RandomNumber==userNumber) {
			
			System.out.println(i+"번째 정답입니다.");
			isOk = true;
			break;
		}else {
			System.out.println(userNumber+"더 작은 수 입니다.");
		}
		}
		if(isOk==false) {
			System.out.println("10번안에 맞추지 못했습니다.");
		}
	}

}
