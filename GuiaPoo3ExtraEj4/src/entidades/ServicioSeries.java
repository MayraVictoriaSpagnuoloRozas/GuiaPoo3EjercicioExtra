package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioSeries {

    private ArrayList<Series> listaSeries;

    public ServicioSeries(){
        this.listaSeries= new ArrayList<>();
    }

    public Series CrearSerie(String nombre, int duracionMinutos, String tipo){
        Series serie = new Series(nombre, duracionMinutos,tipo);
        return serie;
    }

    public ArrayList<Series> AgregarSerie(){
        System.out.println("Ingrese una serie");
        Scanner scanner= new Scanner(System.in);
        String fin="";
        do {
            System.out.println("Ingrese el nombre de la serie: ");
            String nombre=scanner.next();
            System.out.println("Ingrese su duración en minutos: ");
            int duracionMinutos=scanner.nextInt();
            System.out.println("Ingrese el tipo de serie: Romance, Acción o Comedia");
            String tipo= scanner.next();
            listaSeries.add(CrearSerie(nombre,duracionMinutos,tipo));

            System.out.println("Si desea ingresar otra serie presione la letra s, de lo contrario presione" +
                    "cualquier tecla");
            fin=scanner.next();
        }while(fin.equalsIgnoreCase("s"));
        return listaSeries;

    }

    public void VerSeries(){
        for (Series i: listaSeries) {
            System.out.println(i);

        }
    }
    public void SerieMayor40(){
        for (Series i: listaSeries) {
            if (i.getDuracionMinutos()>40){
                System.out.println(i);
            }
        }
    }
    public void SerieMenor15(){
        for (Series i: listaSeries) {
            if (i.getDuracionMinutos()<15){
                System.out.println(i);
            }
        }
    }
    public void SerieRomance(){
        for (Series i : listaSeries) {
            if (i.getTipo().equalsIgnoreCase("Romance")){
                    System.out.println(i);
                }
            }
        }

    public void SerieAccion(){
        for (Series i : listaSeries) {
            if (i.getTipo().equalsIgnoreCase("Accion")){
                System.out.println(i);
            }
        }
    }
    public void SerieComedia(){
        for (Series i : listaSeries) {
            if (i.getTipo().equalsIgnoreCase("Comedia")){
                System.out.println(i);
            }
        }
    }


}
