import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        String senha = "java123";

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senhaUser = tec.nextLine();

        if(senhaUser.equals(senha)){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }
    }
}
