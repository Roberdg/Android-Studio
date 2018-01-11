package elp.elpapp;

/**
 * Created by Roberto on 26/12/2017.
 */

public class DatosNoticias {

    private String title;
    private String descripcion;
    private int img;

    public DatosNoticias(String titulo, String descripcion, int imagen){

        this.title = titulo;
        this.descripcion = descripcion;
        this.img = imagen;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String titulo){
        this.title = titulo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public int getImg(){
        return img;
    }

    public void setImg(int imagen){
        this.img = imagen;
    }

}
