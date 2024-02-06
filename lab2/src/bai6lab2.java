import java.util.Scanner;
public class bai6lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long giaithua=1; int i=1 ;
        System.out.printf("nhap gia tri cho n: ");
        int n = sc.nextInt();
        do{
            giaithua = giaithua * i;
            i++;
        }while( i<=n);
        System.out.printf("ket qua la: "+giaithua);
        
    }
    
}
