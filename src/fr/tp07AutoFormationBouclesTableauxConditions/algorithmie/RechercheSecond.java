package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
 * Rechercher le second plus grand élément du tableau et affichez le
 */
public class RechercheSecond {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int max = array[0];
        // Je cherche le plus grand
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Je cherche le plus grand élément < max
        Integer secondMax = null; // null = pas encore trouvé

        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                if (secondMax == null || array[i] > secondMax) {
                    secondMax = array[i];
                }
            }
        }

        if (secondMax != null) {
            System.out.println("Le second plus grand élément est : " + secondMax);
        } else {
            System.out.println("Aucun second plus grand élément trouvé.");
        }
    }
}