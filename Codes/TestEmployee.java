import java.util.ArrayList;


public class TestEmployee {

	public static void main(String[] args) throws Exception{
		ArrayList list = new ArrayList();
		System.out.println("Code Start....");
		while(true){
			Employee e = new Employee();
			list.add(e);
			Thread.sleep(50);
		}
		/*Employee a = new Employee();
		Employee b = new Employee();
		b = a;
		if(100>20){
			Employee shyam = new Employee();  // Automatic GC, Scope of Object
		}
		Employee ram = new Employee(1001,"Ram",9090);
		ram.setSalary(ram.getSalary()+1000);
		System.out.println("Ram Salary "+ram.getSalary());
		ram.setPhone("2222");
		System.out.println("Ram Phone "+ram.getPhone());
		ram = null; // When no one is pointing the object
*/	}

}
