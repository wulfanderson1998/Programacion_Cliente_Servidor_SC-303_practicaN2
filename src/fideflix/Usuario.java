package fideflix;
import javax.swing.JOptionPane;

/**
 * Autor: Wulf Scott Anderson Prado
 * Universidad: Fidélitas
 * Curso: Programación Cliente/Servidor Concurrente  SC-303
 */
public class Usuario implements Comparable<Usuario> {
    private String nombre;
    private String usuario;
    private String correo;
    private String contrasena;
    
    public Usuario(String nombre, String usuario, String correo, String contraseña) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.correo = correo;
        this.contrasena = contraseña;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    private String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contraseña) {
        this.contrasena = contraseña;
    }
    public static void iniciarSesion(Usuario usuario){
        JOptionPane.showMessageDialog(null,
                "¡Bienvenido "+usuario.getNombre()+"!");
    }
    public boolean autenticar(String usuario, String contrasena){
        if (this.usuario.equals(usuario)){
                if (this.contrasena.equals(contrasena)){
                    return true;
            }
        }
        return false;
    }
    //***CAMBIO DE PRÁCTICA PROGRAMADA #2** SE IMPLEMENTÓ LA INTERFACE Comparable
    //Comparé por orden alfabético, ignorando mayúsculas y minúsculas para
    //que el orden sea más intuitivo.
    @Override
    public int compareTo(Usuario otro){
        return this.usuario.compareToIgnoreCase(otro.getUsuario());
    }
    
}
