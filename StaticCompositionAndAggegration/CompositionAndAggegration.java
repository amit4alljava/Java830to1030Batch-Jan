class Employee{
	Dept dept ;
	//static Employee e;
	Employee(Dept dept){
		System.out.println("Employee Comes");
		//dept = new Dept();
	}
	void print(){
		System.out.println("Employee Print Call");
	}
	@Override
	protected void finalize() {
	//	e = this;
		System.out.println("Gud Bye Employee ");
		//System.out.println("Gud Bye Employee "+this+" "+e);
	}
}
class Dept{
	Dept(){
		System.out.println("Dept Comes");
	}
	@Override
	protected void finalize() {
		System.out.println("Gud Bye Dept");
	}
}
public class CompositionAndAggegration {

	public static void main(String[] args) {
		Dept dept = new Dept();
		Employee ram = new Employee(dept);
		System.out.println("Ram "+ram);
		ram = null;
		System.gc();
		
		for(int i = 1; i<=10; i++){
			System.out.println("I is "+i);
		}
		//System.out.println("Employee "+Employee.e);
		//ram = Employee.e;
		//ram.print();
	}

}
