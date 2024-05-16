package sv.ues.eisi.repasop2pdm;

public class Vehiculos {
    private int id_vehiculo;
    private int id_conductor;
    private String marca;
    private String modelo;
    private int anho;
    private int placa;

    public Vehiculos() {
    }

    public Vehiculos(int id_vehiculo, int id_conductor, String marca, String modelo, int anho, int placa) {
        this.id_vehiculo = id_vehiculo;
        this.id_conductor = id_conductor;
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.placa = placa;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
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

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
}
