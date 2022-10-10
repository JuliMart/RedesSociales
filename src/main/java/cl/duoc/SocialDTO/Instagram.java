
package cl.duoc.SocialDTO;


public class Instagram extends redSocial{
    private int Id;
    private String Historia;
    private Boolean Estado;
    
    
    public Instagram(){
        this.Id = 0;
        this.Historia = "";
        this.Estado = false;
    }
    
    public Instagram(int Id, String Historia, Boolean Estado){
        this.Id = Id;
        this.Historia = Historia;
        this.Estado = Estado;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getHistoria() {
        return Historia;
    }

    public void setHistoria(String Historia) {
        this.Historia = Historia;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }
    
}
