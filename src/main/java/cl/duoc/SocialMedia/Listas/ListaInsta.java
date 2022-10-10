
package cl.duoc.SocialMedia.Listas;

import cl.duoc.SocialDTO.Instagram;
import java.util.ArrayList;

public class ListaInsta {
    private ArrayList<Instagram> Lista;
    
    public ListaInsta(){
        this.Lista = new ArrayList();
    }
    
    public ListaInsta(ArrayList<Instagram> Lista){
        this.Lista = Lista;
    }

    public ArrayList<Instagram> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Instagram> Lista) {
        this.Lista = Lista;
    }
    
    public void AgregarInstagram(Instagram Ig){
        this.Lista.add(Ig);
    }
    
    public void EliminarInstagram(Instagram Ig){
        this.Lista.remove(Ig);
    }
    
    public void ReemplazarInstagram(Instagram Ig){
        this.Lista.set(0, Ig);
    }
    
    public Instagram ObtenerInstagram(){
        return this.Lista.get(0);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Instagram obj : this.Lista){
            sb.append(obj);
        }
        return sb.toString();
    }
}
