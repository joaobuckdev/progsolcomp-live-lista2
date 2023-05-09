/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio13.java
* Data: 09/05/2023
*/

public class Exercicio13 {
    public static void main(String[] args) throws Exception {
        int num = 1;
        int sum = 0;

        while (num <= 100) {
            sum+=num;
            num++;
        }
        
        System.out.println("A soma dos números de 1 a 100 é: " + sum);
    }
}
