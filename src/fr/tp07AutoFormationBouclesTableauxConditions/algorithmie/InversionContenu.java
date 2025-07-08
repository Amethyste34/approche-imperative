package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
 * Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais
 * dans l’ordre inverse.
 * Afficher l’ensemble des éléments des 2 tableaux
 */
public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopy = new int[array.length];

        // Copie en ordre inverse
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length - 1 - i];
        }

        // Affichage de array
        System.out.println("**********  CONTENU DU TABLEAU ARRAY  **********");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println(); // saut de ligne

        // Affichage de arrayCopy
        System.out.println("**********  CONTENU DU TABLEAU ARRAYCOPY (ORDRE INVERSE)  **********");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + " ");
        }
    }
}
