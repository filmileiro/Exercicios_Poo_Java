package entities;

public class TriagleOrTrapezoid {
    /*Se a soma dos dois menores número forem  maior
    que um terceiro número esses números forma um triângulo*/

    public double a, b, c;

    public double perimetro(){
        return a + b + c;
    }

    public double area(){
        return ((a + b) * c) / 2;
    }

    }


