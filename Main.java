
/*
 * Código hecho por Jonathan Tubac 24484
 * Programa de concesionaria de autos, motos y camiones
 * 
 * El programa consiste en una aplicación para poder agregar vehículos a una concesionaria, ya sea moto, camión o auto, y en este mismo se debe de poder
 * buscar cualquier vehiculo por placa, listarlos por categorias, eliminar alguno, mostrar el estado de estos y calcular el monto total por estado.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventarioVehiculos inventario = new InventarioVehiculos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            // Menú de opciones
            System.out.println("\n--- Menú de la Concesionaria ---");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Buscar vehículo por placa");
            System.out.println("3. Listar vehículos por categoría");
            System.out.println("4. Eliminar vehículo por placa");
            System.out.println("5. Mostrar estado de los vehículos");
            System.out.println("6. Calcular monto total por estado");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarVehiculo(inventario, scanner);
                    break;
                case 2:
                    buscarVehiculo(inventario, scanner);
                    break;
                case 3:
                    listarVehiculos(inventario, scanner);
                    break;
                case 4:
                    eliminarVehiculo(inventario, scanner);
                    break;
                case 5:
                    inventario.mostrarEstado();
                    break;
                case 6:
                    calcularMontoTotal(inventario, scanner);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 7);

        scanner.close();
    }

    // Función para agregar un vehículo ingresado a la lista
    public static void agregarVehiculo(InventarioVehiculos inventario, Scanner scanner) {
        System.out.println("Seleccione el tipo de vehículo a agregar:");
        System.out.println("1. Auto");
        System.out.println("2. Motocicleta");
        System.out.println("3. Camión");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        // solicitud de datos al usuario
        System.out.print("Ingrese la placa: ");
        String placa = scanner.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el color: ");
        String color = scanner.nextLine();
        System.out.print("Ingrese la capacidad del motor: ");
        double capacidadMotor = scanner.nextDouble();
        System.out.print("Ingrese la capacidad del tanque: ");
        double capacidadTanque = scanner.nextDouble();
        System.out.print("Ingrese la velocidad máxima: ");
        double velocidadMaxima = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el tipo de transmisión (Manual/Automática): ");
        String tipoTransmision = scanner.nextLine();
        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el estado (Disponible/Reservado/Vendido): ");
        String estado = scanner.nextLine();

        // condición para evaluar qué tipo de categoría es para solicitar los otros
        // atributos necesarios

        // categoria auto
        if (tipo == 1) {
            System.out.print("Ingrese el número de puertas: ");
            int numeroPuertas = scanner.nextInt();
            System.out.print("Ingrese el tamaño de las ruedas (en pulgadas): ");
            double tamañoRuedas = scanner.nextDouble();
            System.out.print("Ingrese la capacidad del maletero (en litros): ");
            double capacidadMaletero = scanner.nextDouble();
            scanner.nextLine();

            Auto auto = new Auto(placa, marca, modelo, año, color, capacidadMotor, capacidadTanque,
                    velocidadMaxima, tipoTransmision, precio, estado, numeroPuertas, tamañoRuedas, capacidadMaletero);
            inventario.agregarVehiculo(auto);
            // categoria motocicleta
        } else if (tipo == 2) {
            System.out.print("Ingrese el tipo de motocicleta (Deportiva/Crucero/Scooter/etc.): ");
            String tipoMoto = scanner.nextLine();
            System.out.print("Ingrese el tamaño de las ruedas (en pulgadas): ");
            double tamañoRuedas = scanner.nextDouble();
            scanner.nextLine();

            Motocicleta moto = new Motocicleta(placa, marca, modelo, año, color, capacidadMotor, capacidadTanque,
                    velocidadMaxima, tipoTransmision, precio, estado, tipoMoto, tamañoRuedas);
            inventario.agregarVehiculo(moto);
            // categoria camión
        } else if (tipo == 3) {
            System.out.print("Ingrese la capacidad de carga (en toneladas): ");
            double capacidadCarga = scanner.nextDouble();
            System.out.print("Ingrese el número de ejes: ");
            int numeroEjes = scanner.nextInt();
            System.out.print("Ingrese el tamaño de las ruedas (en pulgadas): ");
            double tamañoRuedas = scanner.nextDouble();
            scanner.nextLine();

            Camion camion = new Camion(placa, marca, modelo, año, color, capacidadMotor, capacidadTanque,
                    velocidadMaxima, tipoTransmision, precio, estado, capacidadCarga, numeroEjes, tamañoRuedas);
            inventario.agregarVehiculo(camion);
        }

        System.out.println("Vehículo agregado correctamente.");
    }

    // Función para buscar y mostrar un vehículo por su respectiva placa
    public static void buscarVehiculo(InventarioVehiculos inventario, Scanner scanner) {
        System.out.print("Ingrese la placa del vehículo a buscar: ");
        String placa = scanner.nextLine();
        Vehiculo vehiculo = inventario.buscarVehiculoPorPlaca(placa);

        if (vehiculo != null) {
            System.out.println("Vehículo encontrado: " + vehiculo);
        } else {
            System.out.println("No se encontró ningún vehículo con la placa " + placa);
        }
    }

    // Función para mostrar vehículos por categoría
    public static void listarVehiculos(InventarioVehiculos inventario, Scanner scanner) {
        System.out.println("Seleccione la categoría para listar:");
        System.out.println("1. Autos");
        System.out.println("2. Motocicletas");
        System.out.println("3. Camiones");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        // condición para listar los vehiculos según la categoría deseada
        if (tipo == 1) {
            System.out.println("Listado de Autos:");
            for (Vehiculo v : inventario.listarVehiculosPorCategoria(Auto.class)) {
                System.out.println(v);
            }
        } else if (tipo == 2) {
            System.out.println("Listado de Motocicletas:");
            for (Vehiculo v : inventario.listarVehiculosPorCategoria(Motocicleta.class)) {
                System.out.println(v);
            }
        } else if (tipo == 3) {
            System.out.println("Listado de Camiones:");
            for (Vehiculo v : inventario.listarVehiculosPorCategoria(Camion.class)) {
                System.out.println(v);
            }
        } else {
            System.out.println("Categoría no válida.");
        }
    }

    // Función para eliminar un vehículo
    public static void eliminarVehiculo(InventarioVehiculos inventario, Scanner scanner) {
        System.out.print("Ingrese la placa del vehículo a eliminar: ");
        String placa = scanner.nextLine();
        Vehiculo vehiculo = inventario.buscarVehiculoPorPlaca(placa);

        if (vehiculo != null) {
            inventario.eliminarVehiculo(placa);
            System.out.println("Vehículo eliminado.");
        }else{
            System.out.println("No existe un vehiculo con placa: " + placa);
        }

    }

    // Función para mostrar el monto total por estado del vehiculo
    public static void calcularMontoTotal(InventarioVehiculos inventario, Scanner scanner) {
        System.out.print("Ingrese el estado para calcular el monto total (Disponible/Reservado/Vendido): ");
        String estado = scanner.nextLine();
        double montoTotal = inventario.calcularMontoTotal(estado);
        System.out.println("Monto total de vehículos en estado " + estado + ": Q" + montoTotal);
    }
}
