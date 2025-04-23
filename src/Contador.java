import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int n1 = sc.nextInt();
            System.out.println("Digite outro número: ");
            int n2 = sc.nextInt();
            contar(n1, n2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());;
        }
    }

    static void contar(int um, int dois) throws ParametrosInvalidosException{
        if (um > dois){
            throw new ParametrosInvalidosException();
        }
        while(um<=dois){
            System.out.println(um++);
        }
    }
}
