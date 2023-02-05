import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAuto {
    private ArrayList<Auto> listaAutos;

    public ServicioAuto(){
        this.listaAutos= new ArrayList<>();
    }

    public Auto CrearAuto(String marca, int stock){
        Auto auto = new Auto(marca,stock);
        return auto;
    }

    public ArrayList<Auto> AgregarAuto(){
        System.out.println("Ingrese un auto para agregar en la lista");
        Scanner scanner= new Scanner(System.in);
        String fin="";
        do {
            System.out.println("Ingrese la marca del auto: ");
            String marca=scanner.next();
            System.out.println("Ingrese su stock: ");
            int stock=scanner.nextInt();

            listaAutos.add(CrearAuto(marca,stock));

            System.out.println("Si desea ingresar otro auto presione la letra s, de lo contrario presione" +
                    "cualquier tecla");
            fin=scanner.next();
        }while(fin.equalsIgnoreCase("s"));
        return listaAutos;

    }

    public void VerAutos(){
        for (Auto i: listaAutos) {
            System.out.println(i);

        }
    }
    public void AutoMayor10(){
        for (Auto i: listaAutos) {
            if (i.getStock()>10){
                System.out.println(i);
            }
        }
    }
    public void AutoMenor3(){
        for (Auto i: listaAutos) {
            if (i.getStock()<3){
                System.out.println(i);
            }
        }

    }




}
