
/*
 * Código hecho por Jonathan Tubac 24484
 * Programa de concesionaria de autos, motos y camiones
 * 
 * El programa consiste en una aplicación para poder agregar vehículos a una concesionaria, ya sea moto, camión o auto, y en este mismo se debe de poder
 * buscar cualquier vehiculo por placa, listarlos por categorias, eliminar alguno, mostrar el estado de estos y calcular el monto total por estado.
 */

public class Auto extends Vehiculo {
    private int numeroPuertas;
    private double tamañoRuedas;
    private double capacidadMaletero;

    //Constructor, heredando la clase Vehiculo
    public Auto(String placa, String marca, String modelo, int año, String color,
            double capacidadMotor, double capacidadTanque, double velocidadMaxima,
            String tipoTransmision, double precio, String estado,
            int numeroPuertas, double tamañoRuedas, double capacidadMaletero) {
        super(placa, marca, modelo, año, color, capacidadMotor, capacidadTanque,
                velocidadMaxima, tipoTransmision, precio, estado);
        this.numeroPuertas = numeroPuertas;
        this.tamañoRuedas = tamañoRuedas;
        this.capacidadMaletero = capacidadMaletero;
    }

    // Getters y Setters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public double getTamañoRuedas() {
        return tamañoRuedas;
    }

    public void setTamañoRuedas(double tamañoRuedas) {
        this.tamañoRuedas = tamañoRuedas;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    //devolver los valores de los atributos agregados a esta clase, para ser impresos en la Main
    @Override
    public String toString() {
        return super.toString() + ", Puertas: " + numeroPuertas + ", Ruedas: " + tamañoRuedas +
                " pulgadas, Maletero: " + capacidadMaletero + "L";
    }
}
