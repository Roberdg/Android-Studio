package elp.elpapp;

/**
 * Created by Roberto on 26/12/2017.
 */

public class DatosConferencias {

    private String title;
    private int img;

    public DatosConferencias(String titulo, int imagen){

        this.title = titulo;
        this.img = imagen;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String titulo){
        this.title = titulo;
    }

    public int getImg(){
        return img;
    }

    public void setImg(int imagen){
        this.img = imagen;
    }

}
