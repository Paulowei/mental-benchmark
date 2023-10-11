//package com.moderneinstein.android.arcade ;
//package com.moderneinstein.android.official  ;
 package com.moderneinstein.android.effort  ;
 
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.ViewGroup ; 
import android.os.Handler ;      
import android.content.Context ; 
import android.app.Activity ; 
import android.view.LayoutInflater ; 

import android.widget.TextView  ;
import android.view.View ; 
import androidx.fragment.app.FragmentTransaction ; 
import android.widget.Button ;
import android.content.Intent ;

import android.R.layout ;
import android.R.dimen ; 
import android.R.color ;
import android.R.string ; 
//import android.app.FragmentTransaction ; 


public class  SelectActivity extends Activity {

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
	
	public static int resourceId = R.layout.activity_select ; 
    public static Context  realms ; 
    public   View[] sigma ; 
    public  ViewGroup[] delta ; 
    public int[]  arrays  =  new int[] {R.id.select_1,R.id.select_1_1,R.id.select_1_1_1,R.id.select_1_1_2}  ; 
    public int[]  listed = new int[]{R.id.select_1_1_1_1,R.id.select_1_1_2_1,R.id.select_1_1_2_2,R.id.select_1_1_2_3} ; 
    

	//public static LayoutMana
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(resourceId);
        realms = getApplicationContext() ; 
        serialise() ; 
        events() ; 
    }

    public  void serialise(){
        int spans =  listed.length ; 
        sigma  =  new View[spans] ; 
        for(int gs=spans-1;gs>=0;gs--){
            View stated =  (View)findViewById( listed[gs])  ;
            stated.setVisibility(View.VISIBLE) ;
            sigma[gs] = stated ;
        }
        int amount = arrays.length ;
        delta = new ViewGroup[amount] ; 
        for(int rs=amount-1 ;rs>=0;rs--){
            ViewGroup collect =   (ViewGroup)findViewById(arrays[rs]) ;
            collect.setVisibility(View.VISIBLE) ;
            collect.requestLayout() ; 
            delta[rs] = collect ;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	// getMenuInflater().inflate(com.moderneinstein.android.arcade.trial.R.menu.main, menu);
	return true;
    }
    public void events(){
        ((Button)sigma[0]).setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View known){
                    Intent  actions = new Intent() ;
                     actions.setClass(realms,RootActivity.class ) ; 
                     actions.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) ; 
                    startActivity(actions) ;
                } 
            }
        ) ;
        ((Button)sigma[1]).setOnClickListener(
             new View.OnClickListener(){
                @Override 
                public void onClick(View stated){
                     Intent routes = new Intent() ;
                    routes.setClass(realms,Puzzle3Activity.class) ; 
                    startActivity(routes) ; 
                }
             }  )  ;
        sigma[2].setOnClickListener(
             new View.OnClickListener(){ 
                @Override
                public void onClick(View arise){
                    Intent surplus = new Intent() ; 
                    surplus.setClass(realms,Puzzle4Activity.class) ;
                    Bundle options =  new Bundle() ;
                    startActivity(surplus,options) ; 
                }
             }
        ) ;
        sigma[3].setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View enhance){
                    Intent greet= new Intent() ; 
                    greet.setClass(realms,Puzzle5Activity.class) ; 
                    startActivity(greet,new Bundle() ) ; 
                }
            }
        ) ;
    }

}

