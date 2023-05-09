/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio10.java
* Data: 09/05/2023
*/

public class Exercicio10 {
    public static void main(String[] args) throws Exception {
        int[] numeroPar = new int[50];
        int index = 0;

        for (int i=1; i<=100; i++) {
            if (i%2==0) {
                numeroPar[index] = i;
                index++;
            }
        }
        for (int i=0; i<numeroPar.length; i++) {
            System.out.println(numeroPar[i]);
        }
    }
}
