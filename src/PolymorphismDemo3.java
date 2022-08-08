import java.util.Date;

public class PolymorphismDemo3 {
	public static void main(String[] args) {
		Object obj = new String("Hello, world");
		System.out.println(obj.toString());
		obj = new Student();
		System.out.println(obj);
		obj = new Point(30, 60);
		System.out.println(obj);
		obj = new Integer(5);
		System.out.println(obj);
		obj = new Date();
		System.out.println(obj);
		
	}

}
