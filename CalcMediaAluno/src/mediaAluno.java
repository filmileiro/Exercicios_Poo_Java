public class mediaAluno {

    /*Declarando os atributos da classe*/
    String nome;
    double a;
    double b;

    /*Método para calcular a média*/
    public double media(){
        return ((a * 3.5) + (b * 7.5)) / 11.0;
    }

    /*Método condicional para verificar se o aluno foi reprovado ou não*/
    void status(){
        if (media() <= 5.0){
            System.out.println("Aluno Repovado.");
        }else System.out.println("Aluno Aprovado.");
    }

    /*Método para imprimir nome e média do aluno*/
    void ImprimeNomeEStatus(){

        System.out.println("Seu nome é: " + this.nome);
        System.out.printf("Sua média é: %.5f\n", this.media());

    }



}
