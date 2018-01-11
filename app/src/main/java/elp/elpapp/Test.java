package elp.elpapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import java.util.ArrayList;

public class Test extends Fragment {

    FragmentTransaction fragmentTransaction;
    private ArrayList<DatosTest> ItemsTest;
    private AdaptadorTest AdaptadorTest;
    private ListView listaItemsTest;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.test, container, false);
        listaItemsTest = (ListView) rootView.findViewById(R.id.listItemsTest);
        loadItemsTest();
        listaItemsTest.setClickable(true);
        listaItemsTest.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                if (position == 0) {
                    Intent myIntent = new Intent(arg1.getContext(),Test1.class);
                    startActivity(myIntent);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(arg1.getContext(),Test2.class);
                    startActivity(myIntent);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(arg1.getContext(),Test3.class);
                    startActivity(myIntent);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(arg1.getContext(),Test4.class);
                    startActivity(myIntent);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(arg1.getContext(),Test5.class);
                    startActivity(myIntent);
                }

            }
        });
        return rootView;
    }

    private void loadItemsTest(){

        ItemsTest = new ArrayList<DatosTest>();
        ItemsTest.add(new DatosTest("Test 1","Referido al primer tema"));
        ItemsTest.add(new DatosTest("Test 2","Referido al segundo tema"));
        ItemsTest.add(new DatosTest("Test 3","Referido al tercer tema"));
        ItemsTest.add(new DatosTest("Test 4","Referido al cuarto tema"));
        ItemsTest.add(new DatosTest("Test 5","Referido al quinto tema"));

        AdaptadorTest = new AdaptadorTest(getActivity(), ItemsTest);
        listaItemsTest.setAdapter(AdaptadorTest);
    }

}
