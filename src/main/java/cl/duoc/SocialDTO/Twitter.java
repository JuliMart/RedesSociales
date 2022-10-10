
package cl.duoc.SocialDTO;

import java.time.LocalDate;


public class Twitter extends redSocial{
    private int Id;
    private String Noticia;
    private LocalDate Fecha;
    
    
    public Twitter(){
        this.Id = 0;
        this.Noticia = "";
        this.Fecha = LocalDate.now();
    }
    
    
    public Twitter(int Id,String Noticia,LocalDate Fecha){
        this.Id = Id;
        this.Noticia = Noticia;
        this.Fecha = Fecha;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNoticia() {
        return Noticia;
    }

    public void setNoticia(String Noticia) {
        this.Noticia = Noticia;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }
}