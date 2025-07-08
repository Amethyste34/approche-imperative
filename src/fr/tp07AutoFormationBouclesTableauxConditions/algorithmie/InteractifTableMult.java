package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

import java.util.Scanner;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et 10.
 * Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de multiplication de ce nombre.
 * Exemple :
 * Table de 3 :
 * 3 * 1 = 3
 * 3 * 2 = 6
 * …
 * 3 * 10 = 30
 */
public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;

        // Je demande un nombre entre 1 et 10 à l'utilisateur
        while (nb < 1 || nb > 10) {
            System.out.print("Veuillez entrer un nombre entre 1 et 10 inclus : ");
            nb = scanner.nextInt();
        }

        // J'affiche la table de multiplication correspondante
        System.out.println("Table de " + nb + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + " * " + i + " = " + (nb * i));
        }

        scanner.close(); // Fermeture du scanner
    }
}