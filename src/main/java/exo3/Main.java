package exo3;


public class Main {
    public static void main(String[] args) {
        MatriceYoung matriceYoung = new MatriceYoung(3, 3);

        matriceYoung.add(1);
        matriceYoung.add(2);
        matriceYoung.add(3);
        matriceYoung.add(4);
        matriceYoung.add(5);
        matriceYoung.add(6);
        matriceYoung.add(7);
        matriceYoung.add(8);

        System.out.println("Tableau après les insertions :");
        matriceYoung.printTabbleau();

        int min = matriceYoung.extraireMin();
        System.out.println("Minimum extrait : " + min);

        System.out.println("Tableau après l'extraction du minimum :");
        matriceYoung.printTabbleau();

        matriceYoung.add(9);
        System.out.println("Tableau après insertion de 9 :");
        matriceYoung.printTabbleau();

        boolean added = matriceYoung.add(10);
        if (!added) {
            System.out.println("Impossible d'insérer, le tableau est plein.");
        }
    }
}
