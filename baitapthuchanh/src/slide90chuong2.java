import java.util.Scanner;

public class slide90chuong2 {
    public static void main(String[] args) {
        
    
    char kitu;
    Scanner sc = new Scanner(System.in);
        System.out.printf("nhap vao mot chuoi: ");
        String chuoi = sc.nextLine();
        for(int i=0; i< chuoi.length();i++)
        {
            kitu = chuoi.charAt(i);
            System.out.println(kitu);
        }
}
}
