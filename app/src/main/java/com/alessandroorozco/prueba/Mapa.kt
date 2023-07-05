package com.alessandroorozco.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alessandroorozco.prueba.databinding.ActivityMapaBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class Mapa : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActivityMapaBinding
    private lateinit var googleMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fragmentMap = supportFragmentManager.findFragmentById(R.id.fcv_map) as SupportMapFragment
        fragmentMap.getMapAsync(this)

    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map
        val adidasStoreLocation = LatLng(-12.084783173721215, -76.9771239046464) // Ubicación de Adidas Store en Lima, Surco
        googleMap.addMarker(MarkerOptions().position(adidasStoreLocation).title("Adidas Store"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(adidasStoreLocation, 16f))
    }
}