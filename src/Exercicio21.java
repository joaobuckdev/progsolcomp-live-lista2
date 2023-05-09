/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio21.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Insira um número positivo: ");
        int num = teclado.nextInt();
        teclado.close();

        for (int i = 1; i <= num; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i*j));
            }
            System.out.println();
        }
        
    }
}
