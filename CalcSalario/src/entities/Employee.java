package entities;

public class Employee {

	public String name;
	public double grosSalary;
	public double tax;
	
	
	public double netSalary() {
		return grosSalary - tax;
	}
	public void increaseSalary(double percentage) {
		grosSalary = grosSalary + grosSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary()); 
	}
	
	
}
