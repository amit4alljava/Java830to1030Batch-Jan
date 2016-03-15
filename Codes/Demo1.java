
public class Demo1 {

	public static void main(String[] args) {
		//StringBuilder sb = new StringBuilder();
		StringBuffer sb = new StringBuffer();
		//sb.append("Hello How are you");
		
		sb.append("Hello This is StringBuffer Testing for very large String value");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		String x = "Hello";
		String y = "Hello";
		String c = new String("Hello");
		String d = new String("hello");
		// Value Compare
		if(x.equalsIgnoreCase(d)){
		//if(x.equals(c)){
			System.out.println("Value Same");
		}
		else
		{
			System.out.println("Value not Same");
		}
		
		// Reference Compare
		if(x==c){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}

	}

}
