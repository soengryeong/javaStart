
public class java03061 {

	public static void main(String[] args) {
		// ������� ���� ����ϱ� for�����θ� Ǯ��
		// ¦�� �� ���� ū �� ���ϱ�
		// ī��Ʈ �� 6+���μ� 5-1

		
			int lineMax = 0;
			int lineRev= 0;
		
			for (int i = 0; i < 25; i++) {
			if (i % 5 == 0) {
				System.out.println("");
				lineMax=i+5;
				lineRev++;
			
			}
			
			if(lineRev%2!=0) {
			    System.out.print("\t" + (i + 1));
			}else {
				System.out.print("\t"+(lineMax-i%5));
			}
		}

	}

}
