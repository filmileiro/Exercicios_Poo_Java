package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Student est = new Student();
		est.name = input.nextLine();
		est.grade1 = input.nextDouble();
		est.grade2 = input.nextDouble();
		est.grade3 = input.nextDouble();
		System.out.println();
		System.out.printf("Name: %s%n", est.name);
		
		
		if (est.finalGrade() < 60.0) {
			System.out.println("FINAL GRADE: " + est.finalGrade());
			System.out.println("FALED");
			System.out.printf("MISSING %.2f POINTS", est.missingPoints());
		}else {
			System.out.println("FINAL GRADE: " + est.finalGrade());
			System.out.println("PASS");
		}
		
		
		
		
		
		input.close();
	}

}
