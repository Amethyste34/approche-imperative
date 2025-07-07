package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        for (int i = 0 ; i < 11 ; i++) {
            System.out.println(i);
        }
        for (int i = 0 ; i < 11 ; i++) {
            if (i % 2 == 0) {
            System.out.println(i);
            }
        }
        for (int i = 0 ; i < 10 ; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        i = 0;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        i = 0;
        while (i < 10) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }
}
