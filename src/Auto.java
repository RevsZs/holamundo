public class Auto extends vehiculos {

    public Auto(String marca, String modelo, double tarifa) {
        super(marca, modelo, tarifa);
    }

    @Override
    public double calcularAlquiler(int dias) {

        double costoAdicional = 10;

        double total = (getTarifa() * dias) + (costoAdicional * dias);

        return total;
    }
}
