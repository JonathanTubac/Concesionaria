public class Motocicleta extends Vehiculo {
    private String tipoMoto; // Deportiva, crucero, scooter, etc.
    private double tamañoRuedas; // En pulgadas

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
    public String getTipoMoto() { return tipoMoto; }
    public void setTipoMoto(String tipoMoto) { this.tipoMoto = tipoMoto; }

    public double getTamañoRuedas() { return tamañoRuedas; }
    public void setTamañoRuedas(double tamañoRuedas) { this.tamañoRuedas = tamañoRuedas; }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de moto: " + tipoMoto + ", Ruedas: " + tamañoRuedas + " pulgadas";
    }
}
