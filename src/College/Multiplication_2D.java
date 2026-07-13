package College;

import java.util.Scanner;

public class Multiplication_2D {
    static void multi(int[][] A,int[][]B)
    {
        int Ar1=A.length;
        int Ac1=A[0].length;
        int Bc2=B[0].length;
        int [][] C=new int[Ar1][Bc2];
        for (int i = 0; i < Ar1; i++) {
            for (int j = 0; j <Bc2 ; j++) {
                for (int k = 0; k < Ac1; k++) {
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        System.out.println("Result Matrix:");
        for (int i = 0; i < Ar1; i++) {
            for (int j = 0; j < Bc2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A matrix row and column size");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] A=new int[r1][c1];
        for (int i=0;i<r1;i++)
        {
            for (int j = 0; j < c1; j++) {
                System.out.println(i+ "and "+j+ " element");
                A[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter B matrix row and column size");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] B=new int[r1][c1];
        for (int i=0;i<r1;i++)
        {
            for (int j = 0; j < c1; j++) {
                System.out.println(i+ "and "+j+ " element");
                B[i][j]=sc.nextInt();
            }
        }

        if(c1 == r2)
        {
            multi(A,B);
        }
        else
        {
            System.out.println("Rules not satisfy");
        }
    }
}
