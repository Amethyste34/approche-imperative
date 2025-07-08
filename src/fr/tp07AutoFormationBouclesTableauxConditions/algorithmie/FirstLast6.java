package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Dans cette classe, on déclare un tableau d’entiers
 * On calcule une valeur booléenne qui contrôle le tableau de la sorte :
 * elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le premier et le dernier élément du tableau ont la même valeur
 * elle vaut false dans les autres cas
 * Ecrire l’algo de valorisation de cette variable avec le minimum de ligne
 */
public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = {6, 1, 2, 3, 6};

        boolean memeDebutFin = false;

        if (array.length >= 1 && array[0] == array[array.length - 1]) {
            memeDebutFin = true;
        }

        System.out.println("Résultat : " + memeDebutFin);
    }
}
