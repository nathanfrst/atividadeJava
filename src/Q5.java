import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);

        System.out.print("Insira o seu atual salário: ");
        double salar = tec.nextDouble();
        double aum = 0;

        if (salar<=2000){
            aum = salar * 0.15;
            salar += aum;

            System.out.printf("Novo salário com aumento de 15%%: %.2f%n",salar);
        }else if (salar>2000){
            aum = salar * 0.10;
            salar += aum;

            System.out.printf("Novo salário com aumento de 10%%: %.2f%n",salar);

        }else{
            System.out.println("Salário inválido.");
        }


    }
}
