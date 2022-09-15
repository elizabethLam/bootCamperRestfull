package rest.jersey.demo.models;

public class BootCamper {
    private String nombre;


    public BootCamper() {
    }

    public BootCamper(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
