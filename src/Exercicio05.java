/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio05.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = teclado.next();
        System.out.print("Insira seu sobrenome: ");
        String sobrenome = teclado.next();
        System.out.print("Insira sua idade: ");
        int idade = teclado.nextInt();
        System.out.print("Insira sua naturalidade: ");
        String naturalidade = teclado.next();

        System.out.print("\nDeseja visualizar dados completos? (Insira S ou N): ");
        String resposta = teclado.next();
        
        while (resposta != "S" && resposta != "N") {
            System.out.println("Digitação incorreta. Tente novamente.");
            System.out.print("\nInsira S ou N: ");
            resposta = teclado.next();
            if (resposta.equalsIgnoreCase("S")) {
                System.out.printf("\nSeus dados inseridos foram: %s %s, de %s anos, natural de %s.", nome, sobrenome, idade, naturalidade);
                break;
           } else if (resposta.equalsIgnoreCase("N")) {
               System.out.printf("\nSeus dados inseridos foram: %s, de %s anos.", nome, idade);
               break;
           }
        }
        teclado.close();
    }
}
