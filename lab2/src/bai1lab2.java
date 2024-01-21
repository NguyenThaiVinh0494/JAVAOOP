import java.util.Scanner;
public class bai1lab2{
    public static void main(String[] args) {
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap gia tri cho a: ");
        a = sc.nextFloat();
        System.out.print("nhap gia tri cho b: ");
        b = sc.nextFloat();
        float tong = a+b;
        System.out.print("tong cua 2 so la: " +tong);
        float hieu = a-b;
        System.out.print("\nhieu cua 2 so la: " +hieu);
        float tich = a*b;
        System.out.print("\ntich cua 2 so la: " +tich);
        float thuong = a/b;
        System.out.print("\nthuong cua 2 so la:" +thuong);
        float du = a%b;
        System.out.print("\ndu cua phep chia la:" +du);
        if(a<b) System.out.print("\na nho hon b");
        else if(a==b) System.out.print("\na bang b");
               else System.out.print("\na lon hon b");


    }
}