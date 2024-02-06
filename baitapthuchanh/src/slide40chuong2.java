import java.util.Scanner;
public class slide40chuong2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("nhap ngay: ");
    int ngay = sc.nextInt();
    switch (ngay) {
        case 0:System.out.printf("Chu nhat");
            break;
        case 1:System.out.printf("Thu hai");
            break;
        case 2:System.out.printf("Thu ba");
            break;
        case 3:System.out.printf("Thu tu");
            break;
        case 4:System.out.printf("Thu nam");
            break;
        case 5:System.out.printf("Thu sau");
            break;
        case 6:System.out.printf("Thu sau");
            break;
    
        default:System.out.printf("khong thoa man");
            break;
    }

}

    
}