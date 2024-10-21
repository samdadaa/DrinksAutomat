package GetraenkeAutomat;

public enum Softdrinksorte
{
    COLA,
    FANTA,
    SPRIT;

    public String getSorte() {

        return Character.toUpperCase(name().charAt(0))
                +name().substring(1).toLowerCase();
    }
}
