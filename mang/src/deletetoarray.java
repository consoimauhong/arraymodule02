import java.util.*;
public class deletetoarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap kich thuoc mang: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.printf("Nhap phan tu thu %d: ",i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Mảng lúc đầu: " + Arrays.toString(arr));

        //Số muốn xóa
        System.out.print("Nhap so ban muon xoa: ");
        int number = sc.nextInt();

        System.out.println("Mảng hiện tại: " + Arrays.toString(deleteElement(arr,number)));

    }

    public static int[] deleteElement(int[] array, int numb) {
        int[] newArray = new int[array.length - 1];
        for(int i = 0, j = 0; i < array.length; i++) {
            if(array[i] != numb) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}

