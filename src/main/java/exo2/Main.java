package exo2;

import exo1.Command;
import exo1.Facture;
import exo1.Produit;

public class Main {
    public static void main(String[] args) {
       ICompte c=new CompteCourant("1","2002");
       c.addOperation(new Operation(5000,TypeOperation.Debit));
        System.out.println(c.getMontant());
        ICompte c1=new CompteEpargne("1","2002");
        c1.addOperation(new Operation(5000,TypeOperation.Debit));
        System.out.println(c1.getMontant());

    }
}