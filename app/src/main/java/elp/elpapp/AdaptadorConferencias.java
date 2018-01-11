package elp.elpapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roberto on 09/01/2018.
 */

public class AdaptadorConferencias  extends BaseAdapter {

    private Activity activity;
    private ArrayList<DatosConferencias> arrayItemsConferencias;

    public AdaptadorConferencias(Activity activity, List<DatosConferencias> listaItemsConferencias){

        super();
        this.activity = activity;
        this.arrayItemsConferencias = new ArrayList<DatosConferencias>(listaItemsConferencias);
    }

    public int getCount(){
        return arrayItemsConferencias.size();
    }

    public Object getItem(int position){
        return arrayItemsConferencias.get(position);
    }

    public long getItemId(int position){
        return position;
    }

    public static class Fila{

        TextView txtTitle;
        ImageView img;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        AdaptadorConferencias.Fila view = new AdaptadorConferencias.Fila();
        LayoutInflater inflator = activity.getLayoutInflater();
        DatosConferencias itm = arrayItemsConferencias.get(position);
        if(convertView == null){

            convertView = inflator.inflate(R.layout.items_conferencias, parent, false);
            view.txtTitle = (TextView) convertView.findViewById(R.id.txtTitle);
            view.img = (ImageView) convertView.findViewById(R.id.imgItem);
            convertView.setTag(view);
        }
        else
            view = (AdaptadorConferencias.Fila) convertView.getTag();

        view.txtTitle.setText(itm.getTitle());
        view.img.setImageResource(itm.getImg());

        return convertView;
    }
}
