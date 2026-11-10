public class Departamento extends Inmueble {

    private double expensasMensuales;
    private int pisoUbicacion;

    public Departamento(String direccion, double superficieMetros2,
                        double precioBase, double expensasMensuales,
                        int pisoUbicacion) {

        super(direccion, superficieMetros2, precioBase);

        this.expensasMensuales = expensasMensuales;
        this.pisoUbicacion = pisoUbicacion;
    }

    @Override
    public double calcularTasacion() {

        double incrementoPiso = pisoUbicacion * 0.02;

        double descuentoExpensas = expensasMensuales * 12 * 0.10;

        return (precioBase * (1 + incrementoPiso)) - descuentoExpensas;
    }
}
