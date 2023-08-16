package Taller_3.SistemaNotificaciones;

abstract public class NotificacionNotiPush implements INotificacion{

    private String titulo;
    private String mensaje;
    private String imagen;
    private String Accion;

    public NotificacionNotiPush(String titulo, String mensaje, String imagen, String accion) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.imagen = imagen;
        Accion = accion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getImagen() {
        return imagen;
    }

    public String getAccion() {
        return Accion;
    }
}
