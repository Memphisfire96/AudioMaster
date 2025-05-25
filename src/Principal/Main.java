package Principal;

import Modelos.Cancion;
import Modelos.Favoritos;
import Modelos.Posdcast;

public class Main {
    public static void main(String[] args) {

        Cancion cancion1 = new Cancion();

        cancion1.setTitulo("Fearless part II ");
        cancion1.setDuracion(188);
        cancion1.setArtista("Chris Linton");
        cancion1.setAlbum("Lost Sky");
        cancion1.setGenero("Electronica");

        Posdcast post1 = new Posdcast();

        post1.setTitulo("Game in the house");
        post1.setDuracion(3600);
        post1.setRelator("GOTH");
        post1.setTema("videoJuegos");

        for (int i = 0; i < 100 ; i++) {
            cancion1.meGusta();
        }

        for (int i = 0; i < 5000 ; i++) {
            post1.reproduce();
        }

        System.out.println(post1.getTotalDeReproducciones());
        System.out.println(cancion1.getMeGusta());

        Favoritos favorito = new Favoritos();
        favorito.agregaNuevoAudio(post1);
        favorito.agregaNuevoAudio(cancion1);




        








    }
}