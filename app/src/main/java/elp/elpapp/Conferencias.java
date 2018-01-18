

package elp.elpapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.OnInitializedListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;


public class Conferencias extends Fragment {

    FragmentTransaction fragmentTransaction;
    private ArrayList<DatosConferencias> ItemsConferencias;
    private AdaptadorConferencias AdaptadorConferencias;
    private ListView listaItemsConferencias;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.conferencias, container, false);
        listaItemsConferencias = (ListView) rootView.findViewById(R.id.listItemsConferencias);
        loadItemsConferencias();
        listaItemsConferencias.setClickable(true);
        listaItemsConferencias.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

            if (position == 0) {
                Intent myIntent = new Intent(arg1.getContext(),Conferencia1.class);
                startActivity(myIntent);
               // FragmentManager f = getFragmentManager();
                //Conferencia1 c = (Conferencia1) f.findFragmentById(R.id.youtubeplayerfragment);
            }
            if (position == 1) {
                Intent myIntent = new Intent(arg1.getContext(),Conferencia2.class);
                startActivity(myIntent);
            }
            if (position == 2) {
                Intent myIntent = new Intent(arg1.getContext(),Conferencia3.class);
                startActivity(myIntent);
            }
            if (position == 3) {
                Intent myIntent = new Intent(arg1.getContext(),Conferencia4.class);
                startActivity(myIntent);
            }
            if (position == 4) {
                Intent myIntent = new Intent(arg1.getContext(),Conferencia5.class);
                startActivity(myIntent);
            }

        }
    });
        return rootView;
}

    private void loadItemsConferencias(){

        ItemsConferencias = new ArrayList<DatosConferencias>();
        ItemsConferencias.add(new DatosConferencias("GDPR: Novedades e Impactos en Tecnologías  de la Información",R.drawable.img_confe11));
        ItemsConferencias.add(new DatosConferencias("Derechos de autor y cultura libre",R.drawable.img_confe22));
        ItemsConferencias.add(new DatosConferencias("Redecentralizing the Web: IPFS and Filecoin",R.drawable.img_confe33));
        ItemsConferencias.add(new DatosConferencias("Diálogo con ex-estudiantes",R.drawable.img_confe44));
        ItemsConferencias.add(new DatosConferencias("Brecha de género en las TICs",R.drawable.img_confe55));
        ItemsConferencias.add(new DatosConferencias(" ",0));
        AdaptadorConferencias = new AdaptadorConferencias(getActivity(), ItemsConferencias);
        listaItemsConferencias.setAdapter(AdaptadorConferencias);
    }


}
