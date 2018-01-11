package elp.elpapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Roberto on 03/01/2017.
 */

public class Estadisticas extends Activity {

    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView image5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);
        image1 = (ImageView) findViewById(R.id.imagen_test1);
        SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        if(prefs.getBoolean("icon_test1",false))
            image1.setVisibility(ImageView.VISIBLE);

       else
            image1.setVisibility(ImageView.INVISIBLE);
        image2 = (ImageView) findViewById(R.id.imagen_test2);
        if(prefs.getBoolean("icon_test2",false))
            image2.setVisibility(ImageView.VISIBLE);
        else
            image2.setVisibility(ImageView.INVISIBLE);
         image3 = (ImageView) findViewById(R.id.imagen_test3);
        if(prefs.getBoolean("icon_test3",false))
            image3.setVisibility(ImageView.VISIBLE);
        else
            image3.setVisibility(ImageView.INVISIBLE);
         image4 = (ImageView) findViewById(R.id.imagen_test4);
        if(prefs.getBoolean("icon_test4",false))
            image4.setVisibility(ImageView.VISIBLE);
        else
            image4.setVisibility(ImageView.INVISIBLE);
         image5 = (ImageView) findViewById(R.id.imagen_test5);
        if(prefs.getBoolean("icon_test5",false))
            image5.setVisibility(ImageView.VISIBLE);
        else
            image5.setVisibility(ImageView.INVISIBLE);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.activity_estadisticas, container, false);
        return v;
    }

}
