package Modelos;


public class Posdcast extends Audio{
    private String relator;
    private String tema;

    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones() > 5000){
            return 8;
        } else if (getTotalDeReproducciones() > 1000) {
            return 4;
        }else {
            return 2;
        }
    }

    public String getRelator() {
        return relator;
    }

    public void setRelator(String relator) {
        this.relator = relator;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

}
