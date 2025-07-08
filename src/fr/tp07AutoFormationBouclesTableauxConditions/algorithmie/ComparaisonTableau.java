package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Soit les tableaux suivants :
 * int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
 * int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
 * Ecrire le code permettant de compter le nombre d’éléments en commun dans ces 2 tableaux
 */
public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        int compteur = 0;

        for (int i = 0; i < array1.length; i++) {
            int valeur = array1[i];
            boolean dejaCompte = false;

            // Vérifier si la valeur a déjà été comptée
            for (int j = 0; j < i; j++) {
                if (array1[j] == valeur) {
                    dejaCompte = true;
                    break;
                }
            }

            if (!dejaCompte) {
                // Vérifier si la valeur existe dans array2, je ne compte qu'une seule fois
                for (int k = 0; k < array2.length; k++) {
                    if (valeur == array2[k]) {
                        compteur++;
                        break;
                    }
                }
            }
        }

        System.out.println("Nombre d'éléments en commun : " + compteur);
    }
}
