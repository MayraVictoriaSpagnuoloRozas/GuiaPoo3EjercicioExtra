import java.util.ArrayList;
import java.util.Scanner;

public class MascotaServicio {
    String fin="";
    private ArrayList<Mascota> listaMascotas;

    public MascotaServicio(){
        this.listaMascotas= new ArrayList<>();
    }

    public Mascota CrearMascota(String tipoMascota, int edad, String nombre){
        Mascota mascota = new Mascota(tipoMascota,edad,nombre);
        return mascota;
    }

    public ArrayList<Mascota> AgregarMascota(){
        System.out.println("Ingrese una mascota");
        Scanner scanner= new Scanner(System.in);
        String fin="";
        do {
            System.out.println("Ingrese el tipo mascota: ");
            String tipoMascota=scanner.next();
            System.out.println("Ingrese la edad: ");
            int edad=scanner.nextInt();
            System.out.println("Ingrese el nombre de la mascota: ");
            String nombre=scanner.next();

            listaMascotas.add(CrearMascota(tipoMascota,edad,nombre));

            System.out.println("Si desea ingresar otra mascota presione la letra s, de lo contrario presione" +
                    "cualquier tecla");
            fin=scanner.next();
        }while(fin.equalsIgnoreCase("s"));
        return listaMascotas;

    }

    public void VerListaMascotas(){
        for (Mascota i: listaMascotas) {
            System.out.println(i);

        }
    }
    public void MascotaMayor6(){
        for (Mascota i: listaMascotas) {
            if (i.getEdad()>6){
                System.out.println(i);
            }
        }
    }
    public void MascotaMenor5(){
        for (Mascota i: listaMascotas) {
            if (i.getEdad()<100){
                System.out.println(i);
            }
        }

    }
}
