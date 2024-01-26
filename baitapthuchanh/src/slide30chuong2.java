import java.util.Scanner;
public class tinhtongn {
    public static void main(String[] args) {
        int n,du,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap gia tri cho n: ");
        n = sc.nextInt();
        while (n>0) {
            du = n%10;
            n=n/10;
            s += du;
        }
        System.out.printf("tong cac chu so trong n la: "+"tong ="+s);
    }
    
}
