public class Mascota {

    private String tipoMascota;
    private int edad;
    private String nombre;

    public Mascota(){
    }

    public Mascota(String tipoMascota, int edad, String nombre) {
        this.tipoMascota = tipoMascota;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "tipoMascota='" + tipoMascota + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
