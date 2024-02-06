import java.util.Scanner;
public class slide74chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        do{
            System.out.printf("nhap so phan tu cua mang: ");
             n = sc.nextInt();
        }while(n < 0);
        int[] mang = new int[n];
        System.out.printf("nhap gia cho phan tu cho mang \n");
        for( i = 0; i<n;i++){
            System.out.print("nhap gia tri cho phan tu thu "+(i+1)+" : ");
            mang[i] = sc.nextInt();
        }
        double sum=0;
        for(i=0; i<n;i++){
            if(mang[i]%2==0){ sum += mang[i];}
        }
        System.out.println("tong = "+sum);

    }
    
}
