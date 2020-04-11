package pl.juniorjavadeveloper.java.arrays.lists;

import java.util.ArrayList;
import java.util.List;

public class ListUsageMain {
    public static void main(String[] args) {
        // Deklaracja listy typu/klasy String
        // domyślnie ArrayList przechowuje 10 elementów
        // ---
        // Wyjaśnienie elementów od lewej do prawej:
        // - List - typ zmiennej umożliwiającej operacje na liście
        // - <String> - typ generyczny listy, mówi o tym jakie elementy może przechowywać lista
        // - colors - nazwa zmiennej
        // = - przypisanie wartości do listy
        // new - tworzenie obiektu
        // ArrayList - typ listy
        List<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("white");
        colors.add("red");

        System.out.println("Pierwszy element listy: " + colors.get(0));
        System.out.println("Drugi element listy: " + colors.get(1));
        System.out.println("Trzeci element listy: " + colors.get(2));

        System.out.println("Zawartość całej listy: " + colors);
    }
}
