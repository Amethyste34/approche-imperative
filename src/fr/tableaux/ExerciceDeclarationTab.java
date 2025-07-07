package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] myTab = { 8, -7, 12, 1, -2, 14,
                17, 9};
        System.out.println(myTab[0]);
        System.out.println(myTab.length);
        System.out.println(myTab[7]);
        System.out.println(myTab[10]); //Erreur ArrayIndexOutOfBoundsException car l'index 10 n'existe pas dans le tableau myTab
    }
}
