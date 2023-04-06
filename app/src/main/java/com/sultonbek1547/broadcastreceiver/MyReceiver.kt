package com.sultonbek1547.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.location.LocationManager
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.

        if (LocationManager.PROVIDERS_CHANGED_ACTION.equals(intent.action)) {
            val locationManager =
                context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
            val isGpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
            val isNetworkEnabled =
                locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)

            if (isGpsEnabled) {
                Toast.makeText(context, "GPS yondi", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "GPS o'chdi", Toast.LENGTH_SHORT).show()

            }

         

        }

    }
}