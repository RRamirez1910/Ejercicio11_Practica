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

        LatLng bernabeu = new LatLng(40.45295753795088, -3.688613378424293);
        mMap.addMarker(new MarkerOptions().position(bernabeu).title("Estadio Santiago Bernabeu").snippet("Nos encontramos en uno de los estadio más famosos del mundo.").icon(BitmapDescriptorFactory.fromResource(R.drawable.estadio)));

        LatLng prado = new LatLng(40.4137994, -3.6920053);
        mMap.addMarker(new MarkerOptions().position(prado).title("Museo Del Prado").snippet("Nos encontramos en uno de los mejores y más bonitos museos del mundo").icon(BitmapDescriptorFactory.fromResource(R.drawable.museo)));

        LatLng ventas = new LatLng(40.43222565972641, -3.66336090565639);
        mMap.addMarker(new MarkerOptions().position(ventas).title("Plaza de toros 'Las Ventas'").snippet("Nos encontramos en un lugar emblemático de la ciudad de Madrid").icon(BitmapDescriptorFactory.fromResource(R.drawable.plaza)));


        //Lugar por defecto donde nos sale el puntero(además le añadimos un zoom para que se vea más cerca):
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(madrid,10));


    }
}
