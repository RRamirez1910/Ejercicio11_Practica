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

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
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

        LatLng tysen = new LatLng(40.4162159, -3.6949317);
        mMap.addMarker(new MarkerOptions().position(tysen).title("Museo Thyssen-Bornemisza").snippet("Nos encontramos en el museo Thyssen-Bornemisza.").icon(BitmapDescriptorFactory.fromResource(R.drawable.museo)));

        LatLng prado = new LatLng(40.4137994, -3.6920053);
        mMap.addMarker(new MarkerOptions().position(prado).title("Museo Del Prado").snippet("Nos encontramos en uno de los mejores y más bonitos museos del mundo").icon(BitmapDescriptorFactory.fromResource(R.drawable.museo)));

        LatLng naturales = new LatLng(40.4410362, -3.6897559);
        mMap.addMarker(new MarkerOptions().position(naturales).title("Museo Nacional de Ciencias Naturales").snippet("Nos encontramos en el Museo Nacional de Ciencias Naturales").icon(BitmapDescriptorFactory.fromResource(R.drawable.museo)));


        //Lugar por defecto donde nos sale el puntero(además le añadimos un zoom para que se vea más cerca):
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(madrid,10));
    }
}
