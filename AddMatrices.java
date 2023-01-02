import java.util.Scanner;
public class AddMatrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrix1[][] =  new int[3][3];
        int matrix2[][] = new int[3][3];
        System.out.println("¡Ingresa los valores de la primera matriz 3x3!");
        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1.length; j++) {
                System.out.print("Ingresa el valor de la posición " + i + ", " + j + ": ");
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Ingresa los valores de la segunda matriz 3x3!");
        for(int i = 0; i < matrix2.length; i++) {
            for(int j = 0; j < matrix2.length; j++) {
                System.out.print("Ingresa el valor de la posición " + i + ", " + j + ": ");
                matrix2[i][j] = input.nextInt();
            }
        }
    }
}