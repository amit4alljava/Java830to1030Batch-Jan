class Emp{
	int id; // Instance Variables
	String name;
	double salary;
	static int counter; // Class Variable
	Emp(int id , String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		counter++;
		System.out.println("Counter is "+counter);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		Emp ram =new Emp(1001,"Ram",9999);
		Emp shyam =new Emp(1002,"Shyam",9999);

	}

}
