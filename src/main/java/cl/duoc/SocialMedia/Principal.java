

package cl.duoc.SocialMedia;

import cl.duoc.SocialDTO.Instagram;
import cl.duoc.SocialDTO.Twitter;
import cl.duoc.SocialMedia.Listas.ListaInsta;
import cl.duoc.SocialMedia.Listas.ListaTwi;
import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
        ListaInsta lIg = new ListaInsta();
        
        Instagram Ins1 = new Instagram();
        Ins1.setId(10);
        Ins1.setHistoria("Qué loco!");
        Ins1.setEstado(true);
        Ins1.setUsuario("Julián");
        Ins1.setPassword("121212");
        
        
        
        Instagram Ins2 = new Instagram();
        Ins2.setId(12);
        Ins2.setHistoria("La re concha de la lora");
        Ins2.setEstado(false);
        Ins2.setUsuario("Negro Jara");
        Ins2.setPassword("Asdfg");
        
        
        lIg.AgregarInstagram(Ins1);
        lIg.AgregarInstagram(Ins2);
        
        System.out.println(lIg);
    }
}
