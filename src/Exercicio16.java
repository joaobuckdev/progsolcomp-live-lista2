/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio16.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) throws Exception {
        double numeroDigitado;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um número negativo: ");
        numeroDigitado = teclado.nextDouble();

        while (numeroDigitado>=0) {
            System.out.println("O número inserido é positivo, tente novamente.");
            System.out.print("\nInsira um número negativo: ");
            numeroDigitado = teclado.nextDouble();
        }
        teclado.close();

        System.out.println("O número inserido é negativo.");
    }
}
