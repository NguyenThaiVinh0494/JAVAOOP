import java.util.Scanner;
public class tinhtong {
    public static void main(String[] args) {
        int s=0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("Nhap vao so nguyen: ");
            int n = sc.nextInt();
            s += n;
            if(s>100) break;
        }
        System.out.printf("tong da qua 100");
        System.out.printf("\ntong cac so da nhap: "+s);
    }
    
}
