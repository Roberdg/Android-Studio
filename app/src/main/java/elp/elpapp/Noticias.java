package elp.elpapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Roberto on 26/12/2017.
 */

public class Noticias extends Fragment{

    private ArrayList<DatosNoticias> ItemsNoticia;
    private AdaptadorNoticia AdaptadorNoticia;
    private ListView listaItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootViewNoticias = inflater.inflate(R.layout.noticias, container, false);
        listaItems = (ListView) rootViewNoticias.findViewById(R.id.listItems);
        loadItemsNoticias();
        listaItems.setClickable(true);
        listaItems.setOnItemClickListener(new OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                if (position == 0) {
                    //Toast.makeText(arg1.getContext(),"estadisticas del usuario", Toast.LENGTH_SHORT).show();
                    Intent myIntent = new Intent(arg1.getContext(),Noticia1.class);
                    startActivity(myIntent);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(arg1.getContext(),Noticia2.class);
                    startActivity(myIntent);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(arg1.getContext(),Noticia3.class);
                    startActivity(myIntent);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(arg1.getContext(),Noticia4.class);
                    startActivity(myIntent);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(arg1.getContext(),Noticia5.class);
                    startActivity(myIntent);
                }
            }
        });
        return rootViewNoticias;
    }

    private void loadItemsNoticias(){

        ItemsNoticia = new ArrayList<DatosNoticias>();
        ItemsNoticia.add(new DatosNoticias("Facebook dará prioridad a los contenidos personales frente a los corporativos.","La red social Facebook anunció hoy que en el muro de sus usuarios dará prioridad a los contenidos publicados por familiares o amigos frente a ...", R.drawable.facebook));
        ItemsNoticia.add(new DatosNoticias("El CEO de Intel vendió casi todas sus acciones antes de hacerse público el fallo de seguridad de sus chips","Brian Krzanich, actual CEO de Intel, vendió el pasado mes de noviembre la mayoría de sus acciones en la compañía, justo antes de ...", R.drawable.ceo));
        ItemsNoticia.add(new DatosNoticias("¿Debe enseñarse programación en todas las carreras de la universidad?","Piénsalo por un momento. Estás leyendo este texto en un ordenador, un móvil o una tableta. Es probable que tu trabajo esté relacionado con la informática en ...", R.drawable.programacion));
        ItemsNoticia.add(new DatosNoticias("¿De qué manera puede afectar el fin de la neutralidad en Internet en EEUU a España?","Estados Unidos ha votado para acabar con Internet tal y como lo conocemos. Un proyecto que pretende acotar la libertad en Internet y que sean las grandes ... ", R.drawable.neutralidad_red));
        ItemsNoticia.add(new DatosNoticias("Auditoria express de seguridad de vulnerabilidades en los sistemas y redes IT","Durante tres semanas, la compañía verifica y valida la infraestructura informática en cuestión y ofrece la solución o el servicio de seguridad necesario para ...\n\n\n", R.drawable.auditoria_express));
        AdaptadorNoticia = new AdaptadorNoticia(getActivity(), ItemsNoticia);
        listaItems.setAdapter(AdaptadorNoticia);

    }
}
