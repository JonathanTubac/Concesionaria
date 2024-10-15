public class Auto extends Vehiculo {
    private int numeroPuertas;
    private double tamañoRuedas; // En pulgadas
    private double capacidadMaletero; // En litros

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
    public int getNumeroPuertas() { return numeroPuertas; }
    public void setNumeroPuertas(int numeroPuertas) { this.numeroPuertas = numeroPuertas; }

    public double getTamañoRuedas() { return tamañoRuedas; }
    public void setTamañoRuedas(double tamañoRuedas) { this.tamañoRuedas = tamañoRuedas; }

    public double getCapacidadMaletero() { return capacidadMaletero; }
    public void setCapacidadMaletero(double capacidadMaletero) { this.capacidadMaletero = capacidadMaletero; }

    @Override
    public String toString() {
        return super.toString() + ", Puertas: " + numeroPuertas + ", Ruedas: " + tamañoRuedas + 
               " pulgadas, Maletero: " + capacidadMaletero + "L";
    }
}
