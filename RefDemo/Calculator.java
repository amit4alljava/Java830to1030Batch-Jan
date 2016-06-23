// Calculator logic 
// It contain only pure logic 
public class Calculator {
public int anotherfunction(double ...y){	
	for(double z : y){
		System.out.println("Z is "+z);
	}
	return 100;
}
	
public int add(int ...x){
	int sum = 0;
	for(int y : x){
		sum = sum + y;
	}
	return sum;
			
}
public int subtract(int ...x){
	int sum = 0;
	for(int y : x){
		sum = y - sum;
	}
	return sum;
}
public int multiply(int ...x){
	int sum = 1;
	for(int y : x){
		sum = sum * y;
	}
	return sum;
}
public int divide(int ...x){
	int sum = 1;
	for(int y : x){
		sum = sum / y;
	}
	return sum;
}
}
