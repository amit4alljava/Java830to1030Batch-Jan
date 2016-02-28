// SAM - SingleAbstract Method Interface
@FunctionalInterface
interface P
{
	void print();
	//void display();
}
@FunctionalInterface
interface Calc{
	public int calculation(int a , int b);
}
/*
 * Class 
 * @author
 * @since
 */
// 1st Way
class P1 implements P{
	public void print(){
		System.out.println(" P1 Print");
	}
}
public class InterfaceUse {

	public static void main(String[] args) {
		/*Calc c1 =(a,b)->a+b;
		Calc c2 =(a,b)->a-b;
		System.out.println("Add is "+c1.calculation(100,200));
		System.out.println("Subtract is "+c2.calculation(1000,200));
		P obj = ()->{
			System.out.println("Lambda Print");
			System.out.println("Lambda Print");
		};
		obj.print();*/
		//P1 obj = new P1();
		//obj.print();*/
		if(100>20){
			//2nd Approach
		P obj = new P(){
			public void print(){
				this.show();
				System.out.println("Anonymous Print Call");
			}
			public void show(){
				System.out.println("Anonymous Show");
			}
		};
		obj.print();
		
		P obj2 = new P(){
			public void print(){
				this.show();
				System.out.println("Anonymous Print Call");
			}
			public void show(){
				System.out.println("Anonymous Show");
			}
		};
		obj2.print();
		
		//obj.show();
		}
	}

}
