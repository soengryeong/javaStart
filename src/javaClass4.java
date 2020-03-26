class Printer{
	private int numOfPaper=0;
	void print(int amount) {
		if(numOfPaper>amount) {
		   System.out.println(amount+"장 출력했습니다.");
		   numOfPaper-=amount;
		   System.out.println("현재 "+numOfPaper+"장 남았습니다.");
	    }else if(numOfPaper<amount){
	       System.out.println("모두 출력하려면"+(amount-numOfPaper)+"장 부족합니다");
	       System.out.println(numOfPaper+"만 출력합니다");
	       numOfPaper= 0;
	    }else if(numOfPaper==0){
	    	System.out.println("용지가 없습니다.");
	    }
	}
}
                                                                                                                                               
public class javaClass4 {
			public static void main(String[] args) {
				//클래스 스스로 풀어보기
				//도전과제 1
				Printer a=new Printer();
				a.numOfPaper=100;
				a.print(70);
			}
}




