package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

import java.util.Scanner;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle le nombre de
 * rang N est égal à la somme des nombres de rangs N-1 et N-2
 * Créer une classe TestFibonacci
 * Demander à l’utilisateur de choisir un rang N
 * Ecrire un algorithme qui calcule et affiche le nombre de rang N
 */
public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Je demande à l'utilisateur de choisir un rang N supérieur ou égal à zéro car la suite de Fibonacci commence à 0
        do {
            System.out.print("Entrez un rang N (entier positif ou nul) : ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("❌ Le rang ne peut pas être négatif. Essayez encore.");
            }
        } while (n < 0);

        int fib0 = 0;
        int fib1 = 1;
        int resultat = 0;

        System.out.print("Suite de Fibonacci jusqu'au rang " + n + " : ");

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                resultat = 0;
            } else if (i == 1) {
                resultat = 1;
            } else {
                resultat = fib0 + fib1;
                fib0 = fib1;
                fib1 = resultat;
            }

            System.out.print(resultat);
            if (i < n) {
                System.out.print(", ");
            }
        }

        System.out.println("\nLe nombre de rang " + n + " dans la suite de Fibonacci est : " + resultat);
        scanner.close();
    }
}