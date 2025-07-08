package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

import java.util.Scanner;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Ecrire un programme qui demande un nombre à l’utilisateur puis qui affiche les 10 nombres suivants.
 * Par exemple si l’utilisateur saisit 5, le programme affiche : 6, 7, 8, 9, 10, 11, 12, 13, 14, 15.
 */
public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;

        // Je demande un nombre entre 1 et 100 inclus à l'utilisateur (choix arbitraire de ma part)
        while (nb < 1 || nb > 100) {
            System.out.print("Veuillez entrer un nombre entre 1 et 100 inclus : ");
            nb = scanner.nextInt();
        }

        // J'affiche les 10 nombres suivants le nombre choisi par l'utilisateur
        System.out.println("Les 10 nombres qui suivent " + nb + " sont : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(nb + i + " ");
        }

        scanner.close(); // Fermeture du scanner

    }
}