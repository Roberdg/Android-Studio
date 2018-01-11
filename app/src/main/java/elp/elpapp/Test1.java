package elp.elpapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by Roberto on 02/01/2018.
 */

public class Test1 extends Activity {

    private int cont=0;
    private RadioButton res;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view1();

    }

        public void view1() {

            setContentView(R.layout.test1_1);
            res = (RadioButton) findViewById(R.id.test1_p1r4);

            Button b1_1 = (Button) findViewById(R.id.test1_siguiente1);
            b1_1.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    if(res.isChecked())
                        cont++;
                    view2();
                }
            });
        }

        public void view2() {

            setContentView(R.layout.test1_2);
            res = (RadioButton) findViewById(R.id.test1_p2r2);
            Button b2_1 = (Button) findViewById(R.id.test1_siguiente2);
            b2_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(res.isChecked())
                        cont++;
                    view3();
                }
            });

            Button b3_1 = (Button) findViewById(R.id.test1_anterior1);
            b3_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(cont>0)
                        cont--;
                    view1();
                }
            });
        }

        public void view3() {
            setContentView(R.layout.test1_3);

            Button b4_1 = (Button) findViewById(R.id.test1_anterior2);
            b4_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(cont>1)
                        cont--;
                    view2();
                }
            });

            res = (RadioButton) findViewById(R.id.test1_p3r1);
            Button b5_1 = (Button) findViewById(R.id.test1_finalizar);
            b5_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    if(res.isChecked() && cont==2) {
                        editor.putBoolean("icon_test1", true);
                        Toast.makeText(Test1.this,"Has conseguido una insignia en el test 1 ", Toast.LENGTH_LONG).show();
                    }
                    else
                        editor.putBoolean("icon_test1",false);
                    editor.commit();
                    finish();
                }
            });
        }

        /* */
}
