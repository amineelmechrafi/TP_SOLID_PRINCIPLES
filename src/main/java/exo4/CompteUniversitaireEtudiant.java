package exo4;

public class CompteUniversitaireEtudiant {
    private EnseignentBase etudiant;
    private String login;

    public CompteUniversitaireEtudiant(EnseignentBase etudiant) {
        super();
        this.etudiant = etudiant;
    }
    public void genererLogin(){
        String login = this.etudiant.getPrenom().charAt(0)+this.etudiant.getNom() + "usms.ac.ma";
        this.login = login;
    }
}
