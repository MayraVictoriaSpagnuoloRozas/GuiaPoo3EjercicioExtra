public class Main {
    public static void main(String[] args) {
        MascotaServicio mascota1= new MascotaServicio();
        mascota1.AgregarMascota();
        System.out.println("Mascotas cargadas");
        mascota1.VerListaMascotas();

        System.out.println("Mascotas viejitas: ");
        mascota1.MascotaMayor6();

        System.out.println("Mascotas pequeñas: ");
        mascota1.MascotaMenor5();


    }
}