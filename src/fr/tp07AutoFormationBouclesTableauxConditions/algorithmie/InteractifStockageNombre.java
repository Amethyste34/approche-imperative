package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Faire un programme avec le menu suivant :
 * 1. Ajouter un nombre
 * 2. Afficher les nombres existants.
 * Description :
 * Demander à l’utilisateur de choisir une option dans le menu.
 * Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à l’utilisateur puis l’ajoute à un tableau.
 * Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau.
 * Si le tableau est plein, écrire un algorithme pour agrandir le tableau.
 * Je rajoute la possibilité de stopper le programme pour améliorer l'expérience utilisateur
 * Pour les icônes, j'utilise Emojipedia
 */
public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nombres = new int[5]; // Taille initiale de mon tableau nombres
        int count = 0; // Nombre de valeurs ajoutées
        boolean continuer = true;

        while (continuer) {
            // Affichage du menu
            System.out.println("\nMenu :");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    // J'agrandis le tableau si nécessaire
                    if (count == nombres.length) {
                        nombres = Arrays.copyOf(nombres, nombres.length * 2);
                        System.out.println("🔧 Le tableau a été agrandi !");
                    }

                    // Demander un nombre à l’utilisateur
                    System.out.print("Entrez un nombre : ");
                    int nouveauNombre = scanner.nextInt();
                    nombres[count] = nouveauNombre;
                    count++;
                    System.out.println("✅ Nombre ajouté !");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("⚠️ Aucun nombre enregistré pour l’instant.");
                    } else {
                        System.out.print("📦 Nombres enregistrés : ");
                        for (int i = 0; i < count; i++) {
                            System.out.print(nombres[i] + " ");
                        }
                        System.out.println(); // retour à la ligne
                    }
                    break;

                case 3:
                    System.out.println("👋 Programme terminé. À bientôt !");
                    continuer = false;
                    break;

                default:
                    System.out.println("❌ Option invalide. Choisissez 1, 2 ou 3.");
            }
        }
    }
}