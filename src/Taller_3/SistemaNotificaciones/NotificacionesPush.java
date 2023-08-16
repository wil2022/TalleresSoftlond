package Taller_3.SistemaNotificaciones;

public class NotificacionesPush extends NotificacionNotiPush{

    public NotificacionesPush(String titulo, String mensaje, String imagen, String accion) {
        super(titulo, mensaje, imagen, accion);
    }

    @Override
    public void enviar() {
        System.out.println(getTitulo());
        System.out.println(getMensaje() +"   " +getImagen());
        System.out.println(getAccion()+"\n");
    }


}
