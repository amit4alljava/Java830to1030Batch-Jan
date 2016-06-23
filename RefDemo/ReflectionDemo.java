import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

class P1
{
	int x,y;
	private int z;
	static int w;
	private P1(){
		System.out.println("P1 Cons , I will call when object is created...");
	}
	static {
		System.out.println("I will call when class is loaded..");
	}
}
public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		int privateCount = 0;
		int publicCount = 0;
		int protectedCount = 0;
		int finalCount = 0;
		int staticCount = 0;
		//Class cls = java.lang.System.class;
		System.out.println("Enter the Class Name to Scan");
		Scanner scanner = new Scanner(System.in);
		String className =scanner.next();
		Object object = Class.forName(className).newInstance();
		Class cls  = object.getClass();
		System.out.println("Enter the Method Name to Call");
		String methodName = scanner.next();
		Method method = cls.getDeclaredMethod(methodName);
		method.setAccessible(true);
		method.invoke(object);
		/*Test t = new Test();
		t.callMe();*/
		//P1 obj = new P1();
		//Class cls = obj.getClass();
		System.out.println("Enter the Field Name ");
		String fieldName = scanner.next();
		Field fieldD = cls.getDeclaredField(fieldName);
		fieldD.setAccessible(true);
		System.out.println("Field value is "+fieldD.get(object));  // obj.d
		
		System.out.println("VALUE OF D is ");
		System.out.println("No of Fields are "+cls.getDeclaredFields().length);
		for(Field f : cls.getDeclaredFields()){
			if(Modifier.isPrivate(f.getModifiers())){
				privateCount++;
			}
			if(Modifier.isProtected(f.getModifiers())){
				protectedCount++;
			}
			if(Modifier.isFinal(f.getModifiers())){
				finalCount++;
			}
			if(Modifier.isPublic(f.getModifiers())){
				publicCount++;
			}
			
			if(Modifier.isStatic(f.getModifiers())){	
				staticCount++;
			}
		}
		System.out.println("No of Static Variables are "+staticCount);
		System.out.println("No of Private Variables are "+privateCount);
		System.out.println("No of Protected Variables are "+protectedCount);
		System.out.println("No of public Variables are "+publicCount);
		System.out.println("No of final Variables are "+finalCount);
		

	}

}
