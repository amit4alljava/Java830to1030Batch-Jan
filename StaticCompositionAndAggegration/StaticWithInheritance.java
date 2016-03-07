class P
{
	{
		System.out.println("P Init Block");
	}
	{
		System.out.println("P Init Block2");
	}
	P(){
		System.out.println("P Cons Call");
	}
	static{
		System.out.println("P Static Block");
	}
}
class C extends P{
	{
		System.out.println("C Init Block");
	}
	{
		System.out.println("C Init Block2");
	}
	C(){
		System.out.println("C Cons Call");
	}
	static{
		System.out.println("C Static Block");
	}
}
public class StaticWithInheritance {

	public static void main(String[] args) {
		C obj = new C();

	}

}
