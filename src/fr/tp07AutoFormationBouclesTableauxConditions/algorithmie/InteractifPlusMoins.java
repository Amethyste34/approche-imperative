package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

import java.util.Scanner;
import java.util.Random;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Ecrire un jeu qui :
 * choisit un nombre aléatoire entre 1 et 100
 * puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est au-dessus ou en-dessous du nombre,
 * Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo, vous avez trouvé en N coups » où N représente le nombre d’essais effecté par l’utilisateur
 * Le programme se termine.
 */
public interface InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Nombre mystère random entre 1 et 100
        int nombreMystere = random.nextInt(100) + 1;
        int tentative;
        int nbCoups = 0;

        System.out.println("Devinez le nombre mystère entre 1 et 100 !");

        do {
            System.out.print("Votre proposition : ");
            tentative = scanner.nextInt();
            nbCoups++;

            if (tentative < nombreMystere) {
                System.out.println("C'est plus !");
            } else if (tentative > nombreMystere) {
                System.out.println("C'est moins !");
            }

        } while (tentative != nombreMystere);

        System.out.println("Bravo, vous avez trouvé en " + nbCoups + " coups !");
        scanner.close();
    }
}