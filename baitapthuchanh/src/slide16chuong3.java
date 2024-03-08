import java.util.Scanner;

public class slide16chuong3 {
    public class Hinhtron{
        final float PI = 3.14f;
        float r, cv, dt;
        void nhapBanKinh()
        {
            System.out.printf("nhap ban kinh hinh tron: ");
            Scanner sc = new Scanner(System.in);
            r= sc.nextFloat();
        }
        void tinhchuvi()
        {
            cv = 2*PI*r;
        }
        void tinhdientich()
        {
            dt = PI*r*r;
        }
        void inchuvi()
        {
            System.out.printf("chu vi hinh tron: "+cv);
        }
        void indientich()
        {
            System.out.printf("\ndien tich hinh tron: "+dt);
        }
    }
    public static void main(String[] args) {
        Hinhtron hinhtron = new slide16chuong3(). new  Hinhtron();
        hinhtron.nhapBanKinh();
        hinhtron.tinhchuvi();
        hinhtron.tinhdientich();
        hinhtron.inchuvi();
        hinhtron.indientich();
    }
}
