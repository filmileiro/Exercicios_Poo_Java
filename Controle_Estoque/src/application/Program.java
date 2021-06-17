package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products products = new Products();

        /*pegando atribudo da classe Products*/

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        products.name = sc.nextLine();
        System.out.println("Price: ");
        products.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        products.quantity = sc.nextInt();


        System.out.println();
        System.out.println ("Product data: " + products);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        products.addProducts(quantity);

        System.out.println();
        System.out.println ("Product data: " + products);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock:");
        quantity = sc.nextInt();
        products.removeProduct(quantity);

        System.out.println();
        System.out.println ("Product data: " + products);
        
        sc.close();
    }
}
