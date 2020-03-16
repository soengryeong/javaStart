
public class java03061 {

	public static void main(String[] args) {
		// 지그재그 숫자 출력하기 for문으로만 풀기
		// 짝수 줄 가장 큰 수 구하기
		// 카운트 수 6+라인수 5-1

		
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
