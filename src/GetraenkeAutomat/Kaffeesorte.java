package GetraenkeAutomat;

public enum Kaffeesorte
{

    KAFFEE ,
    CAPPUCCINO,
    ESPRESSO,
    LATTE;


    public String getSorte() {

        return Character.toUpperCase(name().charAt(0))
                +name().substring(1).toLowerCase();
    }
}
