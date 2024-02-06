import java.util.Scanner;
public class bai9lab2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int dem=0; String chuoi; char kitu; 
        System.out.printf("nhap vao 1 chuoi ki tu: ");
        chuoi = sc.nextLine();
        for(int i=0;i<chuoi.length();i++)
        {
            kitu = chuoi.charAt(i);
            System.out.println(kitu);
            dem++;
        }
        System.out.printf("so ki tu trong chuoi la: "+dem);
    }
}
