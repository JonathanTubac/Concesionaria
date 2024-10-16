
/*
 * Código hecho por Jonathan Tubac 24484
 * Programa de concesionaria de autos, motos y camiones
 * 
 * El programa consiste en una aplicación para poder agregar vehículos a una concesionaria, ya sea moto, camión o auto, y en este mismo se debe de poder
 * buscar cualquier vehiculo por placa, listarlos por categorias, eliminar alguno, mostrar el estado de estos y calcular el monto total por estado.
 */

import java.util.ArrayList;
import java.util.List;

public class InventarioVehiculos {
    private List<Vehiculo> vehiculos;

    public InventarioVehiculos() {
        this.vehiculos = new ArrayList<>();
    }

    // Función para agregar un vehiculo a la lista
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Función para buscar el vehiculo en el la lista
    public Vehiculo buscarVehiculoPorPlaca(String placa) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(placa)) {
                return v;
            }
        }
        return null; // Retorna null si no encuentra el vehículo
    }

    // Función para devolver los vehiculos de la categoria solicitada
    public List<Vehiculo> listarVehiculosPorCategoria(Class<? extends Vehiculo> tipoVehiculo) {
        List<Vehiculo> resultado = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (tipoVehiculo.isInstance(v)) {
                resultado.add(v);
            }
        }
        return resultado;
    }

    // función para eliminar un vehiculo de la lista
    public void eliminarVehiculo(String placa) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(placa)) {
                vehiculos.remove(v);
                break;
            }
        }
    }

    // función para mostrar el estado de cada vehiculo, agrupado
    public void mostrarEstado() {
        int disponibles = 0, reservados = 0, vendidos = 0;
        for (Vehiculo v : vehiculos) {
            switch (v.getEstado().toLowerCase()) {
                case "disponible":
                    disponibles++;
                    break;
                case "reservado":
                    reservados++;
                    break;
                case "vendido":
                    vendidos++;
                    break;
            }
        }
        System.out.println("Disponibles: " + disponibles + ", Reservados: " + reservados + ", Vendidos: " + vendidos);
    }

    // Función para sumar el precio de cada vehiculo segun su estado
    public double calcularMontoTotal(String estado) {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            if (v.getEstado().equalsIgnoreCase(estado)) {
                total += v.getPrecio();
            }
        }
        return total;
    }
}
