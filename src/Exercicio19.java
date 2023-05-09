/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio19.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) throws Exception {
        int volume;
        int tempo = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o volume inicial em cm³: ");
        volume = teclado.nextInt();

        while (volume<=0) {
            System.out.print("\nO volume inicial deve ser pelo menos 1cm³, tente novamente: ");
            volume = teclado.nextInt();
        }

        while (volume<=1000) {
            volume *=2;
            tempo++;
        }

        teclado.close();

        System.out.printf("Tempo necessário para o volume ultrapassar os 1000cm³: %s segundos.", tempo);
    }
}
