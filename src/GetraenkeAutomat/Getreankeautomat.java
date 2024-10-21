package GetraenkeAutomat;

 public abstract class Getreankeautomat
{
    private  String bezeichnung;
    private int fuellstand;

    public Getreankeautomat(String bezeichnung)
    {
        this(bezeichnung,100);
    }
    public Getreankeautomat(String bezeichnung, int fuellstand)
    {
        setBezeichnung(bezeichnung);
        setFuellstand(fuellstand);
    }
    protected void setBezeichnung(String bezeichnung) {
        if (bezeichnung == null || bezeichnung.isEmpty()) {
            throw new IllegalArgumentException("Die Bezeichnung von der Kaffeeautomat darf nicht leer sein !");
        } else {
            this.bezeichnung = bezeichnung.toUpperCase();
        }
    }
    protected final void setFuellstand(int fuellstand) {
        try {
            if (fuellstand>=0 && fuellstand<=100)
            {
                this.fuellstand = fuellstand;
            }else {
                System.out.println("ungültiger Wert für Füllstand !");
            }
        }catch (Exception e)
        {e.getStackTrace();}
    }
    protected void berechneFuellstand(int st)
    {
        st = st * 5;
        setFuellstand(getFuellstand()-st);
    }
    protected final int fuelleAuf(int mengeInProzent)
    {
        int aktuellFuellstand = getFuellstand();
        int neuerFuellstand = Math.min(100,aktuellFuellstand+mengeInProzent);
        setFuellstand(neuerFuellstand);
        return neuerFuellstand-aktuellFuellstand;
    }
    protected  int getFuellstand() {return fuellstand;}
    protected String getBezeichnung() {return bezeichnung;}
    protected String getBeschreibung() {
        return getBezeichnung()+" mit Füllstand "+getFuellstand()+"%";
    }
}
