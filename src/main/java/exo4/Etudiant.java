package exo4;

public class Etudiant extends EtudiantBase {

    private Integer numero;

    public Etudiant(String nom, String prenom, Integer numero) {
        super(nom,prenom,numero);
    }



    public Integer getNumero() {
        return numero;
    }
}
