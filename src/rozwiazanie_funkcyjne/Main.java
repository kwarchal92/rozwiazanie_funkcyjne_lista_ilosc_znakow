package rozwiazanie_funkcyjne;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Przemek", "Dorota", "Zenek", "Michał", "Patrycja");

        long licznik = imiona.stream().filter(imie -> imie.length() >= 6).count();

        System.out.println("List zawiera " + licznik + " imiona");
    }
}
