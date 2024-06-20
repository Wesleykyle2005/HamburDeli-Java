//Revisado
public class Hamburguesa {
    private String tipoPanecillo;
    private String carne;
    private double precioBase;
    private String[] ingredientesAdicionales;
    private double[] precioIngredientes;
    private int numIngredientes;

    public Hamburguesa(String tipoPanecillo, String carne, double precioBase) {
        this.tipoPanecillo = tipoPanecillo;
        this.carne = carne;
        this.precioBase = precioBase;
        this.ingredientesAdicionales = new String[4];
        this.precioIngredientes = new double[4];
        this.numIngredientes = 0;
    }

    public void agregarIngrediente(String ingrediente, double precio) {
        if (numIngredientes < 4) {
            ingredientesAdicionales[numIngredientes] = ingrediente;
            precioIngredientes[numIngredientes] = precio;
            numIngredientes++;
        } else {
            System.out.println("No se pueden agregar m\u00E1s de 4 ingredientes adicionales.");
        }
    }

    public double calcularPrecioTotal() {
        double precioTotal = precioBase;
        for (int i = 0; i < numIngredientes; i++) {
            precioTotal += precioIngredientes[i];
        }
        return precioTotal;
    }

    public void mostrarPrecioDetallado() {
        System.out.println("Hamburguesa con panecillo: " + tipoPanecillo + " y carne de: " + carne);
        System.out.println("Precio base: " + precioBase);
        for (int i = 0; i < numIngredientes; i++) {
            System.out.println(
                    "Ingrediente adicional: " + ingredientesAdicionales[i] + " - Precio: " + precioIngredientes[i]);
        }
        System.out.println("Precio total: " + calcularPrecioTotal());
    }
}
