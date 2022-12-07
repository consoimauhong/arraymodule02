import java.util.*;

public class solanxuathientrongarray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String text = input.nextLine();

        System.out.print("\nNhap ky tu can dem: ");
        char c = input.next().charAt(0);

        System.out.print("\nSố lần xuất hiện của" + c + "là: " + countChar(text,c));
    }

    public static int countChar(String str, char kytu) {
        int count = 0;
        char[] stringArray = str.toCharArray();

        for(int i = 0; i < stringArray.length; i++) {
            if(stringArray[i] == kytu) {
                count++;
            }
        }

        return count;
    }
}
