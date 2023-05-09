/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio06.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira sua nota (0-100): ");
        int nota = teclado.nextInt();

        while(nota < 0 || nota > 100) {
            System.out.println("Nota inválida, tente novamente.");
            System.out.print("Insira sua nota (0-100): ");
            nota = teclado.nextInt();
            if (nota > 0 && nota < 100) {
                break;
            }
        }
        teclado.close();

        if (nota <= 49) {
            System.out.println("A sua nota está classificada como: Insuficiente.");
        } else if (nota > 50 && nota <= 64) {
            System.out.println("A sua nota está classificada como: Regular.");
        } else if (nota > 65 && nota <= 84) {
            System.out.println("A sua nota está classificada como: Bom.");
        } else
            System.out.println("A sua nota está classificada como: Ótimo."); 
    }
}
