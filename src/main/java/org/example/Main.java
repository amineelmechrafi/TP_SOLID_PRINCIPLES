package org.example;

import exo1.Command;
import exo1.Facture;
import exo1.Produit;

public class Main {
    public static void main(String[] args) {
        Produit p=new Produit();
        p.setLibele("Black cofee");
        p.setPrix(50);
        Produit p2=new Produit();
        p.setLibele("Green tea");
        p.setPrix(55.55);
        Command c=new Command(1);
        c.addProduit(p,5);
        c.addProduit(p2,6);
        Facture f=new Facture(c);
        f.saveFacture();

    }
}