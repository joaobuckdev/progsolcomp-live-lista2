/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio03.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Insira o segundo número: ");
        double num2 = teclado.nextDouble();
        teclado.close();

        if (num1%num2==0) {
            System.out.printf("O número %s é múltiplo de %s.", num1, num2);
        } else {
            System.out.printf("Os números inseridos não são múltiplos.");
        }
    }
}
