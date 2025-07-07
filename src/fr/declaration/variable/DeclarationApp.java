package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        //déclarez une variable de chacun des types suivants avec un littéral
        //différent de 0 pour les chiffres
        byte a = 2;
        short b = 5;
        int c = 10;
        long d = 6957232;
        float e = 18.45F;
        double f = 36.4;
        char g = 'A';
        boolean h = true;
        String i = "Bonjour";

        //Affichage des variables
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        String randomString = "Voici le résultat d’un calcul :\n1+5=6";
        System.out.println(randomString);
    }

}
