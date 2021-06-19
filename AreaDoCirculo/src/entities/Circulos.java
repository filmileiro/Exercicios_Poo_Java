package entities;

public class Circulos {

    public double raio;
    double pi = 3.14159;

    public double area(){

        return pi * Math.pow(raio,2);

    }

    public void imprimir(){
        System.out.printf("A area do círculo %.4f\n", this.area());
    }







}
