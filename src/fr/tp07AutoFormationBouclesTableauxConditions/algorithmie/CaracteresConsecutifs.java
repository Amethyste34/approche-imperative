package fr.tp07AutoFormationBouclesTableauxConditions.algorithmie;

/**
 * Exercice réalisé par Laurence SAGOT le 08/07/2025
 * Soit une chaine de caractères quelconque, transformez cette chaîne en comptant les
 * répétitions successives (ex : "aaabbc" → "a3b2c1").
 */
public class CaracteresConsecutifs {
    public static void main(String[] args) {
        String texte = "aaabbc";
        String resultat = "";

        if (texte.length() > 0) {
            char caractereCourant = texte.charAt(0);
            int compteur = 1;

            for (int i = 1; i < texte.length(); i++) {
                if (texte.charAt(i) == caractereCourant) {
                    compteur++;
                } else {
                    resultat += caractereCourant + String.valueOf(compteur);
                    caractereCourant = texte.charAt(i);
                    compteur = 1;
                }
            }

            // J'ajoute le dernier groupe
            resultat += caractereCourant + String.valueOf(compteur);
        }

        System.out.println("Chaîne compressée : " + resultat);
    }
}