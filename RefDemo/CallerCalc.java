import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

// View Data Pass to Logic 
public class CallerCalc {
	
	public static int callCalc(String operationName,double ...x) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		Object object = Class.forName("Calculator").newInstance();
		Method methods[] = object.getClass().getDeclaredMethods();
		Object result = null;
		for(Method m : methods){
			if(m.getName().equals(operationName)){
				Method method = object.getClass().getDeclaredMethod(operationName,m.getParameterTypes());
				System.out.println("Param Type "+m.getParameterTypes()[0]);
				//if(m.getParameterTypes()[0]==)
				result = method.invoke(object, x);
				 break;
			}
		}
		
		
				
		//Method method = object.getClass().getDeclaredMethod(operationName, int[].class);
		//Object result = method.invoke(object, x);
		return Integer.parseInt(result.toString());
	}

	public static int callCalc(String operationName,int ...x) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		Object object = Class.forName("Calculator").newInstance();
		Method methods[] = object.getClass().getDeclaredMethods();
		Object result = null;
		for(Method m : methods){
			if(m.getName().equals(operationName)){
				Method method = object.getClass().getDeclaredMethod(operationName,m.getParameterTypes());
				System.out.println("Param Type "+m.getParameterTypes()[0]);
				//if(m.getParameterTypes()[0]==)
				result = method.invoke(object, x);
				 break;
			}
		}
		
		
				
		//Method method = object.getClass().getDeclaredMethod(operationName, int[].class);
		//Object result = method.invoke(object, x);
		return Integer.parseInt(result.toString());
	}
	
}
