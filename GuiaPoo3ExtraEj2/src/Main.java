public class Main {
    public static void main(String[] args) {
        ServicioLibro libro1= new ServicioLibro();
        libro1.AgregarLibro();
        System.out.println("Libros cargados");
        libro1.VerLibros();

        System.out.println("Libros con 300 páginas o más: ");
        libro1.LibroMayor300();

        System.out.println("Libros con menos de 150 páginas: ");
        libro1.LibroMenor150();

    }
}