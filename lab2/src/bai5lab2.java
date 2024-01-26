import java.util.Scanner;
public class bai5lab2 {
    public static void main(String[] args) {
        int s=0; String str = "";
        Scanner sc = new Scanner(System.in);
        while (s<=100) {
            System.out.printf("Nhap vao so nguyen: ");
            int n = sc.nextInt();
            s += n;
            str = str + n + " + ";
        }
        System.out.println("tong da qua 100");
        str = str.substring(0,str.length()-2);
        System.out.printf(str + "= "+ s);
    }
}
