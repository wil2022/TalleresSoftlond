package Taller_3.SistemaNotificaciones;

public class MensajeTexto extends NotificacionMensajeT{

    public MensajeTexto(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {

        System.out.println("SMS enviado");
        System.out.println("Contacto: " + getDestinatario() + "  Mensaje: " + getMensaje()+"\n");

    }


}
