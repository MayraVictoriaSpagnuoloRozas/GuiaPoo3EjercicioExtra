public class Auto {
    private String marca;
    private int stock;

    public Auto(){

    }

    public Auto(String marca, int stock) {
        this.marca = marca;
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", stock=" + stock +
                '}';
    }
}
