public class Camion extends Vehiculo {
    private double capacidadCarga; // En toneladas
    private int numeroEjes;
    private double tamañoRuedas; // En pulgadas

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
    public double getCapacidadCarga() { return capacidadCarga; }
    public void setCapacidadCarga(double capacidadCarga) { this.capacidadCarga = capacidadCarga; }

    public int getNumeroEjes() { return numeroEjes; }
    public void setNumeroEjes(int numeroEjes) { this.numeroEjes = numeroEjes; }

    public double getTamañoRuedas() { return tamañoRuedas; }
    public void setTamañoRuedas(double tamañoRuedas) { this.tamañoRuedas = tamañoRuedas; }

    @Override
    public String toString() {
        return super.toString() + ", Carga: " + capacidadCarga + " toneladas, Ejes: " + numeroEjes + 
               ", Ruedas: " + tamañoRuedas + " pulgadas";
    }
}
