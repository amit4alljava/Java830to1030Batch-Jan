interface E
{
	void print();
	default void show(){
		System.out.println("E Show");
	}
}
interface EE{
	default void show(){
		System.out.println("EE Show");
	}
}
class E1 implements E,EE
{
	@Override
	public void show(){
		System.out.println("E1 SHow Call");
		E.super.show();
		EE.super.show();
	}
	public void print(){
		System.out.println("E1 Print");
	}
}
public class InterfaceDemo2 {
public static void main(String[] args) {
	E1 obj = new E1();
	obj.print();
	obj.show();
}
}
