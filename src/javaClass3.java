import java.util.Scanner;

public class javaClass3 {
class Printer{
	Scanner re = new Scanner(System.in);
	Printer p1 = new Printer();
	
	int numOfpapers = 100;
	void print(int amount) {

		System.out.println("���� �����ִ� ���̴�"+p1.numOfpapers+"�Դϴ�.");
		System.out.println("����ϰ��� �ϴ� ���� ���� �Է����ּ���"
				+ "(1:10��, 2:50��, 3:70��):");
		int num1 = re.nextInt();
		switch(num1) {
		case 1:
			int a = p1.numOfpapers;
			int b = num1;
			int sum = a-b;
			System.out.println("����� ���̴�"+sum+"���Դϴ�.");
		case 2:
			int a1 = p1.numOfpapers;
			int b1 = num1;
			int sum1 = a1-b1;
			System.out.println("����� ���̴�"+sum1+"���Դϴ�.");
		case 3:
			int a2 = p1.numOfpapers;
			int b2= num1;
			int sum2 = a2-b2;
			System.out.println("����� ���̴�"+sum2+"���Դϴ�.");
		default :
			System.out.println("�߸��Է��ϼ̽��ϴ�");
			System.out.println("�ٽ� �Է����ּ���.");
			return;
		}	
	}	
}
	public static void main(String[] args) {
	
	
}
}



