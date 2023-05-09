/* Nome do Aluno: João Guilherme Buck Barcellos
* RA: 942312078
* Nome do Programa: Exercicio15.java
* Data: 09/05/2023
*/

public class Exercicio15 {
    public static void main(String[] args) throws Exception {
        int[][] matriz = new int[10][10];

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
        
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
