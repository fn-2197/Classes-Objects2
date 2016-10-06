
public class Employee {
private String name;
private double salary;
public Employee (String a, double s){
	name = a;
	salary = s;
}
public String getName(){
	return name;
}
public double getSalary(){
	return salary;
}
public void raiseSalary(double p){
	salary += salary * (p/100);
}





}
