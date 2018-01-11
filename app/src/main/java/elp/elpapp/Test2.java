package elp.elpapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Roberto on 02/01/2018.
 */

public class Test2 extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view1_2();

    }

    public void view1_2() {

        setContentView(R.layout.test2_1);
        Button b1_2 = (Button) findViewById(R.id.test2_siguiente1);
        b1_2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                view2_2();
            }
        });
    }

    public void view2_2() {

        setContentView(R.layout.test2_2);
        Button b2_2 = (Button) findViewById(R.id.test2_siguiente2);
        b2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view3_2();
            }
        });
        Button b3_2 = (Button) findViewById(R.id.test2_anterior1);
        b3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1_2();
            }
        });
    }
    public void view3_2() {
        setContentView(R.layout.test2_3);
        Button b4_2 = (Button) findViewById(R.id.test2_anterior2);
        b4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view2_2();
            }
        });
        Button b5_2 = (Button) findViewById(R.id.test2_finalizar);
        b5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
