// ProtoType (What to do)
//100 % Abstract 
// abstract methods + Constants
abstract interface Calc1{
	final int MIN_VALUE = 0;
	public abstract int add(int x, int y);
	public abstract int subtract (int x, int y);
}
// How to do
class MathCalc implements Calc1{
	@Override
	public int add(int x  , int y){
		int z = 0;
		if(x>MIN_VALUE && y>MIN_VALUE){
			z = x + y;
		}
		return z;
	}

	@Override
	public int subtract(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	};
	}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
