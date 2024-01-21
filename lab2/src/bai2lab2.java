import java.util.Scanner;
public class bai2lab2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap gia tri cho a: ");
        n = sc.nextInt();
        if(n%2==0) System.out.printf("n la so chan");
        else System.out.printf("n la so le");
        
    }
    
}
