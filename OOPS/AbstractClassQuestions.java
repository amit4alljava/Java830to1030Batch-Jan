abstract class E
{
	E(){
		System.out.println("E Class Cons Call");
	}
}
class E2 extends E
{
	E2(){
		super();
		System.out.println("E2 Class Cons");
	}
}
public class AbstractClassQuestions {

	public static void main(String[] args) {
		E2 obj = new E2();

	}

}
