package fr.algorithmie;

import static java.lang.Math.max;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        int maxLength = max(array1.length, array2.length);
        int[] somme = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            @SuppressWarnings("ConditionAlwaysTrue")
            int val1 = (i < array1.length) ? array1[i] : 0;
            int val2 = (i < array2.length) ? array2[i] : 0;
            somme[i] = val1 + val2;
        }

        // Affichage
        System.out.println("Somme des deux tableaux de tailles différentes :");
        for (int val : somme) {
            System.out.print(val + " ");
        }
    }
}
