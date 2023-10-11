//package com.moderneinstein.android.arcade;
//package com.moderneinstein.android.official  ;
 package com.moderneinstein.android.effort  ;
 
import android.app.Activity;
import android.os.Bundle;
import android.R.layout ;
import android.R.id ; 
import android.widget.TextView ; 

import android.widget.Button ;
import android.view.ViewGroup  ; 
import android.app.Service ; 

import android.content.Intent ; 
import android.content.Context  ;
import android.view.View ;
import com.google.firebase.FirebaseApp ; 
import com.google.firebase.auth.FirebaseAuth ; 
import java.util.Arrays ; 
import java.util.Set ; 
import java.util.Queue ; 


public class RootActivity extends Activity
{
    /** Called when the activity is first created. */

    public static int  centreId = R.layout.activity_main  ;
    public static Context context  ; 
    public   ViewGroup[]  centres ;
    public  View[]  icons ;
    public  int[]  linear =  new int[]{R.id.main_1,R.id.main_1_1,R.id.main_1_1_1,R.id.main_1_1_2,R.id.main_1_1_3} ;
    public  int[] buffer = new int[]{R.id.main_1_1_1_1,R.id.main_1_1_2_1,R.id.main_1_1_2_2,R.id.main_1_1_2_3} ;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);  
         try{ 
         //  FirebaseApp notes =  FirebaseApp.initializeApp(context) ; 
           // Singleton.setApps(notes) ;    
           FirebaseAuth safes = FirebaseAuth.getInstance() ; 
           Singleton.setAuth(safes) ; Singleton.restate(true) ; 
         }catch( Exception cases){
        Tools.notify(cases.toString(), context,1000) ;
         }
        setContentView(centreId);
        context  = getApplicationContext() ;
        restate() ; 
        listeners()  ;   
    }
    public void restate(){
        int  height =  linear.length ;
        centres = new ViewGroup[height] ;
        for(int rd=height-1;rd>=0;rd--){
            centres[rd]  = (ViewGroup)findViewById(linear[rd]) ;
        }
        int draft =  buffer.length ;
        icons = new View[draft] ; 
        for(int sc=draft-1;sc>=0;sc--){
        icons[sc] =  (View)requireViewById(buffer[sc] ) ; 
        }
    }
    public void listeners(){
        routeView(icons[3],LoginActivity.class) ; 
         icons[1].setOnClickListener(
            new View.OnClickListener(){ 
                @Override 
                public void onClick(View arrive) {
                    Intent noted = new Intent(context,SelectActivity.class) ;
                    startActivity(noted) ;
                 }
            }
         ) ;
         icons[2].setOnClickListener(
            new View.OnClickListener(){
            @Override 
            public void onClick( View known){
                Intent intent = new Intent(context,SignupActivity.class) ;
                startActivity(intent) ;
            }
            }
         )  ; 
    }
    public void  routeView(View alias,Class<?> query){
        
        alias.setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View great){
                    Intent change = new Intent() ; 
                    change.setClass(context,query) ; 
                    startActivity(change) ;
                }
            }
        ) ; 
    }
}
