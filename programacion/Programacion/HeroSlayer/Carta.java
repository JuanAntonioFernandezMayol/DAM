public class Carta {
    private String nombreCarta;
    private TipoCarta tipoCarta;
    private Integer ataqueCarta;

    public Carta(String nombreCarta, TipoCarta tipoCarta, Integer ataqueCarta) {
        this.nombreCarta = nombreCarta;
        this.tipoCarta = tipoCarta;
        this.ataqueCarta = ataqueCarta;

    }

    public void pintarInformacion() {
        System.out.println("Nombre de la Carta: " + nombreCarta);
        System.out.println("El tipo de la Carta es: " + tipoCarta);
        System.out.println("El ataque de la carta es: " + ataqueCarta);
    }

    public String getNombreCarta() {
        return nombreCarta;
    }

    public void setNombreCarta(String nombreCarta) {
        this.nombreCarta = nombreCarta;
    }

    public TipoCarta getTipoCarta() {
        return tipoCarta;
    }

    public void setTipoCarta(TipoCarta tipoCarta) {
        this.tipoCarta = tipoCarta;
    }

    public Integer getAtaqueCarta() {
        return ataqueCarta;
    }

    public void setAtaqueCarta(Integer ataqueCarta) {
        this.ataqueCarta = ataqueCarta;
    }
}