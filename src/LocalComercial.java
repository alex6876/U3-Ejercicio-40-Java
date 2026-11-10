public class LocalComercial extends Inmueble {

    private boolean vidrieraALaCalle;
    private String zonificacion;

    public LocalComercial(String direccion, double superficieMetros2,
                          double precioBase, boolean vidrieraALaCalle,
                          String zonificacion) {

        super(direccion, superficieMetros2, precioBase);

        this.vidrieraALaCalle = vidrieraALaCalle;
        this.zonificacion = zonificacion;
    }

    @Override
    public double calcularTasacion() {

        double incrementoVidriera = 0;

        if (vidrieraALaCalle) {
            incrementoVidriera = 0.15;
        }

        double incrementoZona = 0;

        if (zonificacion.equalsIgnoreCase("Comercial")) {
            incrementoZona = 0.30;
        } else if (zonificacion.equalsIgnoreCase("Mixta")) {
            incrementoZona = 0.15;
        }

        return precioBase * (1 + incrementoVidriera + incrementoZona);
    }
}
