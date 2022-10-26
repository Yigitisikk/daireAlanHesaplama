import java.util.Scanner;

public class DaireAlanHesaplama {
    public static void main(String[] args) {

        int r;
        double pi = 3.14, alanFormul, cevreFormul,dilimAlan;
        double a;

        Scanner pnt = new Scanner(System.in);

        System.out.print("Yarı Çap : ");
        r = pnt.nextInt();
        System.out.print("Alfa Değeri : ");
        a = pnt.nextDouble();

        alanFormul  = pi * r * r;
        cevreFormul = 2 * pi * r;
        System.out.println("dairenin alanı : " + alanFormul);
        System.out.println("dairenin cevresi : " + cevreFormul);

        dilimAlan = pi * (r*r) * a / 360;
        System.out.println("Daire Diliminin alanı : "+ dilimAlan);
    }
}
