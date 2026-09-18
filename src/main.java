import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        int dias = 5;

        List<vehiculos> ListaVe = new ArrayList<>();

        ListaVe.add(new Auto("Ferrari", "Testarossa", 10000));
        ListaVe.add(new moto("Ducati", "Ducati Tank", 5000));

        double totalGeneral = 0;

        System.out.println("--- SISTEMA DE ALQUILER ---");

        for (vehiculos i : ListaVe) {

            double total = i.calcularAlquiler(dias);

            System.out.println("Marca: " + i.getMarca());
            System.out.println("Modelo: " + i.getModelo());
            System.out.println("Tarifa por día: $" + i.getTarifa());
            System.out.println("Días de alquiler: " + dias);
            System.out.println("Total a pagar: $" + total);
            System.out.println("");

            totalGeneral = totalGeneral + total;
        }

        System.out.println("TOTAL GENERAL: $" + totalGeneral);
    }
}    


