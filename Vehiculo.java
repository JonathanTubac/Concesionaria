public abstract class Vehiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int año;
    protected String color;
    protected double capacidadMotor; // En litros (L) o cc (motocicleta)
    protected double capacidadTanque; // En litros
    protected double velocidadMaxima; // En km/h
    protected String tipoTransmision; // Manual o automática
    protected double precio;
    protected String estado; // Disponible, reservado o vendido

    public Vehiculo(String placa, String marca, String modelo, int año, String color, 
                    double capacidadMotor, double capacidadTanque, double velocidadMaxima, 
                    String tipoTransmision, double precio, String estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.capacidadMotor = capacidadMotor;
        this.capacidadTanque = capacidadTanque;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoTransmision = tipoTransmision;
        this.precio = precio;
        this.estado = estado;
    }

    // Getters y Setters
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getCapacidadMotor() { return capacidadMotor; }
    public void setCapacidadMotor(double capacidadMotor) { this.capacidadMotor = capacidadMotor; }

    public double getCapacidadTanque() { return capacidadTanque; }
    public void setCapacidadTanque(double capacidadTanque) { this.capacidadTanque = capacidadTanque; }

    public double getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(double velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }

    public String getTipoTransmision() { return tipoTransmision; }
    public void setTipoTransmision(String tipoTransmision) { this.tipoTransmision = tipoTransmision; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + 
               ", Color: " + color + ", Capacidad del motor: " + capacidadMotor + "L, Tanque: " + 
               capacidadTanque + "L, Velocidad máxima: " + velocidadMaxima + " km/h, Transmisión: " + 
               tipoTransmision + ", Precio: Q" + precio + ", Estado: " + estado;
    }
}
