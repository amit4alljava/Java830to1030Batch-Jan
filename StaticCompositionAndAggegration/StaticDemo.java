import java.util.Scanner;

class A
{
	int b; // Instance Variable
	static int c;  // Class Variable
	static{
		System.out.println("I am Call When Class is Loaded..."+c);
		//System.out.println(b);
	}
	A(){
		b++;
		c++;
		System.out.println("I am Constructor B is "+b+" and C is "+c);
	}
}
class E
{
	static{
		System.out.println("I am E Class Static Block");
	}
	E(){
		System.out.println("I am E Class Constructor");
	}
}
public class StaticDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// this is lazy class loading
		System.out.println("Enter the Class Name");
		Scanner scanner = new Scanner(System.in);
		String className = scanner.next();
		Object o = Class.forName(className).newInstance();  // this will only load the class
		
		// Eager Way 
		//A obj1 = new A();
		/*// Class Load + Object Create
		A obj1 = new A();
		// Object Create
		A obj2 = new A();
		System.out.println(A.c);*/

	}

}
