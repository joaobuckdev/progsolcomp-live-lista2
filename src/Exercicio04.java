/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio04.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = teclado.nextDouble();
        teclado.close();
        
        if (numero%2==0) {
            System.out.printf("O número %s é par", numero);
        } else {
            System.out.printf("O número %s é ímpar", numero);
        }

        if (numero>0) {
            System.out.print(" e positivo.");
        } else {
            System.out.print(" e negativo.");
        }
    }
}
