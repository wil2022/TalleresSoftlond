package Taller_3.SistemaNotificaciones;

public class CorreoElectronico extends NotificacionCorreo{

    public CorreoElectronico(String destinatario, String asunto, String mensaje) {
        super(destinatario, asunto, mensaje);
    }

    @Override
    public void enviar() {

        System.out.println("el correo se ha enviado con exito al destinatario " + getDestinatario()+"\n");

    }
}
