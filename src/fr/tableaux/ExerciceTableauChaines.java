package fr.tableaux;
import java.util.Arrays;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] villes = {"Marseille", "Montpellier", "Nîmes", "Toulouse", "Paris"};
        System.out.println(Arrays.toString(villes));
        System.out.println(villes.length);
        villes[3] = "Reims";
        System.out.println(Arrays.toString(villes));
    }
}
