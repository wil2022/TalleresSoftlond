package Taller_2.SistemaReservasHotel;


public class Cliente {
    private String empresa;
    private String nombre;
    private String cedula;

    public Cliente(String empresa, String nombre, String cedula) {
        this.empresa = empresa;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
