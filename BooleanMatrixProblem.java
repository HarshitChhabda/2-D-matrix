import java.util.Scanner;

/**
 * BooleanMatrixProblem
 */
public class BooleanMatrixProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];    //  arr[0][0] se matrix banayi
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {             
                if (arr[i][j] == 1) {                        //check kia ki a[i][j]==1 hai to us row ke sabhi coloumn ko 1 kr do
                    for (int k = i, l = 0; l < col; l++) {
                        arr[k][l] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {                          /// print matrix
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
/*Boolean Matrix Problem
You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1. Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to print the modified matrix.

Input
The first line of contains m and n denoting number of rows and number of columns. Then next m lines contain n elements denoting the elements of the matrix.

Constraints:
1 <= m, n <= 700
Mat[I][j] ∈ {0,1}
Output
In a new line, print the modified matrix.

Example
Input:
5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Output:
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
Explanation:
rows = 5 and columns = 4

The given matrix is

1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Evidently, the first row contains a 1 so fill the whole row with 1. The third row also contains a 1 so that row will be filled too. Finally, the last row contains a 1 and therefore it needs to be filled with 1 too. The final matrix is

1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1 */