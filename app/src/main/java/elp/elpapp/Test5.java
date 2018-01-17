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

public class Test5 extends Activity {

    private int contTest5=0;
    private RadioButton resTest5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view1_5();

    }

    public void view1_5() {

        setContentView(R.layout.test5_1);
        resTest5 = (RadioButton) findViewById(R.id.test5_p1r1);
        Button b1_5 = (Button) findViewById(R.id.test5_siguiente1);
        b1_5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(resTest5.isChecked())
                    contTest5++;
                view2_5();
            }
        });
    }

    public void view2_5() {

        setContentView(R.layout.test5_2);
        resTest5 = (RadioButton) findViewById(R.id.test5_p2r3);
        Button b2_5 = (Button) findViewById(R.id.test5_siguiente2);
        b2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resTest5.isChecked())
                    contTest5++;
                view3_5();
            }
        });
        Button b3_5 = (Button) findViewById(R.id.test5_anterior1);
        b3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contTest5>0)
                    contTest5--;
                view1_5();
            }
        });
    }
    public void view3_5() {
        setContentView(R.layout.test5_3);
        resTest5 = (RadioButton) findViewById(R.id.test5_p3r2);
        Button b4_5 = (Button) findViewById(R.id.test5_anterior2);
        b4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contTest5>1)
                    contTest5--;
                view2_5();
            }
        });
        Button b5_5 = (Button) findViewById(R.id.test5_finalizar);
        b5_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                if(resTest5.isChecked() && contTest5==2) {
                    editor.putBoolean("icon_test5", true);
                    Toast.makeText(Test5.this,"Has conseguido una insignia en el test 5 ", Toast.LENGTH_LONG).show();
                }
                else
                    editor.putBoolean("icon_test5",false);
                editor.commit();
                finish();
            }
        });
    }
}
