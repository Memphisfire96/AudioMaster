package Modelos;

public class Favoritos {

    public void agregaNuevoAudio(Audio audio){
        if (audio.getClasificacion() >= 8){
            System.out.println(" Es uno de los favoritos del momento");
        }else {
            System.out.println(audio.getTitulo() + " tambien es uno de los favoritos");

        }
    }

}
