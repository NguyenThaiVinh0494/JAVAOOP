import java.util.Scanner;
public class bai11lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,temp;
        do{
            System.out.printf("nhap so phan tu cho mang: ");
            n= sc.nextInt();
        } while(n<=0);    
        int[] mang = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("so phan tu thu "+(i+1)+" la: ");
            mang[i] = sc.nextInt();
        }
        System.out.printf("mang ban dau: ");
        for(int i=0;i<n;i++) System.out.print("\n"+mang[i]);
        for(int i=0;i<n-1;i++)
        for(int j=i+1;j<=n-1;j++)
        {
            if(mang[i]>mang[j]){
            temp = mang[i];
            mang[i]=mang[j];
            mang[j]=temp;}
        }
        System.out.println("\nmang sau khi sap xep lai: ");
        for(int i=0;i<n;i++) System.out.println(mang[i]);

    }
}
