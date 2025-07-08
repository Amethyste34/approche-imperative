package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Dans cette classe, on déclare un entier
 * Ecrire l’algorithme permettant de détermine si un nombre est parfait ou non :
 * Un nombre est parfait s’il est égal à la somme de ses diviseurs (excepté lui-même).
 * Exemple : 6 est parfait car : 6 = 1 + 2 + 3
 * Ecrire l’algo de valorisation de cette variable avec le minimum de ligne
 */
public class NombreParfait {
    public static void main(String[] args) {
        int nombre = 6;
        int somme = 0;

        for (int i = 1; i < nombre; i++) {
            if (nombre % i == 0) {
                somme += i;
            }
        }

        boolean estParfait = (somme == nombre);
        System.out.println("Le nombre " + nombre + " est parfait ? " + estParfait);
    }
}