//This program called Ray Wenderlich's program with minimum number of lines of code
package com.example.zohal.myapplication;

import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView myText = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // create intent for another app
        Intent intent = new Intent("com.raywenderlich.adaptiveweather.MainActivity");
        // Test to see if the app is available for you to use
        PackageManager packageManager = getPackageManager();
        List activities = packageManager.queryIntentActivities(intent,
                PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;
        // The previous four lines do the test for valid intent, and the next line
        // prints it to log
        Log.v("Here is the boolean: ", "" + isIntentSafe);
        // I had to add to Ray's Manifest.xml file in order to make it available to this app
        // look at the comments in there for relevant lines of code
        if (isIntentSafe)
        startActivity(intent);
    }

}


