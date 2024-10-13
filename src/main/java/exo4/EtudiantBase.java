package exo4;

public abstract class EtudiantBase extends MembreAcademique {



    public EtudiantBase(String nom, String prenom, Integer numero) {
        super(nom, prenom);

    }

    public abstract Integer getNumero();
}
