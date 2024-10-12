package exo1;

import java.util.HashMap;
import java.util.Map;

public class Command {
    private int id;
    private HashMap<Produit, Integer> produits;
    private static double TVA;
    public Command(int id) {
        this.id = id;
        this.produits = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Produit, Integer> getProduits() {
        return produits;
    }

    public void setProduits(HashMap<Produit, Integer> produits) {
        this.produits = produits;
    }

    public static double getTVA() {
        return TVA;
    }

    public static void setTVA(double TVA) {
        Command.TVA = TVA;
    }

    public void addProduit(Produit produit, int quantité){
        this.produits.put(produit, quantité);
    }

    public double getTotal(){
        double total = 0;
        for (Map.Entry mapentry : this.produits.entrySet()) {
            total+= ((Produit)mapentry.getKey()).getPrix() * ((Integer)mapentry.getValue());
        }
        return total;
    }
    public double getTotalTTC(){
        return this.getTotal()*(1+this.TVA);
    }

    private void printProductsList(){
        double prix;
        for (Map.Entry mapentry : this.produits.entrySet()) {
            prix = ((Produit)mapentry.getKey()).getPrix() * ((Double)mapentry.getValue());
            System.out.println(mapentry.getKey() + "\t" + mapentry.getValue() + " : " +
                    prix );
        }
    }
    public void imprimer(){
        printProductsList();
        System.out.println("Prix = " + this.getTotal());
        System.out.println("PrixTTC = " + this.getTotalTTC());
    }
}
