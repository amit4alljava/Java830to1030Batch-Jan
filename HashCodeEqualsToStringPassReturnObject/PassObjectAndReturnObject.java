import java.util.Scanner;
class Dept
{
	private int deptNo;
	private String deptName;
	private String managerName;
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
}
class Allocate
{
	Dept allocateDept(Employee emp){
		emp.setSalary(emp.getSalary()+1000);
		Dept dept = new Dept();
		dept.setDeptName("IT");
		dept.setDeptNo(1001);
		dept.setManagerName("John");
		return dept;
	}
	double salaryIncrement(double salary){
		salary = salary + 1000;
		return salary;
	}
}
class Person{
	
}
class Employee extends Person
{
	private int id;
	private String name;
	private double salary;
	private double grossSalary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
}
public class PassObjectAndReturnObject {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Empno");
		int empno = scanner.nextInt();
		System.out.println("Enter the Name");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter the Salary ");
		double salary = scanner.nextDouble();
		Employee emp = new Employee();
		emp.setId(empno);
		emp.setName(name);
		emp.setSalary(salary);
		Allocate allocate = new Allocate();
		Dept dept = allocate.allocateDept(emp);
		System.out.println("Now New Salary is "+emp.getSalary());
		System.out.println(dept);
		System.out.println(emp);
		
		/*System.out.println("Dept Id "+dept.getDeptNo()
				+" Dept Name "+dept.getDeptName()
				+" Dept Manager "+dept.getManagerName());*/
		double newSalary =allocate.salaryIncrement(emp.getSalary());
		System.out.println("New Salary "+newSalary
				+" Old Salary "+emp.getSalary());
	}

}






