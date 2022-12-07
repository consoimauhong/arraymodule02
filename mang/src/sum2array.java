import java.util.*;

public class sum2array {
    public static void main(String[] args) {
        System.out.print("Tổng: " + sumArray(array_2D()));
    }

    public static int[][] array_2D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dong: ");
        int n = sc.nextInt(); //Dong
        System.out.print("Nhap cot: ");
        int m = sc.nextInt(); //Cot

        int array[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.printf("Nhap phan tu dong %d, cot %d: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }

        sc.close();

        return array;
    }

    public static int sumArray(int[][] arr) {
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length - i -1];
        }

        int sum = sum1 + sum2;

        return sum;
    }
}