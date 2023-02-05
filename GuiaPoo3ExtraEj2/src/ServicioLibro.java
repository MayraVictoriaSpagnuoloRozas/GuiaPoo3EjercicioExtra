import java.util.ArrayList;
import java.util.Scanner;

public class ServicioLibro {
    private ArrayList<Libro> listaLibros;

    public ServicioLibro(){
        this.listaLibros= new ArrayList<>();
    }

    public Libro CrearLibro(String titulo, String autor, int numeroPaginas){
        Libro libro = new Libro(titulo,autor,numeroPaginas);
        return libro;
    }

    public ArrayList<Libro> AgregarLibro(){
        System.out.println("Ingrese un libro para agregar en la lista");
        Scanner scanner= new Scanner(System.in);
        String fin="";
        do {
            System.out.println("Ingrese el título del libro: ");
            String titulo=scanner.next();
            System.out.println("Ingrese el autor: ");
            String autor=scanner.next();
            System.out.println("Ingrese la cantidad de páginas: ");
            int numeroPaginas=scanner.nextInt();

            listaLibros.add(CrearLibro(titulo,autor,numeroPaginas));

            System.out.println("Si desea ingresar otro libro presione la letra s, de lo contrario presione" +
                    "cualquier tecla");
            fin=scanner.next();
        }while(fin.equalsIgnoreCase("s"));
        return listaLibros;

    }

    public void VerLibros(){
        for (Libro i: listaLibros) {
            System.out.println(i);

        }
    }
    public void LibroMayor300(){
        for (Libro i: listaLibros) {
            if (i.getNumeroPaginas()>=300){
                System.out.println(i);
            }
        }
    }
    public void LibroMenor150(){
        for (Libro i: listaLibros) {
            if (i.getNumeroPaginas()<150){
                System.out.println(i);
            }
        }

    }


}
