package mediator;

/**
 * Interfaz para manejar la mediación de un chat.
 * 
 * @author Asiel Apodaca Monge
 */
public interface ChatMediator {
    
    /**
     * Envía un mensaje a través del mediador.
     * 
     * @param mensaje el mensaje a enviar
     * @param usuario el usuario que envía el mensaje
     */
    public void sendMessage(String mensaje, User usuario);
    
    /**
     * Añade un usuario al chat.
     * 
     * @param usuario el usuario a añadir
     */
    public void addUser(User usuario);
}
