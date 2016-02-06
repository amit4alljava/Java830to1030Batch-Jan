import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCalc {
	@Test
	public void testAddTwoNumbers(){
		int expectedResult = 30;
		Calculator obj = new Calculator();
		int result = obj.add(10,20);
		Assert.assertEquals(result, expectedResult);
	}
	@Test(timeOut=1000)
	public void testAddTwoStringNumbers(){
		int expectedResult = 0;
		Calculator obj = new Calculator();
		int result = obj.add("ten","twenty");
		Assert.assertEquals(result, expectedResult);
	}
	/*public static void main(String[] args) {
		int x = Integer.parseInt("ten");
		System.out.println(x);
	}*/
	/*public static void main(String[] args) {
		// Case -1
		Calculator obj = new Calculator();
		int result = obj.add(10,20);
		if(result==30){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
		//System.out.println(result);

	}*/

}
