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
        ItemsNoticia.add(new DatosNoticias("Test 1","Referido al primer tema", R.drawable.imagen1));
        ItemsNoticia.add(new DatosNoticias("Test 2","Referido al segundo tema", R.drawable.imagen1));
        ItemsNoticia.add(new DatosNoticias("Test 3","Referido al tercer tema", R.drawable.imagen1));
        ItemsNoticia.add(new DatosNoticias("Test 4","Referido al cuarto tema", R.drawable.imagen1));
        ItemsNoticia.add(new DatosNoticias("Test 5","Referido al quinto tema", R.drawable.imagen1));

        AdaptadorNoticia = new AdaptadorNoticia(getActivity(), ItemsNoticia);
        listaItems.setAdapter(AdaptadorNoticia);

    }
}
