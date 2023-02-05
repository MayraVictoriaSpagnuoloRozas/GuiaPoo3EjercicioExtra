public class Main {
    public static void main(String[] args) {
        ServicioAuto auto1= new ServicioAuto();
        auto1.AgregarAuto();
        System.out.println("Autos cargados");
        auto1.VerAutos();

        System.out.println("Autos con mas de 10 de stock: ");
        auto1.AutoMayor10();

        System.out.println("Autos con menos de 3 de stock: ");
        auto1.AutoMenor3();


    }
}