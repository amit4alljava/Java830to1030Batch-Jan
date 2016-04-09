class Customer{
	private int id;
	private String name;
	private String city;
	Customer(int id, String name, String city){
		this.id = id;
		this.name = name;
		this.city = city;
	}
	// toString will print meaning ful 
	//object instead of printing the classname@hashCode
	
	@Override
	public String toString(){
		return "Id "+id+" Name "+name+" City "+city;
	}
}
public class ObjectPrintDemo {

	public static void main(String[] args) {
		Customer ram = new Customer(1001,"Ram","Delhi");
		System.out.println(ram);
		System.out.println(ram.toString());

	}

}
