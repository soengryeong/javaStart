import java.util.Scanner;

public class javaClass3 {
class Printer{
	Scanner re = new Scanner(System.in);
	Printer p1 = new Printer();
	
	int numOfpapers = 100;
	void print(int amount) {

		System.out.println("현재 남아있는 종이는"+p1.numOfpapers+"입니다.");
		System.out.println("출력하고자 하는 종이 수를 입력해주세요"
				+ "(1:10장, 2:50장, 3:70장):");
		int num1 = re.nextInt();
		switch(num1) {
		case 1:
			int a = p1.numOfpapers;
			int b = num1;
			int sum = a-b;
			System.out.println("출력한 종이는"+sum+"장입니다.");
		case 2:
			int a1 = p1.numOfpapers;
			int b1 = num1;
			int sum1 = a1-b1;
			System.out.println("출력한 종이는"+sum1+"장입니다.");
		case 3:
			int a2 = p1.numOfpapers;
			int b2= num1;
			int sum2 = a2-b2;
			System.out.println("출력한 종이는"+sum2+"장입니다.");
		default :
			System.out.println("잘못입력하셨습니다");
			System.out.println("다시 입력해주세요.");
			return;
		}	
	}	
}
	public static void main(String[] args) {
	
	
}
}



