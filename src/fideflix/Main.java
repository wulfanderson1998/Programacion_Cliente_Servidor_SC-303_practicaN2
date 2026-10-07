package fideflix;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Autor: Wulf Scott Anderson Prado
 * Universidad: Fidélitas
 * Curso: Programación Cliente/Servidor Concurrente  SC-303
 */
/*
 * NOTAS NUEVAS, PRÁCTICA #2
 * Se añadió un comentario con la etiqueta ***CAMBIOS DE PRÁCTICA PROGRAMADA #2** para
 * identificar las secciones donde se implementaron cambios.
 * ---
 * NOTAS DE PRÁCTICA #1
 * SE UTILIZARÁN LAS SIGUIENTES CLASES
 * ---
 * Main: Clase de arranque (transitoria).
 * ---
 * Menu: Lógica principal del menú.
 * ---
 * Audiovisual: Superclase de la que heredan Pelicula, Serie y Documental.
 * Audiovisual define los atributos más importantes que son comunes a las
 * subclases. Elegí usar una clase regular porque el método setDuracion()
 * se comporta igual en Serie y Documental y solo requiere una implementación
 * adicional en la clase Pelicula.
 * ---
 * Comentario: Los objetos de tipo Comentario almacenan la calificación y
 * el comentario de un usuario. Además, sirven para dar trazabilidad de quién
 * emitió una calificación.
 */
public class Main {
    public static void main(String[] args) {
        //***CAMBIOS DE PRÁCTICA PROGRAMADA #2** Añadir colección de usuarios.
        //Se ejecutan los cambios en el main según instrucciones.
        ArrayList<Usuario> usuarios = new ArrayList<>();
        //***CAMBIOS DE PRÁCTICA PROGRAMADA #2** Agregar 10 objetos de clase Usuario.
        //Todos diferentes, según instrucciones. 
        Usuario carlos = new Usuario("Carlos", "carlosCR", "Carlos2001@gmail.com", "1234");
        Usuario maria = new Usuario("María", "mariaSol", "Maria1999@gmail.com", "1234");
        Usuario jose = new Usuario("José", "joseTico", "Jose2003@gmail.com", "1234");
        Usuario ana = new Usuario("Ana", "anaLuna", "Ana2000@gmail.com", "1234");
        Usuario luis = new Usuario("Luis", "luisPro", "Luis1998@gmail.com", "1234");
        Usuario sofia = new Usuario("Sofía", "sofiaCR", "Sofia2002@gmail.com", "1234");
        Usuario daniel = new Usuario("Daniel", "danielGT", "Daniel1997@gmail.com", "1234");
        Usuario laura = new Usuario("Laura", "lauraSky", "Laura2004@gmail.com", "1234");
        Usuario andres = new Usuario("Andrés", "andresDev", "Andres2001@gmail.com", "1234");
        Usuario paula = new Usuario("Paula", "paulaStar", "Paula2000@gmail.com", "1234");
        //Se añaden los usuarios
        usuarios.add(carlos);
        usuarios.add(maria);
        usuarios.add(jose);
        usuarios.add(ana);
        usuarios.add(luis);
        usuarios.add(sofia);
        usuarios.add(daniel);
        usuarios.add(laura);
        usuarios.add(andres);
        usuarios.add(paula);
        //***CAMBIOS DE PRÁCTICA PROGRAMADA #2** Eliminar un usuario y manejar excepción
        //Usuario real
        try {
            eliminarUsuario("carlosCR", usuarios);
        } catch (ExcepcionUsuarioNoEncontrado e){
            System.out.println(e.getMessage()); //Se manejó en forma similar a la guía interactiva de esta semana.
        }                                      
        //Usuario no existente
        try {
            eliminarUsuario("raquel22", usuarios);
        } catch (ExcepcionUsuarioNoEncontrado g){
            System.out.println(g.getMessage()); //Se manejó en forma similar a la guía interactiva.
        }
        //***CAMBIOS DE PRÁCTICA PROGRAMADA #2** Se utiliza método sort() para ordenar Usuarios.
        //Se implementó el método comparable por orden alfabético, sin tomar en cuenta
        //mayúsculas y minúsculas.
        usuarios.sort(null); //sort sin usar comparator, solo Comparable
        //CÓDIGO DE LA PRIMERA PRÁCTICA 
        Menu menu = new Menu();
        menu.generarPeliculasEjemplo();
        menu.generarSeriesEjemplo();
        menu.generarDocumentalesEjemplo();
        menu.pantallaInicioSesion();
        //***CAMBIOS DE PRÁCTICA PROGRAMADA #2** Destrucción de los objetos
        usuarios.clear();
        menu = null;
        
    }
    //***CAMBIOS DE PRÁCTICA PROGRAMADA #2** Método para remover usuarios por nombre de usuario.
    public static void eliminarUsuario(String usuario, ArrayList<Usuario> usuarios) throws ExcepcionUsuarioNoEncontrado {
        for (int x = 0; x < usuarios.size(); x++){
            if (usuarios.get(x).getUsuario().equals(usuario)){
                usuarios.remove(x); //Método .remove()
                System.out.println(
                        "El usuario "+usuario+" fue eliminado satisfactoriamente");
                return; 
            }
        }
        throw new ExcepcionUsuarioNoEncontrado(usuario);
    }
}
