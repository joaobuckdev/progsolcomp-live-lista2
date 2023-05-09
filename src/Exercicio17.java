/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio17.java
* Data: 09/05/2023
*/

public class Exercicio17 {
    public static void main(String[] args) throws Exception {
        int num = -1000;

        do {
            if (num<0 && num%7 ==0) {
                System.out.println(num);
            }
            num--;
        } while (num >= -1000);
    }
}
