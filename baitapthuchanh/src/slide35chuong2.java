import java.util.Scanner;
public class sonhonhat {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap gia tri cho a: ");
        a = sc.nextInt();
        System.out.printf("Nhap gia tri cho b: ");
        b = sc.nextInt();
        if(a<b)
            System.out.printf("a la so nho nhat");
        else if(a>b) System.out.printf("b la so nho nhat");
                else System.out.printf("khong co gia tri nho nhat");

    }
    
}
