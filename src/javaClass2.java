class ShoppingOrder{
	String orderNum = "201803120001";
	String orderId = "abc123";
	String orderDate = "2018�� 3�� 12��";
	String name = "ȫ�浿";
	String orderCode = "PD0345-12";
	String orderAddress = "����� �������� ���ǵ��� 20����";
}
public class javaClass2 {

	public static void main(String[] args) {
		ShoppingOrder so1 = new ShoppingOrder();
	    System.out.println("�ֹ���ȣ:"+so1.orderNum);
	    System.out.println("�ֹ����̵�:"+so1.orderId);
	    System.out.println("�ֹ���¥:"+so1.orderDate);
	    System.out.println("�ֹ�����:"+so1.name);
	    System.out.println("�ֹ���ǰ��ȣ:"+so1.orderCode);
	    System.out.println("�ֹ����ּ�:"+so1.orderAddress);

	}

}
