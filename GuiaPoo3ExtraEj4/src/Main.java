import entidades.ServicioSeries;

public class Main {
    public static void main(String[] args) {

        ServicioSeries serie1= new ServicioSeries();
        serie1.AgregarSerie();
        System.out.println("Series cargadas");
        serie1.VerSeries();

        System.out.println("Series cuya duración supera los 40 minutos: ");
        serie1.SerieMayor40();

        System.out.println("Series cuya duración no alcanza los 15 minutos: ");
        serie1.SerieMenor15();

        System.out.println("Series de Romance: ");
        serie1.SerieRomance();

        System.out.println("Series de Acción: ");
        serie1.SerieAccion();

        System.out.println("Series de Comedia: ");
        serie1.SerieComedia();

    }
}