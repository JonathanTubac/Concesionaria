
/*
 * Código hecho por Jonathan Tubac 24484
 * Programa de concesionaria de autos, motos y camiones
 * 
 * El programa consiste en una aplicación para poder agregar vehículos a una concesionaria, ya sea moto, camión o auto, y en este mismo se debe de poder
 * buscar cualquier vehiculo por placa, listarlos por categorias, eliminar alguno, mostrar el estado de estos y calcular el monto total por estado.
 */
public class Motocicleta extends Vehiculo {
    private String tipoMoto; 
    private double tamañoRuedas; 
    
    // Constructor, heredando la clase Vehiculo
    public Motocicleta(String placa, String marca, String modelo, int año, String color,
            double capacidadMotor, double capacidadTanque, double velocidadMaxima,
            String tipoTransmision, double precio, String estado,
            String tipoMoto, double tamañoRuedas) {
        super(placa, marca, modelo, año, color, capacidadMotor, capacidadTanque,
                velocidadMaxima, tipoTransmision, precio, estado);
        this.tipoMoto = tipoMoto;
        this.tamañoRuedas = tamañoRuedas;
    }

    // Getters y Setters
    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public double getTamañoRuedas() {
        return tamañoRuedas;
    }

    public void setTamañoRuedas(double tamañoRuedas) {
        this.tamañoRuedas = tamañoRuedas;
    }

    //devuelve los valores de los atributos agregados a esta clase, para ser impresos en la Main
    @Override
    public String toString() {
        return super.toString() + ", Tipo de moto: " + tipoMoto + ", Ruedas: " + tamañoRuedas + " pulgadas";
    }
}
