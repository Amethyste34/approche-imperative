package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

import java.util.Scanner;
import java.util.Random;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Le jeu est simple mais la réalisation est plus délicate. Vous allez jouer contre l’ordinateur.
 * Le jeu démarre avec un total de 21 bâtons.
 * Celui qui joue en 1er, joueur ou ordinateur, est tiré aléatoirement.
 * A tour de rôle, l’ordinateur et le joueur doivent prendre entre 1 à 3 bâtons.
 * Celui qui prend le dernier bâton a perdu.
 * Dans ce TP vous allez devoir imaginer vous-même le mécanisme à mettre en place, sur la base
 * de ce que vous avez vu précédemment.
 */
public class Interfactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int batonsRestants = 21;
        boolean tourJoueur = random.nextBoolean(); // true = joueur, false = ordi

        System.out.println("Bienvenue dans le jeu des 21 bâtons !");
        System.out.println("Celui qui prend le dernier bâton a perdu !");
        System.out.println("Il y a " + batonsRestants + " bâtons au départ.");
        if (tourJoueur) {
            System.out.println("Vous commencez.");
        } else {
            System.out.println("L'ordinateur commence.");
        }

        while (batonsRestants > 0) {
            System.out.println("\nBâtons restants : " + batonsRestants);

            int prise;

            if (tourJoueur) {
                // Tour du joueur
                do {
                    System.out.print("Combien de bâtons voulez-vous prendre ? (1 à 3) : ");
                    prise = scanner.nextInt();

                    if (prise < 1 || prise > 3 || prise > batonsRestants) {
                        System.out.println("❌ Choix invalide. Réessayez.");
                    }
                } while (prise < 1 || prise > 3 || prise > batonsRestants);

                batonsRestants -= prise;

                if (batonsRestants == 0) {
                    System.out.println("💥 Vous avez pris le dernier bâton. Vous avez perdu !");
                    break;
                }

            } else {
                // Tour de l'ordinateur (stratégie simple ou aléatoire)
                prise = Math.min(3, batonsRestants);

                // Petite stratégie : essayer de forcer l'adversaire à perdre
                if (batonsRestants % 4 != 1) {
                    prise = batonsRestants % 4;

                    // Correction : éviter de prendre 0 bâton
                    if (prise == 0) {
                        prise = 1;
                    }
                } else {
                    prise = random.nextInt(Math.min(3, batonsRestants)) + 1;
                }

                System.out.println("🤖 L'ordinateur prend " + prise + " bâton(s).");
                batonsRestants -= prise;

                if (batonsRestants == 0) {
                    System.out.println("🎉 L'ordinateur a pris le dernier bâton. Vous avez gagné !");
                    break;
                }
            }

            tourJoueur = !tourJoueur; // Changement de tour
        }

        scanner.close();
    }
}