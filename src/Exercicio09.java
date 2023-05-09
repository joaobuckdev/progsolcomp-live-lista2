/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio09.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) throws Exception {
        int numeroDigitado;
        double valor;
        double total;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o valor da venda: ");
        valor = teclado.nextDouble();

        System.out.println("Escolha uma das opções a seguir:");
        System.out.println("[1] Venda a Vista");
        System.out.println("[2] Venda a Prazo 30 dias");
        System.out.println("[3] Venda a Prazo 60 dias");
        System.out.println("[4] Venda a Prazo 90 dias");
        System.out.println("[5] Venda com cartão de débito");
        System.out.println("[6] Venda com cartão de crédito");

        System.out.print("\nInsira uma das opções: ");
        numeroDigitado = teclado.nextInt();

        teclado.close();

        switch (numeroDigitado) {
            case 1:
            total = valor-(valor*0.10);
            System.out.printf("O total da venda é de: %s", total);
            break;
            case 2:
            total = valor-(valor*0.05);
            System.out.printf("O total da venda é de: %s", total);
            break;
            case 3:
            total = valor;
            System.out.printf("O total da venda é de: %s", total);
            break;
            case 4:
            total = valor+(valor*0.05);
            System.out.printf("O total da venda é de: %s", total);
            break;
            case 5:
            total = valor-(valor*0.08);
            System.out.printf("O total da venda é de: %s", total);
            break;
            case 6:
            total = valor-(valor*0.07);
            System.out.printf("O total da venda é de: %s", total);
            break;
        }
    }
}
