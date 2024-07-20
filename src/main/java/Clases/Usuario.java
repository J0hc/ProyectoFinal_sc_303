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
public abstract class Usuario {
    private String nombre;
    private String sexo;
    private String correo;
    private int edad;
    private String constrasegna;
    private int idUsuario = 0;

    public Usuario(){

    };

    public Usuario(String nombre, String sexo, String correo, int edad,
                   String contrasegna){
        this.nombre = nombre;
        this.sexo = sexo;
        this.correo = correo;
        this.edad = edad;
        this.constrasegna = contrasegna;
        this.idUsuario = idUsuario + 1;
    }

    //GETTER

    public String getNombre(){
        return this.nombre;
    }

    public String getSexo(){
        return this.sexo;
    }

    public String getCorreo(){
        return this.correo;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getContrasegna(){
        return this.constrasegna;
    }

    public int getIdUsuario(){
        return this.idUsuario;
    }

    //SETTER
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setContrasegna(String contrasegna){
        this.constrasegna = contrasegna;
    }
}
