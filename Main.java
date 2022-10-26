import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double a ,b;
        double c;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kısadik kenarı  Giriniz :");
        a = inp.nextInt();

        Scanner mnp = new Scanner(System.in);
        System.out.print("Uzun dik kenarı  Giriniz :");
        b  = mnp.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Üçgenin Alanı :"+ (a+b)/2);
        System.out.println("Hipotenüs :" + c);


    }
}
