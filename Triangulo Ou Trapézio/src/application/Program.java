package application;
import entities.TriagleOrTrapezoid;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double p;
        double a;


        TriagleOrTrapezoid v;
        v = new TriagleOrTrapezoid();

        v.a = input.nextDouble();
        v.b = input.nextDouble();
        v.c = input.nextDouble();

        if (v.a < (float)(v.b + v.c) && (v.b < (float)(v.a + v.c) && v.c < (float)(v.b + v.a))){
            p = v.perimetro();
            System.out.printf("Perimetro = %.1f", p);
        }else{
            a = v.area();
            System.out.println(a);
        }

        input.close();

    }

}
