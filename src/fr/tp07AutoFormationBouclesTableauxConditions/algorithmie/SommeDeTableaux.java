package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
 * {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
 * Créer un tableau qui contient la somme des 2 précédents tableaux
 */
public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int [] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        int[] somme = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            somme[i] = array1[i] + array2[i];
        }

        // Affichage du tableau somme
        System.out.println("Tableau contenant la somme des deux tableaux :");
        for (int val : somme) {
            System.out.print(val + " ");
        }
    }
}
