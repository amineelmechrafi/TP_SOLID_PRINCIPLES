package exo6;

public class ValidationAgeMuslims implements ValidationAge {

    @Override
    public boolean peutBoireAlcool(int age) {
        return false;
    }

    @Override
    public boolean peutUtiliserFesseBouk(int age) {
        return true;
    }

    @Override
    public boolean peutEtreEluMaire(int age) {
        return age>=22;
    }
}
