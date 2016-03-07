class TT{
	interface B{
		void show();
	}
	class MM implements B{
		public void show(){
			System.out.println("MM Show");
		}
	}
	class TTT extends MM{
		class QQ{
			
		}
	}
}
class Outer{
	private int x;
	Outer(){
		x = 100;
		System.out.println("Outer Class Cons");
	}
	class Inner{
		private int x;
		Inner(){
			x = 200;
			System.out.println("Inner Class Cons");
		}
		void show(int x){
			int z = Outer.this.x + this.x + x;
			System.out.println("Inner Show "+z);
		}
	}
}
 
public class InnerClassDemo {

	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.show(300);
		/*Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();*/

	}

}
