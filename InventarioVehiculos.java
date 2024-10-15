import java.util.ArrayList;
import java.util.List;

public class InventarioVehiculos {
    private List<Vehiculo> vehiculos;

    public InventarioVehiculos() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public Vehiculo buscarVehiculoPorPlaca(String placa) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(placa)) {
                return v;
            }
        }
        return null; // Retorna null si no encuentra el vehículo
    }

    public List<Vehiculo> listarVehiculosPorCategoria(Class<? extends Vehiculo> tipoVehiculo) {
        List<Vehiculo> resultado = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (tipoVehiculo.isInstance(v)) {
                resultado.add(v);
            }
        }
        return resultado;
    }

    public void eliminarVehiculo(String placa) {
        vehiculos.removeIf(v -> v.getPlaca().equals(placa));
    }

    public void mostrarEstado() {
        int disponibles = 0, reservados = 0, vendidos = 0;
        for (Vehiculo v : vehiculos) {
            switch (v.getEstado().toLowerCase()) {
                case "disponible": disponibles++; break;
                case "reservado": reservados++; break;
                case "vendido": vendidos++; break;
            }
        }
        System.out.println("Disponibles: " + disponibles + ", Reservados: " + reservados + ", Vendidos: " + vendidos);
    }

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
