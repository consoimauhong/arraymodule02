import java.util.Scanner;

public class min_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai mang: ");
        int n = sc.nextInt();

        int array[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.printf("Nhap phan tu %d: ", i);
            array[i] = sc.nextInt();
        }

        int min = array[0];
        for(int i=0; i<n; i++){
            if(min > array[i]) {
                min = array[i];
            }
        }

        System.out.println("So lon nhat: "+ min);

    }
}