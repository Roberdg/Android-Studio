package elp.elpapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Roberto on 02/01/2018.
 */

public class Test5 extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view1_5();

    }

    public void view1_5() {

        setContentView(R.layout.test5_1);
        Button b1_5 = (Button) findViewById(R.id.test5_siguiente1);
        b1_5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                view2_5();
            }
        });
    }

    public void view2_5() {

        setContentView(R.layout.test5_2);
        Button b2_5 = (Button) findViewById(R.id.test5_siguiente2);
        b2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view3_5();
            }
        });
        Button b3_5 = (Button) findViewById(R.id.test5_anterior1);
        b3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1_5();
            }
        });
    }
    public void view3_5() {
        setContentView(R.layout.test5_3);
        Button b4_5 = (Button) findViewById(R.id.test5_anterior2);
        b4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view2_5();
            }
        });
        Button b5_5 = (Button) findViewById(R.id.test5_finalizar);
        b5_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
