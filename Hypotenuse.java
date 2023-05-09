import java.util.Scanner;
import java.lang.Math;

public class Hypotenuse {

    public static void main(String[] args) {
        double kenar1;
        double kenar2;
        double kenar3;
        double hipotenus;
        double alan;

        Scanner userEntry = new Scanner(System.in);
        System.out.println("1.Kenari giriniz:");
        kenar1 = userEntry.nextDouble();
        System.out.println("2.Kenari giriniz:");
        kenar2 = userEntry.nextDouble();

        hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println("Hipotenüs uzunlugu: " + hipotenus);

        kenar3 = Math.sqrt(hipotenus * hipotenus - kenar1 * kenar1);
        System.out.println("3.Kenar uzunlugu: " + kenar3);

        alan = (kenar1 * kenar2) / 2;
        System.out.println("Üçgenin Alani :" + alan);

    }
}
