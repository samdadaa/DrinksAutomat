package GetraenkeAutomat;



public class Kaffeeautomat extends Getreankeautomat
{
    private Kaffeesorte kaffeesorte;

    public Kaffeeautomat(String bezeichnung) {this(bezeichnung, Kaffeesorte.KAFFEE,100);}
    public  Kaffeeautomat(String bezeichnung, Kaffeesorte kaffeesorte, int fuellstand)
    {super(bezeichnung,fuellstand);setKaffeesorte(kaffeesorte);}

    private void setKaffeesorte(Kaffeesorte kaffeesorte) {this.kaffeesorte = kaffeesorte;}
    public void neueKaffeeSorte(Kaffeesorte kaffeesorte) {setKaffeesorte(kaffeesorte);}
    public Kaffeesorte getKaffeesorte() {return kaffeesorte;}
    public void fuelleBohnenEin(int mengeInProzent)
    {System.out.println("Kaffeeautomat: "+ getBezeichnung()+" wurde mit "+fuelleAuf(mengeInProzent)+"% Bohnen aufgefüllt");}
    public String getBeschreibung()
    {return "Kaffeeautomat "+super.getBeschreibung()+" und "+getKaffeesorte().getSorte()+" Sorte";}
}
