package elp.elpapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Roberto on 30/12/2017.
 */

public class Perfil extends Activity{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        TextView c = (TextView)findViewById(R.id.text_correo);
        SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        c.setText(prefs.getString("email",""));

        TextView n = (TextView)findViewById(R.id.edit_nombre);
        n.setText(prefs.getString("nombre",""));

        TextView a = (TextView)findViewById(R.id.edit_apellidos);
        a.setText(prefs.getString("apellidos",""));

        TextView e = (TextView)findViewById(R.id.edit_edad);
        e.setText(prefs.getString("edad",""));

        TextView s = (TextView)findViewById(R.id.edit_sexo);
        s.setText(prefs.getString("sexo",""));

        /*****Boton editar***********/

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.activity_perfil, container, false);
        return v;
    }
}
