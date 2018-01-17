package elp.elpapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by Roberto on 02/01/2018.
 */

public class Test3 extends Activity {

    private int contTest3=0;
    private RadioButton resTest3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view1_3();

    }

    public void view1_3() {

        setContentView(R.layout.test3_1);
        resTest3 = (RadioButton) findViewById(R.id.test3_p1r2);
        Button b1_3 = (Button) findViewById(R.id.test3_siguiente1);
        b1_3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(resTest3.isChecked())
                    contTest3++;
                view2_3();
            }
        });
    }

    public void view2_3() {

        setContentView(R.layout.test3_2);
        resTest3 = (RadioButton) findViewById(R.id.test3_p2r1);
        Button b2_3 = (Button) findViewById(R.id.test3_siguiente2);
        b2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resTest3.isChecked())
                    contTest3++;
                view3_3();
            }
        });
        Button b3_3 = (Button) findViewById(R.id.test3_anterior1);
        b3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contTest3>0)
                    contTest3--;
                view1_3();
            }
        });
    }
    public void view3_3() {
        setContentView(R.layout.test3_3);
        resTest3 = (RadioButton) findViewById(R.id.test3_p3r3);
        Button b4_3 = (Button) findViewById(R.id.test3_anterior2);
        b4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contTest3>1)
                    contTest3--;
                view2_3();
            }
        });
        Button b5_3 = (Button) findViewById(R.id.test3_finalizar);
        b5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                if(resTest3.isChecked() && contTest3==2) {
                    editor.putBoolean("icon_test3", true);
                    Toast.makeText(Test3.this,"Has conseguido una insignia en el test 3 ", Toast.LENGTH_LONG).show();
                }
                else
                    editor.putBoolean("icon_test3",false);
                editor.commit();
                finish();
            }
        });
    }
}
