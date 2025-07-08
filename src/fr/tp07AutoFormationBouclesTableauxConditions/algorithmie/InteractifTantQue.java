package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

import java.util.Scanner;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement compris entre 1 et 10 :
 * Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un nombre à l’utilisateur.
 * Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.
 * Instruction pour poser une question à l’utilisateur :
 * Nous allons utiliser la classe java.util.Scanner.
 * Scanner scanner = new Scanner(System.in) ;
 * int nb = scanner.nextInt() ;
 */
public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;

        while (nb < 1 || nb > 10) {
            System.out.print("Veuillez entrer un nombre entre 1 et 10 inclus : ");
            nb = scanner.nextInt();
        }

        System.out.println("Vous avez entré : " + nb);
        scanner.close(); // Fermeture du scanner
    }
}
