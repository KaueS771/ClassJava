import java.util.Scanner;

public class Fatorial {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Digite um valor para n");
        n = sc.nextInt();

        long fatorial = 1;
        int i = 1;
        while(i < n){
            n = 1;
            fatorial *= n;
            n++;
        }
        System.out.printf("O fatorial de n é %d",fatorial);

        
    }
}

