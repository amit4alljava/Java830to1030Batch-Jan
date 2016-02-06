
public class TestStudent {
// DRY - Don't Repeat YourSelf
	public static void main(String[] args) {
		//int x =100;
		Student ram = new Student();
	 //Student ram = new Student(1001,"Ram","MCA",99999);
	 //ram.takeInput(1001, "Ram", "Java", -9090);
	 /*ram.rollno =-1001;
	 ram.name = "Ram";
	 ram.course="Java";
	 ram.fees=-9090;
*/	 ram.print();
	 /*System.out.println(ram.rollno);
	 System.out.println(ram.name);
	 System.out.println(ram.course);
	 System.out.println(ram.fees);*/
Student shyam = new Student();
	 //Student shyam = new Student(1002,"Shyam","BTECH",44444);
	 //shyam.takeInput(1002, "Shyam", "AngularJS", 9090);
	 System.out.println("***********************************");
	 shyam.print();
	 /*System.out.println(shyam.rollno);
	 System.out.println(shyam.name);
	 System.out.println(shyam.course);
	 System.out.println(shyam.fees);*/
	 
	 //Student shyam = new Student();

	}

}
