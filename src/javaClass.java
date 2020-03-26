
class Person{
	int age = 40;
	String name = "James";
    boolean isMarried = true;
	int children = 3;
}
public class javaClass {
    
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("ÀÌ¸§:"+p1.name);
		System.out.println("°áÈ¥¿©ºÎ:"+p1.isMarried);
		System.out.println("ÀÚ³à¼ö:"+p1.children);
	}
}
