import java.util.Scanner;
public class bai4lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap vao 1 so nguyen tu 1 den 12: ");
        int thang = sc.nextInt();
        switch (thang) {
            case 1:System.out.printf("thang mot.");
                break;
            case 2:System.out.printf("thang hai.");
                break;
            case 3:System.out.printf("thang ba.");
                break;
            case 4:System.out.printf("thang bon.");
                break;
            case 5:System.out.printf("thang nam.");
                break;
            case 6:System.out.printf("thang sau.");
                break;
            case 7:System.out.printf("thang bay.");
                break;
            case 8:System.out.printf("thang tam.");
                break;
            case 9:System.out.printf("thang chin.");
                break;
            case 10:System.out.printf("thang muoi.");
                break;
            case 11:System.out.printf("thang muoi mot.");
                break;
            case 12:System.out.printf("thang muoi hai.");
                break;


            default:System.out.printf("so vua nhap khong thoa man!");
                break;
        } 
    }
    
}
