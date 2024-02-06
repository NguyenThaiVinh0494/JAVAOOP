import java.util.Scanner;
public class bai8lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap vao so luong so nguyen: ");
        int n = sc.nextInt();
        int[] dayso = new int[n];
        int sum = 0;
        for(int i = 0; i<n;i++)
        {
            System.out.printf("nhap so thu "+(i+1)+": ");
            dayso[i]= sc.nextInt();
            sum += dayso[i];
        }
        double tbc = sum/n;
        System.out.printf("trung binh cong cua "+n+" so nguyen la: "+tbc);
    }
}
