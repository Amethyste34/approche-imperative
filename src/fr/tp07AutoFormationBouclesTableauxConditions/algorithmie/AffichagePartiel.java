package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
 * Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
 * Combiner une boucle et un test de manière à n’afficher que les entiers pairs
 * Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs
 * Combiner une boucle et un test de manière à n’afficher que les entiers impairs
 */
public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("**********  ENTIERS > 3  **********");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("\n**********  ENTIERS PAIRS  **********");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("\n**********  VALEURS AUX INDEX PAIRS  **********");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("\n**********  ENTIERS IMPAIRS  **********");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
