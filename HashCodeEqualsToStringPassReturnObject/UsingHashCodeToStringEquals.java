class Customer{
	private int id;
	private String name;
	Customer(int id , String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode(){
		return name.length();
	}
	@Override
	public boolean equals(Object o){
		Customer c = (Customer)o;
		if(this.id==c.id && this.name.equals(c.name)){
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}

public class UsingHashCodeToStringEquals {

	public static void main(String[] args) {
		String x = new String("Hello");
		Customer ram = new Customer(1001,"Ram");
		Customer ram2 = new Customer(1002,"Ram");
		if(ram.equals(ram2)){
			System.out.println("Same Value");
			
		}
		else{
			System.out.println("Not Same Value");
		}
		Customer mike = new Customer(1002,"Mike");
		Customer tom = new Customer(1003,"Tom");
		System.out.println(ram.hashCode());
		System.out.println(mike.hashCode());
		System.out.println(tom.hashCode());
		System.out.println(x.toString());
		System.out.println(ram.toString());
		System.out.println(mike);
		System.out.println(tom);

	}

}
