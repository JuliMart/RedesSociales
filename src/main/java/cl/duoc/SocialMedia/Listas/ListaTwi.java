
package cl.duoc.SocialMedia.Listas;

import cl.duoc.SocialDTO.Twitter;
import java.util.ArrayList;


public class ListaTwi {
    private ArrayList<Twitter> Lista;
    
    
    public ListaTwi(){
        this.Lista = new ArrayList();
        
    }

    public ListaTwi(ArrayList<Twitter> Lista){
        this.Lista = Lista;
    }

    public ArrayList<Twitter> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Twitter> Lista) {
        this.Lista = Lista;
    }
    
    public void AgregarTwitter(Twitter tw){
        this.Lista.add(tw);
    }
    
    public void EliminarTwitter(Twitter tw){
        this.Lista.remove(tw);
    }
    
    public void ReemplazarTwitter(Twitter tw){
        this.Lista.set(0,tw);
    }
    public Twitter ObtenerTwitter(int indice){
        return this.Lista.get(indice);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Twitter obj: this.Lista){
            sb.append(obj);
        }
        return sb.toString();
    }
}
