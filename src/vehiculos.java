public abstract class vehiculos {

    private String marca;
    private String modelo;
    private double tarifa;

    public vehiculos(String marca, String modelo, double tarifa) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifa = tarifa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public abstract double calcularAlquiler(int dias);
}


