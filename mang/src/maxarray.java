import java.util.Scanner;

public class maxarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kichthuoc;
        int [] array;

        do{
            System.out.print(" chon kich thuoc: ");
            kichthuoc = scanner.nextInt();
            if(kichthuoc > 10)
                System.out.println("khong phai kich thuoc");
        }while (kichthuoc > 20);
        array = new int[kichthuoc];
        int i = 0;
        while (i < array.length){
            System.out.print("nhap" + (i +1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("danh sach nhap: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("gia tri lon nhat trong mang la" + max + " ,at position " + index);

    }
}
