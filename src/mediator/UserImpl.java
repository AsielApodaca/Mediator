package mediator;

/**
 * Implementación concreta de un usuario en el chat.
 * 
 * @author Asiel Apodaca Monge
 */
public class UserImpl extends User {

    /**
     * Crea una instancia de UserImpl con el mediador y el nombre proporcionados.
     * 
     * @param mediador el mediador del chat
     * @param nombre el nombre del usuario
     */
    public UserImpl(ChatMediator mediador, String nombre) {
        super(mediador, nombre);
    }

    /**
     * Envía un mensaje a través del mediador y lo muestra en la consola.
     * 
     * @param mensaje el mensaje a enviar
     */
    @Override
    public void send(String mensaje) {
        System.out.println(this.nombre + " envió mensaje: " + mensaje);
        this.mediador.sendMessage(mensaje, this);
    }

    /**
     * Muestra un mensaje recibido en la consola.
     * 
     * @param mensaje el mensaje recibido
     */
    @Override
    public void receive(String mensaje) {
        System.out.println(this.nombre + " recibió mensaje: " + mensaje);
    }
}
