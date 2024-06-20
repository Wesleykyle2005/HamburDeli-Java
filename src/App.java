//Autor: Silvio Rojas y Jostin Vallecillo

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        String red = "\u001B[31m";
        String reset = "\u001B[0m";

        /*
         * Texto de bienvenida generado a traves de la página:
         * https://www.asciiart.eu/text-to-ascii-art
         */
        String MensajeBienvenida = "/**\r\n" + //
                "* ╔═══════════════════════════════════════════════════════╗\r\n" + //
                "* ║ ____  _     _                             _           ║\r\n" + //
                "* ║/ ___|(_)___| |_ ___ _ __ ___   __ _    __| | ___      ║\r\n" + //
                "* ║\\___ \\| / __| __/ _ \\ '_ ` _ \\ / _` |  / _` |/ _ \\     ║\r\n" + //
                "* ║ ___) | \\__ \\ ||  __/ | | | | | (_| | | (_| |  __/     ║\r\n" + //
                "* ║|____/|_|___/\\__\\___|_| |_| |_|\\__,_|  \\__,_|\\___|     ║\r\n" + //
                "* ║  __ _  ___  ___| |_(_) /_/  _ __                      ║\r\n" + //
                "* ║ / _` |/ _ \\/ __| __| |/ _ \\| '_ \\                     ║\r\n" + //
                "* ║| (_| |  __/\\__ \\ |_| | (_) | | | |                    ║\r\n" + //
                "* ║ \\__, |\\___||___/\\__|_|\\___/|_| |_|                    ║\r\n" + //
                "* ║ |___/                 _                ____       _ _ ║\r\n" + //
                "* ║| | | | __ _ _ __ ___ | |__  _   _ _ __|  _ \\  ___| (_)║\r\n" + //
                "* ║| |_| |/ _` | '_ ` _ \\| '_ \\| | | | '__| | | |/ _ \\ | |║\r\n" + //
                "* ║|  _  | (_| | | | | | | |_) | |_| | |  | |_| |  __/ | |║\r\n" + //
                "* ║|_| |_|\\__,_|_| |_| |_|_.__/ \\__,_|_|  |____/ \\___|_|_|║\r\n" + //
                "* ╚═══════════════════════════════════════════════════════╝\r\n" + //
                "*/";

        System.out.println(red + MensajeBienvenida + reset);
        while (opcion != 4) {
            try {
                System.out.println("Seleccione el tipo de hamburguesa:");
                System.out.println("1. Hamburguesa B\u00E1sica");
                System.out.println("2. Hamburguesa Saludable");
                System.out.println("3. Hamburguesa de Lujo");
                System.out.println("4. Salir");
                System.out.print("Opci\u00F3n: ");
                opcion = lector.nextInt();
                lector.nextLine();

                switch (opcion) {
                    case 1:
                        crearHamburguesaBasica(lector);
                        break;
                    case 2:
                        crearHamburguesaSaludable(lector);
                        break;
                    case 3:
                        crearHamburguesaDeLujo(lector);
                        break;
                    case 4:
                        System.out.println(red + "/**\r\n" + //
                                "* ╔═════════════════════════════════════════════════════════════════════════╗\r\n" + //
                                "* ║  ____                         _                                         ║\r\n" + //
                                "* ║ / ___|  _ __    __ _    ___  (_)   __ _   ___                           ║\r\n" + //
                                "* ║| |  _  | '__|  / _` |  / __| | |  / _` | / __|                          ║\r\n" + //
                                "* ║| |_| | | |    | (_| | | (__  | | | (_| | \\__ \\                          ║\r\n" + //
                                "* ║ \\____| |_|     \\__,_|  \\___| |_|  \\__,_| |___/                 _        ║\r\n"
                                + //
                                "* ║ _ __     ___    _ __     _   _   ___    __ _   _ __      ___  | |       ║\r\n" + //
                                "* ║| '_ \\   / _ \\  | '__|   | | | | / __|  / _` | | '__|    / _ \\ | |       ║\r\n" + //
                                "* ║| |_) | | (_) | | |      | |_| | \\__ \\ | (_| | | |      |  __/ | |       ║\r\n" + //
                                "* ║| .__/   \\___/  |_|       \\__,_| |___/  \\__,_| |_|       \\___| |_|       ║\r\n"
                                + //
                                "* ║|_|    _         _                                      _                ║\r\n" + //
                                "* ║ ___  (_)  ___  | |_    ___   _ __ ___     __ _      __| |   ___         ║\r\n" + //
                                "* ║/ __| | | / __| | __|  / _ \\ | '_ ` _ \\   / _` |    / _` |  / _ \\        ║\r\n" + //
                                "* ║\\__ \\ | | \\__ \\ | |_  |  __/ | | | | | | | (_| |   | (_| | |  __/        ║\r\n"
                                + //
                                "* ║|___/ |_| |___/  \\__|  \\___| |_| |_| |_|  \\__,_|    \\__,_|  \\___|        ║\r\n"
                                + //
                                "* ║                      _     _     __                                     ║\r\n" + //
                                "* ║  __ _    ___   ___  | |_  (_)   /_/    _ __                             ║\r\n" + //
                                "* ║ / _` |  / _ \\ / __| | __| | |  / _ \\  | '_ \\                            ║\r\n" + //
                                "* ║| (_| | |  __/ \\__ \\ | |_  | | | (_) | | | | |                           ║\r\n" + //
                                "* ║ \\__, |  \\___| |___/  \\__| |_|  \\___/  |_| |_|                           ║\r\n"
                                + //
                                "* ║ |___/                                                                   ║\r\n" + //
                                "* ║ _   _                       _                      ____           _   _ ║\r\n" + //
                                "* ║| | | |   __ _   _ __ ___   | |__    _   _   _ __  |  _ \\    ___  | | (_)║\r\n" + //
                                "* ║| |_| |  / _` | | '_ ` _ \\  | '_ \\  | | | | | '__| | | | |  / _ \\ | | | |║\r\n" + //
                                "* ║|  _  | | (_| | | | | | | | | |_) | | |_| | | |    | |_| | |  __/ | | | |║\r\n" + //
                                "* ║|_| |_|  \\__,_| |_| |_| |_| |_.__/   \\__,_| |_|    |____/   \\___| |_| |_|║\r\n" + //
                                "* ╚═════════════════════════════════════════════════════════════════════════╝\r\n" + //
                                "*/" + reset);
                        break;
                    default:
                        System.out.println("Opci\u00F3n inv\u00E1lida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inv\u00E1lida. Por favor ingrese un n\u00FAmero.");
                lector.next();
            }
        }
        lector.close();
    }

    private static void crearHamburguesaBasica(Scanner scanner) {
        String tipoPanecillo = "";
        String carne = "";
        double precioBase = 0.0;

        while (true) {
            System.out.print("Ingrese el tipo de panecillo: ");
            tipoPanecillo = scanner.nextLine();
            if (!tipoPanecillo.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Tipo de panecillo no puede estar vac\u00EDo. Intente de nuevo.");
            }
        }

        while (true) {
            System.out.print("Ingrese el tipo de carne: ");
            carne = scanner.nextLine();
            if (!carne.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Tipo de carne no puede estar vac\u00EDo. Intente de nuevo.");
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese el precio base: ");
                precioBase = scanner.nextDouble();
                scanner.nextLine();
                if (precioBase > 0) {
                    break;
                } else {
                    System.out.println("El precio base debe ser mayor a 0. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un n\u00FAmero v\u00E1lido.");
                scanner.next();
            }
        }

        Hamburguesa hamburguesaBasica = new Hamburguesa(tipoPanecillo, carne, precioBase);
        agregarIngredientes(scanner, hamburguesaBasica, 4);
        hamburguesaBasica.mostrarPrecioDetallado();
    }

    private static void crearHamburguesaSaludable(Scanner scanner) {
        String carne = "";
        double precioBase = 0.0;

        while (true) {
            System.out.print("Ingrese el tipo de carne: ");
            carne = scanner.nextLine();
            if (!carne.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Tipo de carne no puede estar vac\u00EDo. Intente de nuevo.");
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese el precio base: ");
                precioBase = scanner.nextDouble();
                scanner.nextLine();
                if (precioBase > 0) {
                    break;
                } else {
                    System.out.println("El precio base debe ser mayor a 0. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inv\u00E1lida. Por favor, ingrese un n\u00FAmero v\u00E1lido.");
                scanner.next();
            }
        }

        HamburguesaSaludable hamburguesaSaludable = new HamburguesaSaludable(carne, precioBase);
        agregarIngredientes(scanner, hamburguesaSaludable, 4);
        agregarIngredientesSaludables(scanner, hamburguesaSaludable, 2);
        hamburguesaSaludable.mostrarPrecioDetallado();
    }

    private static void crearHamburguesaDeLujo(Scanner scanner) {
        String carne = "";
        double precioBase = 0.0;

        while (true) {
            System.out.print("Ingrese el tipo de carne: ");
            carne = scanner.nextLine();
            if (!carne.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Tipo de carne no puede estar vac\u00EDo. Intente de nuevo.");
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese el precio base: ");
                precioBase = scanner.nextDouble();
                scanner.nextLine();
                if (precioBase > 0) {
                    break;
                } else {
                    System.out.println("El precio base debe ser mayor a 0. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un n\u00FAmero v\u00E1lido.");
                scanner.next();
            }
        }

        HamburguesaDeLujo hamburguesaDeLujo = new HamburguesaDeLujo(carne, precioBase);
        hamburguesaDeLujo.mostrarPrecioDetallado();
    }

    private static void agregarIngredientes(Scanner scanner, Hamburguesa hamburguesa, int maxIngredientes) {
        for (int i = 0; i < maxIngredientes; i++) {
            System.out.print("Desea agregar un ingrediente adicional? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                String ingrediente = "";
                double precio = 0.0;

                while (true) {
                    System.out.print("Ingrese el nombre del ingrediente: ");
                    ingrediente = scanner.nextLine();
                    if (!ingrediente.trim().isEmpty()) {
                        break;
                    } else {
                        System.out.println("El nombre del ingrediente no puede estar vac\u00EDo. Intente de nuevo.");
                    }
                }

                while (true) {
                    try {
                        System.out.print("Ingrese el precio del ingrediente: ");
                        precio = scanner.nextDouble();
                        scanner.nextLine();
                        if (precio > 0) {
                            break;
                        } else {
                            System.out.println("El precio del ingrediente debe ser mayor a 0. Intente de nuevo.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número v\u00E1lido.");
                        scanner.next();
                    }
                }

                hamburguesa.agregarIngrediente(ingrediente, precio);
            } else {
                break;
            }
        }
    }

    private static void agregarIngredientesSaludables(Scanner scanner, HamburguesaSaludable hamburguesa,
            int maxIngredientes) {
        for (int i = 0; i < maxIngredientes; i++) {
            System.out.print("Desea agregar un ingrediente saludable adicional? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                String ingrediente = "";
                double precio = 0.0;

                while (true) {
                    System.out.print("Ingrese el nombre del ingrediente saludable: ");
                    ingrediente = scanner.nextLine();
                    if (!ingrediente.trim().isEmpty()) {
                        break;
                    } else {
                        System.out.println("El nombre del ingrediente no puede estar vac\u00EDo. Intente de nuevo.");
                    }
                }

                while (true) {
                    try {
                        System.out.print("Ingrese el precio del ingrediente saludable: ");
                        precio = scanner.nextDouble();
                        scanner.nextLine();
                        if (precio > 0) {
                            break;
                        } else {
                            System.out.println("El precio del ingrediente debe ser mayor a 0. Intente de nuevo.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inv\u00E1lida. Por favor, ingrese un n\u00FAmero v\u00E1lido.");
                        scanner.next();
                    }
                }

                hamburguesa.agregarIngredienteSaludable(ingrediente, precio);
            } else {
                break;
            }
        }
    }
}
