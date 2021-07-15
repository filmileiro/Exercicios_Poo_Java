package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = input.nextLine();
		
		System.out.println("Gross salary ");
		employee.grosSalary = input.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = input.nextDouble();
		
		System.out.println();
		System.out.println("Emplyee: " + employee);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = input.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data " + employee);
		
		
		
		
		input.close();
		
	}

}
