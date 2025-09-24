import java.util.Scanner;

public class EstruturasRepeticao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }

        int o;
        do {
            System.out.println();
            System.out.println("Opção 1: Continuar");
            System.out.println("Opção 2: Finalizar");
            o = scanner.nextInt();
            scanner.nextLine();

            if (o == 1) {
                System.out.println("Digite uma palavra ou frase");
                String frase = scanner.nextLine();
                System.out.println(frase);
            } else if (o == 2) {
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
            }

        } while (o != 2);

        scanner.close();
    }
}
