/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio18.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) throws Exception {
        int numero;
        int fatorial = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero = teclado.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        teclado.close();

        System.out.printf("O número fatorial de %s é: %s", numero, fatorial);
    }
}
