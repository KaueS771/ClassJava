public class main {
    public static void main(String [] arg){
        Corrente cr = new Corrente();
        cr.nomeCorrentista = "Kaue";
        cr.idade = 18;
        cr.numeroConta = 00115753;
        cr.saldo = 8000.00;
        System.out.println("Nome Correntista: " + cr.nomeCorrentista);
        System.out.println("Idade: " + cr.idade);
        System.out.println("Numero da Conta:" + cr.numeroConta);
        System.out.println("Saldo:" + cr.saldo);


        cr.sacar(200);
        System.out.println("Fazer saque de R$ 200.00: " + cr.saldo);

        cr.depositar(100);
        System.out.println("Fazer deposito de R$ 100 : " + cr.saldo);





        
    }

    
}
