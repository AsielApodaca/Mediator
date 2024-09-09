package mediator;

/**
 * Clase abstracta que representa a un usuario en el chat.
 * 
 * @author Asiel Apodaca Monge
 */
public abstract class User {
    protected ChatMediator mediador;
    protected String nombre;

    /**
     * Constructor para crear un usuario con un mediador y un nombre.
     * 
     * @param mediador el mediador del chat
     * @param nombre el nombre del usuario
     */
    public User(ChatMediator mediador, String nombre) {
        this.mediador = mediador;
        this.nombre = nombre;
    }
    
    /**
     * Envía un mensaje a través del mediador.
     * 
     * @param mensaje el mensaje a enviar
     */
    public abstract void send(String mensaje);
    
    /**
     * Recibe un mensaje.
     * 
     * @param mensaje el mensaje recibido
     */
    public abstract void receive(String mensaje);
}
