import java.util.Scanner;
public class bai10lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi; char kitu; int dem=0;
        do{
            System.out.printf("nhap chuoi: ");
            chuoi= sc.nextLine();
        }while(chuoi.length()>80);
        System.out.printf("nhap vao ki tu bat ki: ");
        kitu = sc.next().charAt(0);
        for(int i=0;i<chuoi.length();i++)
        if(kitu==chuoi.charAt(i))
        dem++;
        System.out.printf("so kis tu "+kitu+" xuat hien trong chuoi "+chuoi+" "+dem+" lan");
    }
}
