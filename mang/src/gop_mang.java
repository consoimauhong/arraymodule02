import java.util.*;

public class gop_mang{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Mảng 1
        System.out.print("Nhap kich thuoc mang: ");
        int size1 = sc.nextInt();

        int[] arr1 = new int[size1];
        for(int i = 0; i < size1; i++) {
            System.out.printf("Nhap phan tu thu %d: ",i);
            arr1[i] = sc.nextInt();
        }
        System.out.println("Mảng thứ nhất: " + Arrays.toString(arr1));

        //Mảng 2
        System.out.print("Nhap kich thuoc mang: ");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];
        for(int i = 0; i < size2; i++) {
            System.out.printf("Nhap phan tu thu %d: ",i);
            arr2[i] = sc.nextInt();
        }
        System.out.println("Mảng thứ nhất: " + Arrays.toString(arr2));

        //Mảng 3
        int size3 = size1 + size2;
        System.out.println("Mảng 3: " + Arrays.toString(mixArray(arr1, arr2, size3)));

    }

    public static int[] mixArray(int[] array1, int[] array2, int size) {
        int[] newArray = new int[size];

        for(int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }

        for(int i = 0; i < array2.length; i++) {
            newArray[array1.length + i] = array2[i];
        }
        return newArray;
    }
}