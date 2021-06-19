package aula02.exercicio;

public class Monitor {

    String  modelo;
    int polegadas;
    int resolucao;
    String entrada;
    int taxa;

    void imprimirStatus(){

        System.out.println("Modelo: " + this.modelo);
        System.out.println("Polegadas: " + this.polegadas + " polegadas");
        System.out.println("Resolução: " + this.resolucao + "p");
        System.out.println("Taxa de atualização: " + this.taxa + "Hz";
        System.out.println("A entrada é hdmi ou vga? " + this.entrada);
    }

    void verificarCompatibilidade(){
        if (entrada .equals("hdmi")){
            System.out.println("Compatível com PS4");
        }else{
            System.out.println("Possui entrada compativel com PS2");
        }
    }

}
