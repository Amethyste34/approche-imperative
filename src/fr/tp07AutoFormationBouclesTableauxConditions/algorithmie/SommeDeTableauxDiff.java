package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

import static java.lang.Math.max;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
 * {-1, 12, 17, 14, 5, -9, 0, 18 };
 * Créer un tableau qui contient la somme des 2 précédents tableaux
 */
public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };

        int maxLength = Math.max(array1.length, array2.length);
        int[] somme = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int val1;
            int val2;

            if (i < array1.length) {
                val1 = array1[i];
            } else {
                val1 = 0;
            }

            if (i < array2.length) {
                val2 = array2[i];
            } else {
                val2 = 0;
            }

            somme[i] = val1 + val2;
        }

        // Affichage
        System.out.println("Somme des deux tableaux de tailles différentes :");
        for (int val : somme) {
            System.out.print(val + " ");
        }
    }
}