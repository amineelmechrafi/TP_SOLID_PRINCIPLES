package exo4;

public class CompteUniversitaireEnseignent implements ICompte {
    private EnseignentBase enseignentBase;
    private String login;

    public CompteUniversitaireEnseignent(EnseignentBase enseignentBase) {
        super();
        this.enseignentBase = enseignentBase;
    }
    public void genererLogin(){
        String login = this.enseignentBase.getPrenom()+this.enseignentBase.getNom() + this.enseignentBase.getGrade()+"usms.ma";
        this.login = login;
    }
}
