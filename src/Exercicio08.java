/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio08.java
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Insira o mês: ");
        int mes = teclado.nextInt();
        
        while (mes>12 || mes<=0) {
            System.out.println("O valor inserido é inválido, tente novamente.");
            System.out.print("Insira o mês (1-12): ");
            mes = teclado.nextInt();
        }
        teclado.close();

        if (mes==1) {
            System.out.println("O mês inserido foi Janeiro, a estação será: Verão.");
        } else if (mes==2) {
            System.out.println("O mês inserido foi Fevereiro, a estação será: Verão.");
        } else if (mes==3) {
            System.out.println("O mês inserido foi Março, a estação será: Verão (encerra em 20 de março de 2023) e Outono .");
        } else if (mes==4) {
            System.out.println("O mês inserido foi Abril, a estação será: Outono.");
        } else if (mes==5) {
            System.out.println("O mês inserido foi Maio, a estação será: Outono.");
        } else if (mes==6) {
            System.out.println("O mês inserido foi Junho, a estação será: Outono (encerra em 21 de junho de 2023) e Inverno.");
        } else if (mes==7) {
            System.out.println("O mês inserido foi Julho, a estação será: Inverno.");
        } else if (mes==8) {
            System.out.println("O mês inserido foi Agosto, a estação será: Inverno.");
        } else if (mes==9) {
            System.out.println("O mês inserido foi Setembro, a estação será: Inverno (encerra em 23 de setembro de 2023) e Primavera.");
        } else if (mes==10) {
            System.out.println("O mês inserido foi Outubro, a estação será: Primavera.");
        } else if (mes==11) {
            System.out.println("O mês inserido foi Novembro, a estação será: Primavera.");
        } else {
            System.out.println("O mês inserido foi Dezembro, a estação será: Primavera (encerra 22 de dezembro de 2023) e Verão.");
        }
    }
}
