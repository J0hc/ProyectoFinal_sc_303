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
public class Post {
    private String titulo;
    private String seccion;
    private String lugar;
    private String descripcion;
    private String contenido;
    private int idContenido = 0;

    public Post(){

    }

    public Post(String titulo, String lugar, String seccion, String descripcion, String contenido){
        this.titulo = titulo;
        this.lugar = lugar;
        this.seccion = seccion;
        this.descripcion = descripcion;
        this.contenido = contenido;
    }

    //GETTER

    public String getTitulo(){
        return this.titulo;
    }

    public String getLugar(){
        return this.lugar;
    }

    public String getSeccion(){
        return this.seccion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public String getContenido(){
        return this.contenido;
    }

    public int getIdContenido(){
        return this.idContenido;
    }

    //SETTER

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setLugar(String lugar){
        this.lugar = lugar;
    }

    public void setSeccion(String seccion){
        this.seccion = seccion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setContenido(String contenido){
        this.contenido = contenido;
    }

    //MÉTODOS PROPIOS

    public boolean verificarEspacioBlanco(){
        return false;
    }

    public String componerPost(){
        return "Retornar contenido de post";
    }

    public String enviarPost(){
        return "Enviar el post";
    }
}
