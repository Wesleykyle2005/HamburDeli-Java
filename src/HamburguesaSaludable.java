public class HamburguesaSaludable extends Hamburguesa {
    private String[] ingredientesSaludablesAdicionales;
    private double[] precioIngredientesSaludables;
    private int numIngredientesSaludables;

    public HamburguesaSaludable(String carne, double precioBase) {
        super("Pan integral de centeno", carne, precioBase);
        this.ingredientesSaludablesAdicionales = new String[6];
        this.precioIngredientesSaludables = new double[6];
        this.numIngredientesSaludables = 0;
    }

    public void agregarIngredienteSaludable(String ingrediente, double precio) {
        if (numIngredientesSaludables < 6) {
            ingredientesSaludablesAdicionales[numIngredientesSaludables] = ingrediente;
            precioIngredientesSaludables[numIngredientesSaludables] = precio;
            numIngredientesSaludables++;
        } else {
            System.out.println("No se pueden agregar m\u00E1s de 6 ingredientes saludables adicionales.");
        }
    }

    @Override
    public void mostrarPrecioDetallado() {
        super.mostrarPrecioDetallado();
        for (int i = 0; i < numIngredientesSaludables; i++) {
            System.out.println("Ingrediente saludable adicional: " + ingredientesSaludablesAdicionales[i]
                    + " - Precio: " + precioIngredientesSaludables[i]);
        }
        System.out.println(
                "Precio total con ingredientes saludables: " + (calcularPrecioTotal() + calcularPrecioSaludable()));
    }

    private double calcularPrecioSaludable() {
        double precioTotalSaludable = 0;
        for (int i = 0; i < numIngredientesSaludables; i++) {
            precioTotalSaludable += precioIngredientesSaludables[i];
        }
        return precioTotalSaludable;
    }
}
