package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de ChatMediator para manejar la comunicación entre usuarios.
 * 
 * @author Asiel Apodaca Monge
 */
public class ChatMediatorImpl implements ChatMediator {
    
    private List<User> usuarios;

    /**
     * Crea una instancia de ChatMediatorImpl con una lista vacía de usuarios.
     */
    public ChatMediatorImpl() {
        this.usuarios = new ArrayList<>();
    }
    
    /**
     * Envía un mensaje a todos los usuarios excepto al que lo envía.
     * 
     * @param mensaje el mensaje a enviar
     * @param usuario el usuario que envía el mensaje
     */
    @Override
    public void sendMessage(String mensaje, User usuario) {
        for (User u : this.usuarios) {
            if (u != usuario) {
                u.receive(mensaje);
            }
        }
    }

    /**
     * Añade un usuario a la lista de usuarios.
     * 
     * @param usuario el usuario a añadir
     */
    @Override
    public void addUser(User usuario) {
        this.usuarios.add(usuario);
    }

}
