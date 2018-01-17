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

public class Test4 extends Activity {

    private int contTest4=0;
    private RadioButton resTest4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view1_4();

    }

    public void view1_4() {

        setContentView(R.layout.test4_1);
        resTest4 = (RadioButton) findViewById(R.id.test4_p1r3);
        Button b1_4 = (Button) findViewById(R.id.test4_siguiente1);
        b1_4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(resTest4.isChecked())
                    contTest4++;
                view2_4();
            }
        });
    }

    public void view2_4() {

        setContentView(R.layout.test4_2);
        resTest4 = (RadioButton) findViewById(R.id.test4_p2r4);
        Button b2_4 = (Button) findViewById(R.id.test4_siguiente2);
        b2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resTest4.isChecked())
                    contTest4++;
                view3_4();
            }
        });
        Button b3_4 = (Button) findViewById(R.id.test4_anterior1);
        b3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contTest4>0)
                    contTest4--;
                view1_4();
            }
        });
    }
    public void view3_4() {
        setContentView(R.layout.test4_3);
        resTest4 = (RadioButton) findViewById(R.id.test4_p3r3);
        Button b4_4 = (Button) findViewById(R.id.test4_anterior2);
        b4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contTest4>1)
                    contTest4--;
                view2_4();
            }
        });
        Button b5_4 = (Button) findViewById(R.id.test4_finalizar);
        b5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                if(resTest4.isChecked() && contTest4==2) {
                    editor.putBoolean("icon_test4", true);
                    Toast.makeText(Test4.this,"Has conseguido una insignia en el test 4 ", Toast.LENGTH_LONG).show();
                }
                else
                    editor.putBoolean("icon_test4",false);
                editor.commit();
                finish();
            }
        });
    }
}
