package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 * Afficher l’ensemble des éléments du tableau grâce à une boucle
 * Afficher l’ensemble des éléments dans l’ordre inverse du tableau
 * Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
 * Affichage de arrayCopy
 */
public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("**********  AFFICHAGE DE ARRAY  **********");
        for (int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("**********  AFFICHAGE DE ARRAY SENS INVERSE  **********");
        for (int i = array.length - 1 ; i >= 0 ; i--) {
            System.out.print(array[i] + " ");

        }
        // création du tableau vide de même taille
        int[] arrayCopy = new int[array.length];

        // copie élément par élément
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        System.out.println();
        System.out.println("**********  AFFICHAGE DE ARRAYCOPY  **********");
        for (int i = 0 ; i < array.length ; i++) {
            System.out.print(arrayCopy[i] + " ");
        }
    }
}
