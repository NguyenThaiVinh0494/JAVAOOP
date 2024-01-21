import java.util.Scanner;
public class phuongtrinhbac1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,x;
        System.out.printf("nhap gia tri cho a: ");
        a = sc.nextDouble();
        System.out.printf("nhap gia tri cho b: ");
        b = sc.nextDouble();
        if(a==0) System.out.printf("phuong trinh vo nghiem");
        else { x = -b/a; System.out.printf("nghiem cua phuong trinh la: " + "x = "+x);}
    }
}