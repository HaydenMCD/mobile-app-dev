package op.mobile.app.dev.mcdohr2.travelling.ui.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.*
import op.mobile.app.dev.mcdohr2.travelling.R

/**
 * Class implements OnMapReadyCallback
 */
class MapFragment : Fragment(), OnMapReadyCallback {

    /**
     * Get List of Attraction from the HomeFragment
     */
    private val attractions by lazy {
        MapFragmentArgs.fromBundle(requireArguments()).attractions.toList()
    }

    /**
     * Inflating the fragment_map.xml
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /**
         * Get the fragment widget in fragment_map.xml
         */
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment

        /**
         * A Google Map must be acquired using getMapAsync(OnMapReadyCallback). It
         * will automatically initialise the Map's system and view
         */
        mapFragment?.getMapAsync(this)
    }

    /**
     * Implementing member of OnMapReadyCallback. It needs a reference to a GoogleMap
     */
    override fun onMapReady(googleMap: GoogleMap) {
        val defaultZoom = 5f
        /**
         * For each Attraction, create a marker and add it to the Google Map
         */
        attractions.forEach {
            val marker = MarkerOptions() // Create a new MarkerOption object
            marker.position(LatLng(it.location.latitude, it.location.longitude)) // Coordinates of the marker
            marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)) // Colour of the marker
            googleMap.addMarker(marker)?.tag = it
        }

        /**
         * Set the info window adapter. This info is set in AttractionInfoWindow, i.e., setting
         * a TextView widget's text property to the Attraction's name
         */
        googleMap.setInfoWindowAdapter(AttractionInfoWindow(requireContext()))

        /**
         * Get the initial position of the first Attraction's
         * latitude and longitude coordinates
         */
        val initialPosition = LatLng(
            attractions[0].location.latitude,
            attractions[0].location.longitude
        )


        /**
         * Set the Google Map's camera position to the first Attraction's
         * latitude and longitude coordinates
         */
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(initialPosition, defaultZoom))
    }
}