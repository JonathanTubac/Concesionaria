
/*
 * Código hecho por Jonathan Tubac 24484
 * Programa de concesionaria de autos, motos y camiones
 * 
 * El programa consiste en una aplicación para poder agregar vehículos a una concesionaria, ya sea moto, camión o auto, y en este mismo se debe de poder
 * buscar cualquier vehiculo por placa, listarlos por categorias, eliminar alguno, mostrar el estado de estos y calcular el monto total por estado.
 */

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private int numeroEjes;
    private double tamañoRuedas;

    // Constructor, heredando la clase Vehiculo
    public Camion(String placa, String marca, String modelo, int año, String color,
            double capacidadMotor, double capacidadTanque, double velocidadMaxima,
            String tipoTransmision, double precio, String estado,
            double capacidadCarga, int numeroEjes, double tamañoRuedas) {
        super(placa, marca, modelo, año, color, capacidadMotor, capacidadTanque,
                velocidadMaxima, tipoTransmision, precio, estado);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.tamañoRuedas = tamañoRuedas;
    }

    // Getters y Setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public double getTamañoRuedas() {
        return tamañoRuedas;
    }

    public void setTamañoRuedas(double tamañoRuedas) {
        this.tamañoRuedas = tamañoRuedas;
    }

    // devolver los valores de los atributos agregados a esta clase, para ser
    // impresos en la Main
    @Override
    public String toString() {
        return super.toString() + ", Carga: " + capacidadCarga + " toneladas, Ejes: " + numeroEjes +
                ", Ruedas: " + tamañoRuedas + " pulgadas";
    }
}
