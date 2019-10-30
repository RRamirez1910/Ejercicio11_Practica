package mapamadrid.maps.google;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity3 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps3);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Añadimos las marcas que queramos al mapa con lo siguiente:
        LatLng madrid = new LatLng(40.4167047, -3.7035825);
        mMap.addMarker(new MarkerOptions().position(madrid).title("Madrid").snippet("Nos encontramos en la ciudad de Madrid").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));

        LatLng bernabeu = new LatLng(40.45295753795088, -3.688613378424293);
        mMap.addMarker(new MarkerOptions().position(bernabeu).title("Estadio Santiago Bernabeu").snippet("Estadio del Real Madrid").icon(BitmapDescriptorFactory.fromResource(R.drawable.real)));

        LatLng wanda = new LatLng(40.43621, -3.5994827);
        mMap.addMarker(new MarkerOptions().position(wanda).title("Wanda Metropolitano").snippet("Estadio del Atletico de Madrid").icon(BitmapDescriptorFactory.fromResource(R.drawable.estadio)));

        LatLng getafe = new LatLng(40.3257014, -3.7149348);
        mMap.addMarker(new MarkerOptions().position(getafe).title("Coliseum Alfonso Pérez").snippet("Estadio del Getafe").icon(BitmapDescriptorFactory.fromResource(R.drawable.estadio)));


        //Lugar por defecto donde nos sale el puntero(además le añadimos un zoom para que se vea más cerca):
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(madrid,10));

        //Añadir los controles de zoom.
        mMap.getUiSettings().setZoomControlsEnabled(true);
    }
}
