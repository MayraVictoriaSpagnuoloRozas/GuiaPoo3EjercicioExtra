package entidades;

public class Series {
    private String nombre;
    private int duracionMinutos;
    private String tipo;
    public Series(){

    }
    public Series(String nombre, int duracionMinutos, String tipo) {
        this.nombre = nombre;
        this.duracionMinutos = duracionMinutos;
        this.tipo = tipo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipoRomanceAccionComedia(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Series{" +
                "nombre='" + nombre + '\'' +
                ", duracionMinutos=" + duracionMinutos +
                ", tipoRomanceAccionComedia='" + tipo + '\'' +
                '}';
    }
}
