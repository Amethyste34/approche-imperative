package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int min = array[0]; // Je suppose que le premier élément est le plus petit

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Je mets à jour si js trouve plus petit
            }
        }

        System.out.println("Le plus petit élément du tableau est : " + min);
    }
}
