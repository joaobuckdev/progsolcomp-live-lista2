/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio02.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        double a = teclado.nextDouble();

        System.out.print("Insira o segundo valor: ");
        double b = teclado.nextDouble();

        System.out.print("Insira o terceiro valor: ");
        double c = teclado.nextDouble();
        teclado.close();

        /* Possibilidades: 6.
        * ABC (123); ACB (132); BAC (213);
        * CBA (321); BCA (231); CAB (312).
        */
        
        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println(a + ", " + b + ", " + c);
            }
            else {
                System.out.println(a + ", " + c + ", " + b);
            }
        }

        else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.println(b + ", " + a + ", " + c);
            }
            else  {
                System.out.println(b + ", " + c + ", " + a);
            }
        }

        else if (c <= a && c <= b) {
            if (a <= b) {
                System.out.println(c + ", " + a + ", " + b);
            }
            else {
                System.out.println(c + ", " + b + ", " + a);
            }
        }

        else {
            System.out.println("Não foi possível realizar nenhuma ação!");
        }
    }
}
