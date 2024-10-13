package exo4;

public abstract class EnseignentBase extends MembreAcademique {


    public EnseignentBase(String nom, String prenom) {
        super(nom, prenom);
    }
    public abstract String getGrade();
}
