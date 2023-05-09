/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio01.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Insira o 1° número: ");
        double a = teclado.nextDouble();
        System.out.print("Insira o 2° número: ");
        double b = teclado.nextDouble();
        teclado.close();

        if (a > b) {
            System.out.printf("O maior número é: %s", a);
        } else if (a < b) {
            System.out.printf("O maior número é: %s", b);
        } else {
            System.out.println("Nenhum dos números é maior, ambos tem o mesmo valor.");
        }
    }
}