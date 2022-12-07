import java.util.Scanner;

public class tim_gia_tri_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten qua: ");
        String[] qua = {"Coc", "Oi", "xoai", "Man"};
        String input_name = scanner.nextLine();
        boolean zzz = false;
        for(int i = 0; i < qua.length; i++){
            if(qua[i].equals(input_name)){
                System.out.println("vi tri cua qua trong danh sach" + input_name + " la: " + i);
                zzz = true;
                break;
            }
        }
        if(!zzz){
            System.out.println("khong phai trong vi tri" + input_name + "danh sach ");
        }
    }
}
