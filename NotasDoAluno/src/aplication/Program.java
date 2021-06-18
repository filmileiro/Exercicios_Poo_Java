package aplication;

import entities.Notas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Notas n;
        n = new Notas();


        n.n1 = sc.nextDouble();
        n.n2 = sc.nextDouble();
        n.n3 = sc.nextDouble();
        n.n4 = sc.nextDouble();
        double n5;
        double exame;

        double mediaFinal = n.media();

        System.out.println();
        System.out.println("Media " + mediaFinal);


        if (mediaFinal >= 7.0) {
            System.out.println(mediaFinal);
            System.out.println("Aluno aprovado.");
        } else if (mediaFinal >= 5.0 && mediaFinal <= 6.9) {
            System.out.println("Media: " + mediaFinal);
            System.out.println("Aluno em exame.");
            n5 = sc.nextDouble();
            System.out.println("Nota do exame: " + n5);
            exame = (n5 + mediaFinal) / 2.0;
            if (exame >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.println("media final: " + exame);

        } else if (mediaFinal < 5.0) {
            System.out.println("Aluno Reprovado.");
        }


        sc.close();


    }
}
