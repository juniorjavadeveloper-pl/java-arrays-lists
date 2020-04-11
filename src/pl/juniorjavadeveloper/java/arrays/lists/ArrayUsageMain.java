package pl.juniorjavadeveloper.java.arrays.lists;

public class ArrayUsageMain {
    public static void main(String[] args) {
        // Deklaracja tablicy typu/klasy String
        // tablica przechowująca 10 elementów
        // ---
        // Wyjaśnienie elementów od lewej do prawej:
        // - String - typ zmiennych przechowywanych w tablicy,
        // - [] - informacja, o tym, że tworzymy tablicę,
        // - colors - nazwa tablicy
        // = - przypisanie wartości do tablicy
        // new - tworzenie tablicy
        // [10] - rozmiar tablicy
        // utworzenie tablicy z dziesięcioma elementami
        String[] colors = new String[10];
        // przypisanie wartości do pierwszego elementu
        colors[0] = "black";
        // przypisanie wartości do ósmego elementu
        colors[9] = "white";

        String firstElement = colors[0];
        String fourthElement = colors[3];
        String tenthElement = colors[9];

        System.out.println("Pierwszy element tablicy: " + firstElement);
        System.out.println("Czwarty element tablicy: " + fourthElement);
        System.out.println("Dziesiąty, ostatni element tablicy: " + tenthElement);
        }
}
