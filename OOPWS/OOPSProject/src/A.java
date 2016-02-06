class T{
	T(){
		System.out.println("This is Default Cons");
	}
	T(int x){
		this();
		System.out.println("This is ONe Param Cons "+x);
	}
	T(int x,int y){
		this();
		//this(x);
		System.out.println("This is Two Param Cons "+x +" "+y);
	}
}

public class A {

	public static void main(String[] args) {
		T obj1 = new T(77,88);
		T obj2 = new T(77,88);

	}

}
