public class Corrente {
     private String nomeCorrentista;
     private boolean Sexo;
     private int idade;
     private double numeroConta;
     private double saldo;

     public String getnomeCorrente(){
        return nomeCorrentista;
     }
     public void setnomeCorrentista(String kaue){
        nomeCorrentista = kaue;
     }

     public void depositar(double valor){
        saldo += valor;

     }
     public void sacar (double valor){
        saldo -= valor;
     }
}

