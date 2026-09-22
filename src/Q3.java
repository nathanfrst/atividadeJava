import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = tec.nextDouble();

        if(nota <=10 && nota >=0){
            if (nota >= 7){
                System.out.printf("Aluno aprovado com nota %.2f%n",nota);
            }else if (nota >= 5 && nota <= 6.9){
                System.out.printf("Aluno em recuperação com nota %.2f%n",nota);
            }else{
                System.out.printf("Aluno reprovado com nota %.2f%n",nota);
            }
        }else{
            System.out.println("Nota inválida (0-10)");
        }

    }
}
