package exo6;

public class ValidationAgeWest implements  ValidationAge {
    @Override
    public boolean peutBoireAlcool(int age) {
        return age>=14;
    }

    @Override
    public boolean peutUtiliserFesseBouk(int age) {
        return age >= 13;
    }

    @Override
    public boolean peutEtreEluMaire(int age) {
        return age >=19;
    }
}
