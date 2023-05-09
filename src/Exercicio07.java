/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio07.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) throws Exception {
        double diaria = 60;
        double custo = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira quantos dias você deseja hospedar-se: ");
        double dias = teclado.nextInt();

        while (dias<=0) {
            System.out.println("Valor inserido inválido, tente novamente.");
            System.out.print("Insira um valor maior que 0: ");
            dias = teclado.nextInt();
        }
        teclado.close();

        if (dias<15) {
            custo = (diaria*dias)+(dias*8);
            System.out.printf("\nO custo da hospedagem total é de: R$%3.3s", custo);
        } else if (dias==15) {
            custo = (diaria*dias)+(dias*6);
            System.out.printf("\nO custo da hospedagem total é de: R$%3.3s", custo);
        } else {
            custo = (diaria*dias)+(dias*5.5);
            System.out.printf("\nO custo da hospedagem total é de: R$%s", custo);
        }
    }
}
