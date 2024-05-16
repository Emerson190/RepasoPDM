package sv.ues.eisi.repasop2pdm;

public class Conductor {
    private int id_conductor;
    private String nombre;


    private String direccion;
    private String telefono;
    private int cantVehiculos;

    public Conductor() {
    }

    public Conductor(int id_conductor, String nombre, String direccion, String telefono, int cantVehiculos) {
        this.id_conductor = id_conductor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantVehiculos = cantVehiculos;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCantVehiculos() {
        return cantVehiculos;
    }

    public void setCantVehiculos(int cantVehiculos) {
        this.cantVehiculos = cantVehiculos;
    }
}
