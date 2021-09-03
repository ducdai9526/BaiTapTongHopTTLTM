
package lab1;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        // TODO code application logic here
         int a;
        float f;
        double d;
        long l;
        char ch;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập một số nguyên: ");
        a = sc.nextInt();
        System.out.println(" Nhập một số thưc : ");
        f = sc.nextFloat();
        System.out.println(" Nhập một số double: ");
        d = sc.nextDouble();
        System.out.println(" Nhập một số long: ");
        l = sc.nextLong();
        System.out.println(" Nhập một kí tự: ");
        sc.nextLine(); //ki tu ket thuc nhap se bi mat
        ch = sc.nextLine().charAt(0);
        System.out.println("Nhap mot chuoi:");
        str = sc.nextLine();
        System.out.println("Du lieu vua nhap:");
        System.out.println("a="+a);
        System.out.println("l="+l);
        System.out.println("f="+f);
        System.out.println("ch="+ch);
        System.out.println("str="+str);
        System.out.println("d="+d);
        System.out.println("\nIn tren cung 1 dong:");
        System.out.println("a="+a+", f="+f+", l="+l+", d="+d+", ch="+ch+",str="+str+"");
    }
    

}
