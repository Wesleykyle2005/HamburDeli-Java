public class HamburguesaDeLujo extends Hamburguesa {
    private final double precioPapasFritas = 2.50;
    private final double precioBebida = 1.75;

    public HamburguesaDeLujo(String carne, double precioBase) {
        super("Pan de lujo", carne, precioBase + 2.50 + 1.75);
    }

    @Override
    public void mostrarPrecioDetallado() {
        super.mostrarPrecioDetallado();
        System.out.println("Incluye papas fritas: " + precioPapasFritas);
        System.out.println("Incluye bebida: " + precioBebida);
        System.out.println("Precio total de hamburguesa de lujo: " + calcularPrecioTotal());
    }
}
