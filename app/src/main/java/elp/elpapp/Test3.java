package elp.elpapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Roberto on 02/01/2018.
 */

public class Test3 extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view1_3();

    }

    public void view1_3() {

        setContentView(R.layout.test3_1);
        Button b1_3 = (Button) findViewById(R.id.test3_siguiente1);
        b1_3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                view2_3();
            }
        });
    }

    public void view2_3() {

        setContentView(R.layout.test3_2);
        Button b2_3 = (Button) findViewById(R.id.test3_siguiente2);
        b2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view3_3();
            }
        });
        Button b3_3 = (Button) findViewById(R.id.test3_anterior1);
        b3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1_3();
            }
        });
    }
    public void view3_3() {
        setContentView(R.layout.test3_3);
        Button b4_3 = (Button) findViewById(R.id.test3_anterior2);
        b4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view2_3();
            }
        });
        Button b5_3 = (Button) findViewById(R.id.test3_finalizar);
        b5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
