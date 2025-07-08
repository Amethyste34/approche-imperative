package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

import java.util.Scanner;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de ces nombres.
 */
public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Je stocke les 10 nombres choisis par l'utilisateur
        int[] nombres = new int[10];
        int max = Integer.MIN_VALUE;

        System.out.println("Veuillez choisir 10 nombres : ");
        for (int i = 0; i < 10; i++) {
            int nombre = 0;

            // Je demande arbitrairement un nombre entre 1 et 50 inclus
            while (nombre < 1 || nombre > 50) {
                System.out.print("Entrez le nombre " + (i + 1) + " (entre 1 et 50 inclus) : ");
                nombre = scanner.nextInt();

                if (nombre < 1 || nombre > 50) {
                    System.out.println("Erreur : le nombre doit être entre 1 et 50 !");
                }
            }

            nombres[i] = nombre;

            if (nombre > max) {
                max = nombre;
            }
        }

        // J'affiche les nombres saisis
        System.out.print("Vous avez choisi les nombres : ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]);
            if (i < nombres.length - 1) {
                System.out.print(", ");
            }
        }

        // J'affiche le nombre le plus grand parmi les nombres choisis
        System.out.println("\nParmi ces nombres, le plus grand est : " + max);

        scanner.close();
    }
}