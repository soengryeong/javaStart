class ShoppingOrder{
	String orderNum = "201803120001";
	String orderId = "abc123";
	String orderDate = "2018년 3월 12일";
	String name = "홍길동";
	String orderCode = "PD0345-12";
	String orderAddress = "서울시 영등포구 여의도동 20번지";
}
public class javaClass2 {

	public static void main(String[] args) {
		ShoppingOrder so1 = new ShoppingOrder();
	    System.out.println("주문번호:"+so1.orderNum);
	    System.out.println("주문아이디:"+so1.orderId);
	    System.out.println("주문날짜:"+so1.orderDate);
	    System.out.println("주문성함:"+so1.name);
	    System.out.println("주문상품번호:"+so1.orderCode);
	    System.out.println("주문자주소:"+so1.orderAddress);

	}

}
