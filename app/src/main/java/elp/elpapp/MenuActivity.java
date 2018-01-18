package elp.elpapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MenuActivity extends AppCompatActivity  {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private NavigationView navigationView;
    private TabLayout tabLayout;
    private FloatingActionButton fab;
    private DrawerLayout drawerL;
    private ActionBarDrawerToggle toggle;
    private Intent intent;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerL = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawerL, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawerL.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                    drawerL.closeDrawers();
                    //TextView c = (TextView) findViewById(R.id.text_nav_email);
                    //SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
                   // c.setText(prefs.getString("email", ""));
                    switch (menuItem.getItemId()) {

                        case R.id.nav_perfil:
                            Toast.makeText(MenuActivity.this, "Perfil del usuario", Toast.LENGTH_SHORT).show();
                            intent = new Intent(MenuActivity.this, Perfil.class);
                            startActivity(intent);

                            break;
                        case R.id.nav_estadisticas:
                            Toast.makeText(MenuActivity.this, "Estadísticas del usuario", Toast.LENGTH_SHORT).show();
                            intent = new Intent(MenuActivity.this, Estadisticas.class);
                            startActivity(intent);

                            break;
                        case R.id.campus:
                            Toast.makeText(MenuActivity.this, "Campus Virtual", Toast.LENGTH_SHORT).show();
                            uri = Uri.parse("http://www.ucm.es/campusvirtual");
                            intent = new Intent(Intent.ACTION_VIEW,uri);
                            startActivity(intent);
                            break;
                        case R.id.tutorias:
                            Toast.makeText(MenuActivity.this, "Profesores y tutorias", Toast.LENGTH_SHORT).show();
                            uri = Uri.parse("http://informatica.ucm.es/profesores-y-tutorias");
                            intent = new Intent(Intent.ACTION_VIEW,uri);
                            startActivity(intent);
                            break;
                        case R.id.examenes:
                            Toast.makeText(MenuActivity.this, "Exámenes", Toast.LENGTH_SHORT).show();
                            uri = Uri.parse("http://informatica.ucm.es/examenes-por-curso-y-grupo");
                            intent = new Intent(Intent.ACTION_VIEW,uri);
                            startActivity(intent);
                            break;
                        case R.id.nav_correo:
                            Toast.makeText(MenuActivity.this, "Correo electrónico del usuario", Toast.LENGTH_SHORT).show();
                            uri = Uri.parse("http://gmail.com");
                            intent = new Intent(Intent.ACTION_VIEW,uri);
                            startActivity(intent);
                            break;
                        case R.id.nav_cerrarsesion:
                            Toast.makeText(MenuActivity.this, "Ha cerrado la sesión", Toast.LENGTH_SHORT).show();
                            intent = new Intent(MenuActivity.this, LoginActivity.class);
                            startActivity(intent);
                            break;
                        case R.id.wiki_temario:
                            uri = Uri.parse("http://wikis.fdi.ucm.es/ELP/Página_principal#Temario_ELP");
                            intent = new Intent(Intent.ACTION_VIEW,uri);
                            startActivity(intent);
                            break;
                        case R.id.wiki_trabajo:
                            uri = Uri.parse("http://wikis.fdi.ucm.es/ELP/Trabajos_ELP");
                            intent = new Intent(Intent.ACTION_VIEW,uri);
                            startActivity(intent);
                            break;
                        case R.id.wiki_conferencias:
                            uri = Uri.parse("http://wikis.fdi.ucm.es/ELP/Conferencias");
                            intent = new Intent(Intent.ACTION_VIEW,uri);
                            startActivity(intent);
                            break;
                        case R.id.wiki_portal:
                            uri = Uri.parse("http://wikis.fdi.ucm.es/ELP/FdIwiki_ELP:Portal_de_la_comunidad");
                            intent = new Intent(Intent.ACTION_VIEW,uri);
                            startActivity(intent);
                            break;
                        case R.id.wiki_interes:
                            uri = Uri.parse("http://wikis.fdi.ucm.es/ELP/FdIwiki_ELP:EnlacesInteres");
                            intent = new Intent(Intent.ACTION_VIEW,uri);
                            startActivity(intent);
                            break;
                        case R.id.wiki_ayuda:
                            uri = Uri.parse("http://wikis.fdi.ucm.es/ELP/Ayuda:Tutorial");
                            intent = new Intent(Intent.ACTION_VIEW,uri);
                            startActivity(intent);
                            break;
                    }

                    return true;
            }
        });


            // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items_noticias to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main2, menu);
        //getMenuInflater().inflate(R.menu.menu_navegacion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.listItemsTest) {
            Intent mIntent = new Intent(MenuActivity.this, Test.class);
            startActivity(mIntent);
            return true;
        }
        if (id == R.id.listItems) {
            Intent mIntent = new Intent(MenuActivity.this, Noticias.class);
            startActivity(mIntent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.noticias, container, false);
            //TextView textView = (TextView) rootView.findViewById(R.id.textView);             //Cosa Rara puesta aqui!!
          //  textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    Noticias noticias = new Noticias();
                    return noticias;
                case 1:
                    Conferencias conferencias = new Conferencias();
                    return conferencias;
                case 2:
                    Test test = new Test();
                    return test;
                default:
                    return null;
            }

            //return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "NOTICIAS";
                case 1:
                    return "CONFERENCIAS";
                case 2:
                    return "TEST";
            }
            return null;
        }
    }



    /********************************************************/

    @Override
    public void onBackPressed() {
        drawerL = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerL.isDrawerOpen(GravityCompat.START)) {
            drawerL.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

}
