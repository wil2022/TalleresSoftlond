package Taller_3.SistemaNotificaciones;

//        Diseña un sistema de notificaciones que pueda manejar varios tipos de notificaciones,
//        como correos electrónicos, mensajes de texto y notificaciones push. Crea una interfaz
//        que defina un método enviar y clases abstractas para cada tipo de notificación.
//        Luego, implementa las clases concretas para cada tipo de notificación.

public class Main {

    public static void main(String[] args) {

        NotificacionCorreo correo1 = new CorreoElectronico("david.p@gmail.com","Semillero","Felicidades ha sido admitido en nuestro semillero");
        NotificacionMensajeT mensaje1 = new MensajeTexto("320 2435849","Confirmame la direccion de entrega");
        NotificacionNotiPush notificacion1 = new NotificacionesPush("Facebook","tienes una nueva sugerencia de amistad","F.jpg","Ver perfil");

        correo1.enviar();
        mensaje1.enviar();
        notificacion1.enviar();

    }


}
