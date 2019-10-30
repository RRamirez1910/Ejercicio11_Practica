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

public class MapsActivity4 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps4);
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

        LatLng retiro = new LatLng(40.41476132506901, -3.6832186928776594);
        mMap.addMarker(new MarkerOptions().position(retiro).title("El Retiro").snippet("Nos encontramos en el parque más famoso de Madrid").icon(BitmapDescriptorFactory.fromResource(R.drawable.parque)));

        LatLng oeste = new LatLng(40.4315904, -3.7267007);
        mMap.addMarker(new MarkerOptions().position(oeste).title("Parque del Oeste").snippet("Nos encontramos en el parque del Oeste").icon(BitmapDescriptorFactory.fromResource(R.drawable.parque)));

        LatLng enrique = new LatLng(40.390332022173254, -3.683701292886383);
        mMap.addMarker(new MarkerOptions().position(enrique).title("Parque Enrique Tierno Galván").snippet("Nos encontramos en el parque Enrique tierno Galván").icon(BitmapDescriptorFactory.fromResource(R.drawable.parque)));


        //Lugar por defecto donde nos sale el puntero(además le añadimos un zoom para que se vea más cerca):
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(madrid,10));
    }
}
