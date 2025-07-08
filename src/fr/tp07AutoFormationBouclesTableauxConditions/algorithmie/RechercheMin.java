package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

/**
 * Exercice réalisé par Luarence SAGOT le 08/07/2025
 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
 * Rechercher le plus petit élément du tableau
 */
public class RechercheMin {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Je suppose que le premier élément est le plus petit
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                // Je mets à jour si js trouve plus petit
                min = array[i];
            }
        }

        System.out.println("Le plus petit élément du tableau est : " + min);
    }
}
