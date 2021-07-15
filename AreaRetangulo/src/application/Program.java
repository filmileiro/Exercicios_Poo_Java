package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangles width and height: ");
		rec.width = input.nextDouble();
		rec.height = input.nextDouble();
		
		System.out.printf("AREa = %.2f%n", rec.diagonal());
		System.out.printf("PERIMETER = %.2f%n", rec.perimeter());
		System.out.printf("DIAGONAL: %.2f%n", rec.diagonal());
		
		
	input.close();
		
	}

}
