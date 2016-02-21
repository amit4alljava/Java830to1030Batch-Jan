class OverloadingDemo
{
	/*void show(int x){
		System.out.println("int");
	}*/
  /*  void show(long x){
	System.out.println("long");
	}*/
    void show(short x){
    	System.out.println("short");
    	}
    void show(byte x){
    	System.out.println("byte");
    	}
  /*  void show(double x){
    	System.out.println("double");
    	}*/
    /*void show(Integer x){
    	System.out.println("Integer");
    	}*/
    /*void show(int... x){
    	System.out.println("int...");
    	}*/
}

class Calc{
	public double add(double x, double y){
		return x + y;
	}
	public float add(float x, float y){
		return x + y;
	}
	/*public int add(int x, int y){
		return x + y;
	}
	public int add(int x, int y,int z){
		return x + y;
	}*/
	// Java 1.5 VAR-ARGS
	public int add(int ...x){
		int sum  = 0;
		// Enhance For Loop (Java 1.5)
		for(int t : x){
			sum = sum + t;
		}
		return sum;
	}
}
public class TypePromotion {

	public static void main(String[] args) {
		OverloadingDemo o = new OverloadingDemo();
		o.show((byte)1);
		
		/*Calc obj = new Calc();
		System.out.println(obj.add(100, 200));
		System.out.println(obj.add(100,200,300));
		System.out.println(obj.add());
		System.out.println(obj.add(100,200,300,50,78,44,33,22));
		
		int r = 100;
		Integer r1 = 100;
		//Integer r2 = new Integer(100);
		Integer r2 = 100;
		if(r1.equals(r2)){
			System.out.println("Same Value");
		}
		else
		{
			System.out.println("Not Same Value");
		}
		if(r1==r2){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}*/
		

	}

}
