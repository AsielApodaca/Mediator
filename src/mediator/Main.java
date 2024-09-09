package mediator;

/**
 * Pruebas
 * @author Asiel Apodaca Monge
 */
public class Main {

    public static void main(String[] args) {
        ChatMediator mediador = new ChatMediatorImpl();
        
        User usuario1 = new UserImpl(mediador, "Usuario 1");
        User usuario2 = new UserImpl(mediador, "Usuario 2");
        User usuario3 = new UserImpl(mediador, "Usuario 3");
        
        mediador.addUser(usuario1);
        mediador.addUser(usuario2);
        mediador.addUser(usuario3);
        
        usuario1.send("Hola mundo!");
    }

}
