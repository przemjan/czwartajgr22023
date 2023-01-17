package dodatki;

public class Akumulator {
    public static void main(String[] args) {
        int sumaWyplat = 0, wyplata =1;

        int iloscDni = 1200;
        for (int i = 0; i < iloscDni; i++ ) {
            System.out.println("W dniu " + i + " pensja wynosi " +
                    wyplata + "zł");
            wyplata = wyplata+1;
            sumaWyplat +=wyplata;
        }

        System.out.println("W sumie pracownik zarobił " +
                sumaWyplat + "zł");
    }
}
