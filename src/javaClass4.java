class Printer{
	private int numOfPaper=0;
	void print(int amount) {
		if(numOfPaper>amount) {
		   System.out.println(amount+"�� ����߽��ϴ�.");
		   numOfPaper-=amount;
		   System.out.println("���� "+numOfPaper+"�� ���ҽ��ϴ�.");
	    }else if(numOfPaper<amount){
	       System.out.println("��� ����Ϸ���"+(amount-numOfPaper)+"�� �����մϴ�");
	       System.out.println(numOfPaper+"�� ����մϴ�");
	       numOfPaper= 0;
	    }else if(numOfPaper==0){
	    	System.out.println("������ �����ϴ�.");
	    }
	}
}
                                                                                                                                               
public class javaClass4 {
			public static void main(String[] args) {
				//Ŭ���� ������ Ǯ���
				//�������� 1
				Printer a=new Printer();
				a.numOfPaper=100;
				a.print(70);
			}
}




