public class moto extends vehiculos {

    public moto(String marca, String modelo, double tarifa) {
        super(marca, modelo, tarifa);
    }

    @Override
    public double calcularAlquiler(int dias) {

        double recargoFijo = 5;

        double total = (getTarifa() * dias) + recargoFijo;

        return total;
    }
}
