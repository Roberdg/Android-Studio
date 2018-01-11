package elp.elpapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Roberto on 02/01/2018.
 */

public class Test4 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view1_4();

    }

    public void view1_4() {

        setContentView(R.layout.test4_1);
        Button b1_4 = (Button) findViewById(R.id.test4_siguiente1);
        b1_4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                view2_4();
            }
        });
    }

    public void view2_4() {

        setContentView(R.layout.test4_2);
        Button b2_4 = (Button) findViewById(R.id.test4_siguiente2);
        b2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view3_4();
            }
        });
        Button b3_4 = (Button) findViewById(R.id.test4_anterior1);
        b3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1_4();
            }
        });
    }
    public void view3_4() {
        setContentView(R.layout.test4_3);
        Button b4_4 = (Button) findViewById(R.id.test4_anterior2);
        b4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view2_4();
            }
        });
        Button b5_4 = (Button) findViewById(R.id.test4_finalizar);
        b5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
