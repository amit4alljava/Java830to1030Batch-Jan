class RR
{
	static void show(){
		System.out.println("RR Show");
	}
}
class WW extends RR{
	//@Override
	static void show(){
		System.out.println("WW Show");
	}
}
public class StaticDemoOverride {

	public static void main(String[] args) {
		WW obj = new WW();
		WW.show();

	}

}
