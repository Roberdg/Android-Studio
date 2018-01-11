package elp.elpapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorNoticia extends BaseAdapter{

    private Activity activity;
    private ArrayList<DatosNoticias> arrayItems;

    public AdaptadorNoticia(Activity activity, List<DatosNoticias> listaItems){

        super();
        this.activity = activity;
        this.arrayItems = new ArrayList<DatosNoticias>(listaItems);
    }

    public int getCount(){
        return arrayItems.size();
    }

    public Object getItem(int position){
        return arrayItems.get(position);
    }

    public long getItemId(int position){
        return position;
    }

    public static class Fila{

        TextView txtTitle;
        TextView txtDescripcion;
        ImageView img;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        Fila view = new Fila();
        LayoutInflater inflator = activity.getLayoutInflater();
        DatosNoticias itm = arrayItems.get(position);
        if(convertView == null){

            convertView = inflator.inflate(R.layout.items_noticias, parent, false);
            view.txtTitle = (TextView) convertView.findViewById(R.id.txtTitle);
            view.txtDescripcion = (TextView) convertView.findViewById(R.id.txtDescripcion);
            view.img = (ImageView) convertView.findViewById(R.id.imgItem);
            convertView.setTag(view);
        }
        else
            view = (Fila) convertView.getTag();

        view.txtTitle.setText(itm.getTitle());
        view.txtDescripcion.setText(itm.getDescripcion());
        view.img.setImageResource(itm.getImg());

        return convertView;
    }
}
