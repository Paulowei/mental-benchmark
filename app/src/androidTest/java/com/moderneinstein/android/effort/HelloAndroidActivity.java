//package com.moderneinstein.android.official  ;
//package com.moderneinstein.android.arcade;
package com.moderneinstein.android.effort  ;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.R.layout ; 

public class HelloAndroidActivity extends Activity {

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    public static int notedId =  R.layout.activity_main ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(notedId);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	// getMenuInflater().inflate(com.moderneinstein.android.arcade.trial.R.menu.main, menu);
	return true;
    }

}

