
/*
 * Código hecho por Jonathan Tubac 24484
 * Programa de concesionaria de autos, motos y camiones
 * 
 * El programa consiste en una aplicación para poder agregar vehículos a una concesionaria, ya sea moto, camión o auto, y en este mismo se debe de poder
 * buscar cualquier vehiculo por placa, listarlos por categorias, eliminar alguno, mostrar el estado de estos y calcular el monto total por estado.
 */


public abstract class Vehiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int año;
    protected String color;
    protected double capacidadMotor;
    protected double capacidadTanque;
    protected double velocidadMaxima;
    protected String tipoTransmision;
    protected double precio;
    protected String estado;

    //Constructor de la clase Vehiculo
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
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCapacidadMotor() {
        return capacidadMotor;
    }

    public void setCapacidadMotor(double capacidadMotor) {
        this.capacidadMotor = capacidadMotor;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //devolver el valor de los atributos, para ser llamados en la Main
    @Override
    public String toString() {
        return "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año +
                ", Color: " + color + ", Capacidad del motor: " + capacidadMotor + "L, Tanque: " +
                capacidadTanque + "L, Velocidad máxima: " + velocidadMaxima + " km/h, Transmisión: " +
                tipoTransmision + ", Precio: Q" + precio + ", Estado: " + estado;
    }
}
