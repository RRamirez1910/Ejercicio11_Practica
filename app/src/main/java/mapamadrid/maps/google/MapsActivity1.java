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

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);
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

        LatLng palacio = new LatLng(40.417296, -3.7134063);
        mMap.addMarker(new MarkerOptions().position(palacio).title("Palacio Real de Madrid").snippet("Nos encontramos en el Palacio Real.").icon(BitmapDescriptorFactory.fromResource(R.drawable.palacio)));

        LatLng templo = new LatLng(40.42400720688033, -3.7177202930155886);
        mMap.addMarker(new MarkerOptions().position(templo).title("Templo de Debod").snippet("Nos encontramos en uno de los lugares más bonitos de madrid.").icon(BitmapDescriptorFactory.fromResource(R.drawable.templo)));

        LatLng ventas = new LatLng(40.43222565972641, -3.66336090565639);
        mMap.addMarker(new MarkerOptions().position(ventas).title("Plaza de toros 'Las Ventas'").snippet("Nos encontramos en un lugar emblemático de la ciudad de Madrid").icon(BitmapDescriptorFactory.fromResource(R.drawable.plaza)));


        //Lugar por defecto donde nos sale el puntero(además le añadimos un zoom para que se vea más cerca):
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(madrid,10));

        //Añadir los controles de zoom.
        mMap.getUiSettings().setZoomControlsEnabled(true);


    }
}
