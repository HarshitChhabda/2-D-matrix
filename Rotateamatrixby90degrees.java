import java.util.Scanner;

public class Rotateamatrixby90degrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int temp[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {    
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = arr[j][i];                  
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j<col/2; j++) {
              int temp1=temp[i][j];
              temp[i][j]=temp[i][col-1];
              temp[i][col-1]=temp1;
            }
        }
        for (int i = 0; i < row; i++) { 
             for (int j = 0; j < col; j++) {
             System.out.print(temp[i][j]+" ");
             }
            System.out.print("\n");
             }
            
        sc.close();
    }
}
