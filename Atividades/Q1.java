import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = tec.nextInt();

        System.out.print("Ditie outro número: ");
        int n2 = tec.nextInt();

        if (n1 > n2){
            System.out.println(n1+" é maior que "+n2);
        }else if (n1 < n2){
            System.out.println(n2+ " é maior que "+n1);
        }else{
            System.out.println("Ambos são iguais");
        }
    }
}
