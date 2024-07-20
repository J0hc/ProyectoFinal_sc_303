package Clases;
/**
 *
 * Universidad Fidélitas - Facultad de Ingeniería
 * SC-303 Programación Cliente/Servidor Concurrente 
 * II Cuatrimestre, 2024
 * Proyecto Final - Grupo #3
 *
 *  305450804 - Julian Alfonso Hidalgo Chinchilla
 *  XXXXXXXXX - Freiser Yoseman Herrera Muñoz
 *  XXXXXXXXX - Rogelio Josué Vargas Fernández
 *
 */
public abstract class FormularioCliente {
    private String nombre;
    private String correo;
    private String motivo;
    private String mensaje;

    public FormularioCliente(){

    }

    public FormularioCliente(String nombre, String correo, String motivo, String mensaje){
        this.nombre = nombre;
        this.correo = correo;
        this.motivo = motivo;
        this.mensaje = mensaje;
    }

    //GETTER
    public String getNombre(){
        return this.nombre;
    }

    public String getCorreo(){
        return this.correo;
    }

    public String getMotivo(){
        return this.motivo;
    }

    public String getMensaje(){
        return this.mensaje;
    }

    //SETTER

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setMotivo(String motivo){
        this.motivo = motivo;
    }

    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }

    //MÉTODOS PROPIOS

    public void enviarMensaje(){

    }

    public boolean verificarEspacioBlanco(){
        return false;
    }
}
