package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

import java.util.Scanner;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme de tous les entiers compris entre 1 et ce nombre.
 * Exemple si l’utilisateur saisit 5, le programme affiche: 15
 */
public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;

        // Je demande un nombre entre 1 et 10 inclus à l'utilisateur (choix arbitraire de ma part)
        while (nb < 1 || nb > 10) {
            System.out.print("Veuillez entrer un nombre entre 1 et 10 inclus : ");
            nb = scanner.nextInt();
        }

        // Je calcule la somme de tous les entiers compris entre 1 et le nombre nb choisi par l'utilisateur
        int somme = 0;
        for (int i = 1; i <= nb; i++) {
            somme += i;
        }

        System.out.println("La somme des nombres entiers compris entre 1 et " + nb + " est : " + somme);

        scanner.close(); // Fermeture du scanner
    }
}