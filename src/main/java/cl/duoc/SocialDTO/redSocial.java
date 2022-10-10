
package cl.duoc.SocialDTO;

public class redSocial {
    private String Usuario;
    private String Password;
    
    
    public redSocial(){
        this.Usuario = "";
        this.Password = "";
    }
    
    public redSocial(String Usuario, String Password){
        this.Usuario = Usuario;
        this.Password = Password;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
