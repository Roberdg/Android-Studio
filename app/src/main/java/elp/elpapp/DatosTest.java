package elp.elpapp;

/**
 * Created by Roberto on 27/12/2017.
 */

public class DatosTest {

    private String title;
    private String descripcion;

    public DatosTest(String titulo, String descripcion){

        this.title = titulo;
        this.descripcion = descripcion;
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


}
