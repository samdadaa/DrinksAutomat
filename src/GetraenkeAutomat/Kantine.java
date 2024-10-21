package GetraenkeAutomat;
public class Kantine
{
    public static void main(String[] args)
    {
        Kaffeeautomat kaffeeautomat1= new Kaffeeautomat("kva-4711");
        Softdrinkautomat softdrinkautomat = new Softdrinkautomat("sva-3232");

        System.out.println(kaffeeautomat1.getBeschreibung());
        System.out.println(softdrinkautomat.getBeschreibung());
        softdrinkautomat.berechneFuellstand(3);
        System.out.println(softdrinkautomat.getBeschreibung());
        softdrinkautomat.fuelleSirupEin(100);
        System.out.println(softdrinkautomat.getBeschreibung());
    }
}
