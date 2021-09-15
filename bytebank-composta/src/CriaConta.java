public class CriaConta {
    public static void main(String[] args) {

        /*Cliente*/
        Cliente william = new Cliente();

        william.setNome("William Brasil Pereira");
        william.setCpf("222.222.222-24");
        william.setProfissao("Programador");

        /*Conta*/

        Conta contaDoWilliam = new Conta();
        contaDoWilliam.deposita(100.00);


        /*pj*/

        PJ pj = new PJ();

        pj.setRazaoSocial("JRR Martin produções");
        pj.setCnpjs("123456.0001-06");
        pj.setCidade("Recife");
        pj.setBairro("Macaxeira");
        pj.setCep("52090-495");
        pj.setNumero("02");


        /*Como instanciar uma objeto do tipo Conta e um objeto do tipo cliente e trabalhara neles*/

        contaDoWilliam.cliente = william;
        System.out.println("Olha o que eu fiz! " + contaDoWilliam.cliente.getNome());

        /*Como instanciar uma objeto do tipo Conta e um objeto do tipo PJ e trabalhara neles*/
        contaDoWilliam.pj = pj;
        System.out.println("Olha o que eu fiz tbm! " + contaDoWilliam.pj.getBairro());

        }
}
