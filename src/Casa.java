public class Casa extends Inmueble {

    private double superficiePatio;
    private int cantidadPlantas;

    public Casa(String direccion, double superficieMetros2,
                double precioBase, double superficiePatio,
                int cantidadPlantas) {

        super(direccion, superficieMetros2, precioBase);

        this.superficiePatio = superficiePatio;
        this.cantidadPlantas = cantidadPlantas;
    }

    @Override
    public double calcularTasacion() {

        double valorPatio = superficiePatio * 500;

        double incrementoPlantas = (cantidadPlantas - 1) * 0.05;

        return (precioBase + valorPatio) * (1 + incrementoPlantas);
    }
}
