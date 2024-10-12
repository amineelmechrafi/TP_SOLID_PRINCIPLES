package exo2;

import java.util.ArrayList;

public class CompteEpargne implements ICompte{
    private ArrayList<Operation> operations;
    private String id;
    private String dateCreation;
    private double montant;

    public CompteEpargne(String id, String dateCreation) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.operations = new ArrayList<>();
        this.montant = 0;
    }
    @Override
    public boolean addOperation(Operation operation) {
        if(operation.getTypeOperation() == TypeOperation.Debit){
            this.operations.add(operation);
            this.montant+= operation.getMontant()*0.05;
            return true;
        }
        else{
            if(this.montant >= operation.getMontant()*0.1 &&
                    java.time.LocalDate.now().getYear() > Integer.parseInt(this.dateCreation.split("/")[2]))
            {
                this.operations.add(operation);
                this.montant-= operation.getMontant()*0.1;
                return true;
            }
            return false;
        }
    }

    @Override
    public double getMontant() {
        return montant;
    }
}
