package application;
import entities.Circulos;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Circulos c = new Circulos();

        c.raio = input.nextDouble();
        c.imprimir();




        input.close();

    }
}
