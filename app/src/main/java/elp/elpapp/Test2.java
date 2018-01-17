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

public class Test2 extends Activity{

    private int contTest2=0;
    private RadioButton resTest2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view1_2();

    }

    public void view1_2() {

        setContentView(R.layout.test2_1);
        resTest2 = (RadioButton) findViewById(R.id.test2_p1r3);
        Button b1_2 = (Button) findViewById(R.id.test2_siguiente1);
        b1_2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(resTest2.isChecked())
                    contTest2++;
                view2_2();
            }
        });
    }

    public void view2_2() {

        setContentView(R.layout.test2_2);
        resTest2 = (RadioButton) findViewById(R.id.test2_p2r1);
        Button b2_2 = (Button) findViewById(R.id.test2_siguiente2);
        b2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resTest2.isChecked())
                    contTest2++;
                view3_2();
            }
        });
        Button b3_2 = (Button) findViewById(R.id.test2_anterior1);
        b3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contTest2>0)
                    contTest2--;
                view1_2();
            }
        });
    }
    public void view3_2() {
        setContentView(R.layout.test2_3);
        resTest2 = (RadioButton) findViewById(R.id.test2_p3r4);
        Button b4_2 = (Button) findViewById(R.id.test2_anterior2);
        b4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contTest2>1)
                    contTest2--;
                view2_2();
            }
        });
        Button b5_2 = (Button) findViewById(R.id.test2_finalizar);
        b5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                if(resTest2.isChecked() && contTest2==2) {
                    editor.putBoolean("icon_test2", true);
                    Toast.makeText(Test2.this,"Has conseguido una insignia en el test 2 ", Toast.LENGTH_LONG).show();
                }
                else
                    editor.putBoolean("icon_test2",false);
                editor.commit();
                finish();
            }
        });
    }
}
