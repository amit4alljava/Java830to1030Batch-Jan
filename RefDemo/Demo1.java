import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

 class A
{
	A(){
		System.out.println("A Cons Call");
	}
	void print(){
		System.out.println("A Print Call");
	}
}
class B {
	B(){
		System.out.println("B Cons Call");
	}
	void disp(){
		System.out.println("B Disp Call");
	}
}
public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// Eager Way
		// Class Resolve on Compile time
		//A obj = new A(); // Static Code
		// Dynamic Code
		System.out.println("Enter the Class Name");
		Scanner scanner =new Scanner(System.in);
		String className = scanner.next();
		// Class.forName() This is used to load a class dynamically
		// Class.forName(className).newInstance(); object create
		Object obj = Class.forName(className).newInstance(); // Lazy Way
		// Class Resolve on Runtime 
		System.out.println("Enter the Method Name");
		String methodName = scanner.next();
		// Bring the method from class
		Method method = obj.getClass().getDeclaredMethod(methodName);
		method.invoke(obj);  // call the method with object
	}

}
