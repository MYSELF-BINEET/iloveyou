import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

public class CWD_2DARRAY_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE ROWS ");

        int rows = sc.nextInt();

        System.out.println("ENTER THE COLOUMNS ");

        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("ENTER THE MATRIX ELEMENT IN FORM");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) { // IT IS INPUT

                matrix[i][j] = sc.nextInt();

            }

        }

        System.out.println("THE TRANSPOSE OS MATRIX IS : ");

        for (int j = 0; j < cols; j++) {

            for (int i = 0; i < rows; i++) {

                System.out.print(matrix[i][j] + " ");

            }

            System.out.println();

        }

    }

}
