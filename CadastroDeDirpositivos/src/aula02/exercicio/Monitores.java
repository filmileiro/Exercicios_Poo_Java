package aula02.exercicio;

public class Monitores {

    public static void main(String[] args) {
        //classe monitor sendo estanciada:
        Monitor m1 = new Monitor();
        m1.modelo = "Samsung";
        m1.polegadas = 25;
        m1.resolucao = 1080;
        m1.entrada = "hdmi";
        m1.taxa = 75;

        //aplicando os métodos:
        m1.imprimirStatus();
        m1.verificarCompatibilidade();

        System.out.println();

        //classe monitor sendo estanciada:
        Monitor m2 = new Monitor();
        m2.modelo = "LG ultrawide";
        m2.polegadas = 32;
        m2.resolucao = 1080;
        m2.entrada = "vga";
        m2.taxa = 140;

        //aplicando os métodos:
        m2.imprimirStatus();
        m2.verificarCompatibilidade();



    }

}
