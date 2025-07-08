package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
 * Rechercher le plus grand élément du tableau
 */
public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Je suppose que le premier élément est le plus grand
        int max = array[0];

        for (int i = 1 ; i < array.length ; i++) {
            if (array[i] > max) {
                // Je mets à jour si je trouve plus grand
                max = array[i];
            }
        }

        System.out.println("Le plus grand élément du tableau est : " + max);
    }
}
