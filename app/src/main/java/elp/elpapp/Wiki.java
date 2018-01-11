package elp.elpapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Wiki extends Fragment {

    protected Uri uri;
    protected Intent intent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.wiki, container, false);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onWiki(view);
            }
        };
        v.findViewById(R.id.imageView1).setOnClickListener(onClickListener);
        v.findViewById(R.id.imageView2).setOnClickListener(onClickListener);
        v.findViewById(R.id.imageView3).setOnClickListener(onClickListener);
        v.findViewById(R.id.imageView4).setOnClickListener(onClickListener);
        v.findViewById(R.id.imageView5).setOnClickListener(onClickListener);
        v.findViewById(R.id.imageView6).setOnClickListener(onClickListener);

        return v;
    }

    private void onWiki(View v){

        switch (v.getId()){
            case R.id.imageView1:
                uri = Uri.parse("http://wikis.fdi.ucm.es/ELP/P%C3%A1gina_principal#Temario_ELP");
                break;
            case R.id.imageView2:
                uri = Uri.parse("http://wikis.fdi.ucm.es/ELP/Trabajos_ELP");
                break;
            case R.id.imageView3:
                uri = Uri.parse("http://wikis.fdi.ucm.es/ELP/Conferencias");
                break;
            case R.id.imageView4:
                uri = Uri.parse("http://wikis.fdi.ucm.es/ELP/FdIwiki_ELP:Portal_de_la_comunidad");
                break;
            case R.id.imageView5:
                uri = Uri.parse("http://wikis.fdi.ucm.es/ELP/FdIwiki_ELP:EnlacesInteres");
                break;
            case R.id.imageView6:
                uri = Uri.parse("http://wikis.fdi.ucm.es/ELP/Ayuda:Tutorial");
                break;
            default:
                break;
        }
        intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }


}


