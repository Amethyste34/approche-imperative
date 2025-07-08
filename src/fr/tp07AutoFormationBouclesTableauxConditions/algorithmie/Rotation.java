package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Dans cette classe, on déclare un tableau d’entiers
 * Effectuez une rotation à droite des éléments.
 * Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}
 */
public class Rotation {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};
        int taille = array.length;

        if (taille > 1) {
            int dernier = array[taille - 1];

            // Je décalage les éléments vers la droite
            for (int i = taille - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }

            // Je placer le dernier élément au début
            array[0] = dernier;
        }

        // Affichage du résultat
        System.out.print("Tableau après rotation : ");
        for (int val : array) {
            System.out.print(val + " ");
        }
    }
}