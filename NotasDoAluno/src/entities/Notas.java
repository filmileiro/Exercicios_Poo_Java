package entities;

public class Notas {

    public double n1, n2, n3, n4;

    public double media(){
        return ((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + (n4 * 1.0)) / 10.0;
    }

}
