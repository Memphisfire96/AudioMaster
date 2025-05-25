package Modelos;

public class Cancion extends Audio{
    private String artista;
    private String album;
    private String genero;

    @Override
    public int getClasificacion() {
        if (getMeGusta() > 5000){
            return 8;
        } else if (getMeGusta() > 1000) {
            return 4;
        }else {
            return 2;
        }
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
