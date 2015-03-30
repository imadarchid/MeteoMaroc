package com.imadarchid.meteomaroc;

/**
 * Created by Imad on 28/03/2015.
 */
import android.app.Activity;
import android.content.SharedPreferences;

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // Hadshi ila khouna mazal makhtar aucune ville
    // Agadir <3 hia la ville par défaut
    String getCity(){
        return prefs.getString("city", "Agadir, MA");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }

}
