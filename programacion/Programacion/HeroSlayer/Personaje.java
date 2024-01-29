public class Personaje {
    public String nombrePersonaje;
    public Integer vidaPersonaje;

    public Integer getVidaPersonaje() {
        return vidaPersonaje;
    }

    public void setVidaPersonaje(Integer vidaPersonaje) {
        this.vidaPersonaje = vidaPersonaje;
    }

    public Personaje(String nombrePersonaje, Integer vidaPersonaje) {
        this.nombrePersonaje = nombrePersonaje;
        this.vidaPersonaje = vidaPersonaje;
    }
    
}