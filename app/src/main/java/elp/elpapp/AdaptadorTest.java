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
 * Created by Roberto on 27/12/2017.
 */

public class AdaptadorTest  extends BaseAdapter {

    private Activity activity;
    private ArrayList<DatosTest> arrayItems;

    public AdaptadorTest(Activity activity, List<DatosTest> listaItems){

        super();
        this.activity = activity;
        this.arrayItems = new ArrayList<DatosTest>(listaItems);
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
    }

    public View getView(int position, View convertView, ViewGroup parent){

        AdaptadorTest.Fila view = new AdaptadorTest.Fila();
        LayoutInflater inflator = activity.getLayoutInflater();
        DatosTest itm = arrayItems.get(position);
        if(convertView == null){

            convertView = inflator.inflate(R.layout.items_test, parent, false);
            view.txtTitle = (TextView) convertView.findViewById(R.id.txtTitle);
            view.txtDescripcion = (TextView) convertView.findViewById(R.id.txtDescripcion);
            convertView.setTag(view);
        }
        else
            view = (AdaptadorTest.Fila) convertView.getTag();

        view.txtTitle.setText(itm.getTitle());
        view.txtDescripcion.setText(itm.getDescripcion());

        return convertView;
    }
}
