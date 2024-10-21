package GetraenkeAutomat;

public class Softdrinkautomat extends Getreankeautomat
{
    Softdrinksorte softdrinksorte;

    public Softdrinkautomat(String bezeichnung) {this(bezeichnung,Softdrinksorte.FANTA,100);}
    public Softdrinkautomat(String bezeichnung, Softdrinksorte softdrinksorte, int fuellstand) {
        super(bezeichnung, fuellstand);
        this.softdrinksorte = softdrinksorte;}

    private void setSoftdrinkSorte(Softdrinksorte softdrinksorte) {this.softdrinksorte = softdrinksorte;}
    public void neueSoftdrinkSorte(Softdrinksorte softdrinksorte) {setSoftdrinkSorte(softdrinksorte);}
    public Softdrinksorte getSoftdrinksorte(){return softdrinksorte;}
    public void fuelleSirupEin(int mengeInProzent)
    {System.out.println("Softdrinkautomat: "+ getBezeichnung()+" wurde mit "+fuelleAuf(mengeInProzent)+"% Sirup aufgefüllt");}
    public String getBeschreibung()
    {return "Softdrinkautomat "+ super.getBeschreibung()+" und "+getSoftdrinksorte().getSorte()+" Sorte";}
}
