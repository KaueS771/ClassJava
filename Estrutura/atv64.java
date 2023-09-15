import java.util.Scanner;

public class atv64 {
    public static void main (String []arg){
        Scanner sc = new Scanner(System.in);

        String nome;
        double salarioBruto,desconto,salarioLiquido,aumentarSalario;

        System.out.println("Digite um nome:");
        nome = sc.nextLine();

        System.out.println("Digite um salario:");
        salarioBruto = sc.nextDouble();

        desconto = salarioBruto - 1000;

        System.out.printf("Dados do Funcionario: %s R$ %d",nome,salarioBruto);
     
    }
    
}
