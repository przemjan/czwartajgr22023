package podstawy;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int numerButa;

        System.out.println("Podaj numer buta: ");
        numerButa = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj średnią z polskiego: ");
        double srednia = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj swoje imię: ");
        String name = klawiatura.nextLine();

        System.out.println("Numer buta: " + numerButa +
                ", średnia: "+ srednia + ", imię " + name);


    }
}
