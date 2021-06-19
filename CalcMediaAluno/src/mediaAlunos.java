/*Exercício feito com base no exercício 1005 do URI judge*/

import java.util.Locale;
import java.util.Scanner;

public class mediaAlunos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        /*Instanciando o objeto Aluno*/
        mediaAluno a1 = new mediaAluno();
        /*Armazenando as variaveis no endereço de memória dos atributos da classe aluno*/
        a1.nome = input.nextLine();
        a1.a = input.nextDouble();
        a1.b = input.nextDouble();

        /*Calculando a média udando o métodos que calcula a média*/
        double nota = a1.media();

        /*Imprimindo o status usando o método que imprime o status e a nota do aluno*/
        a1.ImprimeNomeEStatus();
        a1.status();


        input.close();
    }
}
