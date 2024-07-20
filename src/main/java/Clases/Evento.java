package Clases;

public interface Evento {
    
    public String getNombre();
    public String getLugar();
    public String getFecha();
    public int getCantVolunt();
    public String getCorreoAdministrador();
    public String getHora();
    public int getCantidadArboles();
    
    public void setNombre();
    public void setLugar();
    public void setFecha();
    public void setCantVolunt();
    public void setCorreoAdministrador();
    public void setHora();
    public void setCantidadArboles();

    public boolean verificarEspacioBlanco();
    public void enviar();

}
