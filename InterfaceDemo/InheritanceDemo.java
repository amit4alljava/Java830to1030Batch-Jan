import java.awt.event.WindowAdapter;

interface X1
{
	void print();
	void show();
}
interface X2{
	void print();
	void disp();
}
interface X3 extends X1, X2{
	
}
class X4 implements X3{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InheritanceDemo {

	public static void main(String[] args) {
		
	}

}
