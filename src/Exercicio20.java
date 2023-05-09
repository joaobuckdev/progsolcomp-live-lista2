/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio20.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) throws Exception {
        double qtdPessoas;
        double totalPessoas = 0;

        double cargaMax;
        double cargaInserida = 0;
        double cargaTotal = 0;
        double cargaRestante = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a carga máxima do elevador: ");
        cargaMax = teclado.nextDouble();

        System.out.print("Insira a quantidade máxima de pessoas permitido no elevador: ");
        qtdPessoas = teclado.nextDouble();

        do {
            totalPessoas = totalPessoas+1;
            System.out.printf("\nInsira o peso da %1.1s° pessoa: ", totalPessoas);
            cargaInserida = teclado.nextDouble();
            
            qtdPessoas = qtdPessoas-1;

            cargaTotal = cargaInserida + cargaTotal;
            cargaRestante = cargaMax - cargaTotal;
            
            if (qtdPessoas==0) {
                System.out.println("\nQuantidade máxima de pessoas atingida.");
                break;
            }
            if (cargaTotal >= cargaMax) {
                System.out.printf("\nO peso máximo de %s kg do elevador foi atingido: %s kg.", cargaMax, cargaTotal);
                break;
            }

            System.out.printf("A carga atual é de: %s kg. Restam: %s kg.", cargaTotal, cargaRestante);
            System.out.printf("\nHá %1.1s pessoa(s) no elevador. Vagas restantes: %1.1s pessoa(s).\n", totalPessoas, qtdPessoas);
        } while (true);

        teclado.close();
    }
}
