import java.util.Scanner;

public class transposematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int temp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { // create 2-D array
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // if(i!=j) you can use alose because in transpoe digonal are not change
                temp[i][j] = arr[j][i]; // transpose array to temp[][]
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // if(i!=j) you can use alose because in transpoe digonal are not change
                arr[i][j] = temp[i][j]; //
                System.out.print(arr[i][j] + " ");//trick to print without using another loop direct print
            }
            System.out.print("\n");
        }
        /*
         * for (int i = 0; i < n; i++) { \\ you can also use it to print arr[][]
         * for (int j = 0; j < n; j++) {
         * System.out.print(arr[i][j]+" ");
         * }
         * System.out.print("\n");
         * }
         */
        sc.close();
    }
}
/*
 * Transpose of Matrix
 * Write a program to find the transpose of a square matrix of size N*N.
 * Transpose of a matrix is obtained by changing rows to columns and columns to
 * rows.
 * 
 * Expected Time Complexity: O(N * N)
 * Expected Auxiliary Space: O(1)
 * 
 * Input
 * The first line contains an integer N.
 * The next N lines contains N spaced integers each, elements of matrix.
 * Constraints
 * 1 <= N <= 100
 * 10^3 <= mat[i][j] <= 10^3
 * Output
 * Print the transposed matrix.
 * 
 * Example
 * Sample Input
 * 
 * 4
 * 1 1 1 1
 * 2 2 2 2
 * 3 3 3 3
 * 4 4 4 4
 * Sample Output
 * 
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 */