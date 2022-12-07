import java.util.*;

public class addtoarray{
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

        System.out.print("Nhap so ban muon thêm: ");
        int number = sc.nextInt();

        //Vị trí
        System.out.print("Nhap vi tri ban muon them: ");
        int indexN = sc.nextInt();

        System.out.println("Mảng hiện tại: " + Arrays.toString(addElement(arr, number, indexN)));

    }

    public static int[] addElement(int[] array, int numb, int index) {
        int[] newArray = new int[array.length + 1];

        for(int i = 0, j = 0; i <= array.length; i++) {
            if(i != index){
                newArray[i] = array[j];
                j++;
            } else {
                newArray[i] = numb;
            }
        }
        return newArray;
    }
}