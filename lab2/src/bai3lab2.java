import java.util.Scanner;
public class bai3lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ten cua ban: ");
        String ten = sc.nextLine();
        System.out.printf("nhap nam sinh cua ban: ");
        int namsinh = sc.nextInt();
        int tuoi = 2024 - namsinh;
        if(tuoi<16) System.out.printf("Ban "+ten+" o do tuoi vi thanh nien.");
        else if(tuoi>=16&&tuoi<18) System.out.printf("\nBan "+ten+" o do tuoi truong thanh.");
        else System.out.printf("\nBan "+ten+" da gia.");
        
    }
    
}
