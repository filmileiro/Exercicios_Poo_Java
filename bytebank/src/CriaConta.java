public class CriaConta {
    public static void main(String[] args) {

        Conta william = new Conta();
        william.setTitular("William Brasil Pereira");


        Conta luana = new Conta();
        luana.setTitular("Luana Barbara do Nascimento Torres");
        luana.deposita(1000.00);
        System.out.println();
        System.out.println("O saldo de " + luana.getTitular() + " é: " + luana.getSaldo());

        System.out.println();
        System.out.println("Luana possui saldo suficiente para tranferir $R 3000.00?");
        System.out.println();
        boolean sucessoTranferencia = luana.tranfere(3000.00, william);
        System.out.println(sucessoTranferencia);
        System.out.println();


        System.out.println("E se luana tranferir $R 300.00??");
        System.out.println();
        if (luana.tranfere(200.00,william)){
            System.out.println("tranferencia será efetuada com sucesso!");
        }else{
            System.out.println("Saldo será insufisciente");
        }
        System.out.println();
        System.out.println("O saldo atualizado de " + luana.getTitular() + " é: " + luana.getSaldo());
        System.out.println("Saldo atualizado de " + william.getTitular() + " é: " + william.getSaldo());


    }
}
