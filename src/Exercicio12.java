/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio12.java
* Data: 09/05/2023
*/

public class Exercicio12 {
    public static void main(String[] args) throws Exception {
        int i = 0;

        do {
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        } while (i%7 != 0);
    }
}
