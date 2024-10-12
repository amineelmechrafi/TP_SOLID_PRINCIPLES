package exo2;

import java.util.ArrayList;

public class CompteCourant implements ICompte {
    private ArrayList<Operation> operations;
    private String id;
    private String dateCreation;
    private double montant;
    public CompteCourant(String id, String dateCreation) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.operations = new ArrayList<>();
        this.montant = 0;
    }
    @Override
    public boolean addOperation(Operation operation) {
        if(operation.getTypeOperation() == TypeOperation.Debit){
            this.operations.add(operation);
            this.montant+= operation.getMontant();
            return true;
        }
        else{
            if(this.montant >= operation.getMontant()){
                this.operations.add(operation);
                this.montant-= operation.getMontant();
                return true;
            }
            return false;
        }
    }

    public double getMontant() {
        return montant;
    }


}
