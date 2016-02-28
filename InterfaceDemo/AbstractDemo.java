class T
{
	int a;
	final int b;
	T(){
		b=200;
	}
}
/*class A
{
	A(int x){
		System.out.println("A Class Cons");
		
	}
}
class B extends A{
	B(){
		super();
	}
}*/
abstract class Loan
{
void applyForLoan(){	
	System.out.println("Apply For Loan");
}
abstract void emi();
}
class HomeLoan extends Loan
{
	void emi(){
		System.out.println("Home Loan EMI for 10 Years");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		//B obj = new B();
	}

}
