package exo6;

public class ValidationAgeEast implements ValidationAge {
    @Override
    public boolean peutBoireAlcool(int age) {
        return age >= 18;
    }

    @Override
    public boolean peutUtiliserFesseBouk(int age) {
        return age >= 15;
    }

    @Override
    public boolean peutEtreEluMaire(int age) {
        return age >= 21;
    }
}
