package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int max = array[0]; // Je suppose que le premier élément est le plus grand

        for (int i = 1 ; i < array.length ; i++) {
            if (array[i] > max) {
                max = array[i]; // Je mets à jour si je trouve plus grand
            }
        }

        System.out.println("Le plus grand élément du tableau est : " + max);
    }
}
