// POJO
public class Employee {
private int id;
private String companyName;
private String companyAddress;
private String name;
private String address;
private String phone;
private String email;
private double salary;
Employee(){
 companyName="TCS";
 companyAddress="Noida";
}
Employee(int id , String name, double salary){
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getCompanyAddress() {
	return companyAddress;
}
public void setCompanyAddress(String companyAddress) {
	this.companyAddress = companyAddress;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getId() {
	return id;
}









}
