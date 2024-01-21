import java.util.Scanner;
public class phuongtrinhbac2 {
    public static void main(String[] args) {
        double a,b,c,d,x,x1,x2;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap gia tri cho a: ");
        a = sc.nextDouble();
        System.out.printf("nhap gia tri cho b: ");
        b = sc.nextDouble();
        System.out.printf("nhap gia tri cho c: ");
        c = sc.nextDouble();
        if(a==0)
            if(b==0) System.out.printf("phuong trinh vo nghiem");
            else{x = -c/b; System.out.printf("nghiem cua phuong trinh la: "+"x = "+x);}
        else{
            d = Math.pow(b,2) - 4*a*b;
            if(d<0) System.out.printf("phuong trinh vo nghiem");
            if(d==0){x= -b/2*a*c; System.out.printf("phuong trinh co 1 nghiem kep: "+"x = "+x);}
            if(d>0){x1 = (-b+Math.sqrt(d))/4*a*c; 
                    x2 = (-b-Math.sqrt(d))/4*a*c;
                    System.out.printf("phuong trinh co 2 nghiem: "+"x1 = "+x1+"; "+"x2 = "+x2);}

        
        }
    }
    
}
