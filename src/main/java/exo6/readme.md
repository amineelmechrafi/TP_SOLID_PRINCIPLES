# **exercice 6**
```
public class ValidationAge {
    public boolean peutBoireAlcool(int age ,Region region) {
        if(region==Region.EAST)
            return age >= 18;
        return age >= 14;
    }

    public boolean peutUtiliserFesseBouk(int age,Region region) {
        if(region==Region.EAST)
        return age >= 15;
    return age >= 13;}
    public boolean peutEtreEluMaire(int age,Region region) {
        if(region==Region.EAST)
            return age >= 21;

        return age >=19;}
}
```
## Pricnipe du solide non respecte
**Open / closed** car chaque fois on aura une nouvelle region on doit modifier ca directement dans la classe **ValidationAge**
## Solution proposee
(Implementation dans le package exo6)