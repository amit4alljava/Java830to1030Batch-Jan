
public class Calculator {
	// Overloading
	// method name same but arguments different
public int add(int x, int y){
	
	return x + y;
}
public int add(String x, String y){
	int a = 0, b= 0;
	try{
		Thread.sleep(2000);
		a = Integer.parseInt(x);
		
	}
	catch(Exception e){
		a = 0;
	}
	try{
		b = Integer.parseInt(y);
	}
	catch(Exception e){
		b = 0;
	}
	return a + b;
	}
}
