
class Person{
	int age = 40;
	String name = "James";
    boolean isMarried = true;
	int children = 3;
}
public class javaClass {
    
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("�̸�:"+p1.name);
		System.out.println("��ȥ����:"+p1.isMarried);
		System.out.println("�ڳ��:"+p1.children);
	}
}
