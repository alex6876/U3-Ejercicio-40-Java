public class Main {

    public static void main(String[] args) {

        // Crear una casa
        Casa casa = new Casa(
                "San Martin 250",
                200,
                50000000,
                80,
                2
        );

        // Crear un departamento
        Departamento departamento = new Departamento(
                "Av. Colon 450",
                75,
                35000000,
                50000,
                5
        );

        // Crear un local comercial
        LocalComercial local = new LocalComercial(
                "Peatonal Sarmiento 120",
                100,
                60000000,
                true,
                "Comercial"
        );

        // Mostrar las tasaciones
        System.out.println("===== TASACION DE INMUEBLES =====");

        System.out.println("Casa: $" + casa.calcularTasacion());

        System.out.println("Departamento: $" + departamento.calcularTasacion());

        System.out.println("Local Comercial: $" + local.calcularTasacion());

        // Calcular el total
        double total = casa.calcularTasacion()
                + departamento.calcularTasacion()
                + local.calcularTasacion();

        System.out.println("--------------------------------");

        System.out.println("Tasacion total: $" + total);
    }
}
