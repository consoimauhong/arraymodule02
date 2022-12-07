import java.util.*;

public class sum_colum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("nhap cot muon tinh tong: ");
        int position = sc.nextInt();

        System.out.print("Tổng: " + sumArray(array_2D(), position));
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

    public static int sumArray(int[][] arr, int index) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(j == index) {
                    sum += arr[i][j];
                }
            }
        }

        return sum;

    }
}