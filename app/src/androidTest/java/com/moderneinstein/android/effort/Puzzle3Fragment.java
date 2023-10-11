//package com.moderneinstein.android.official  ; //arcade  ; 
 // package com.moderneinstein.android.arcade  ;  
 package com.moderneinstein.android.effort  ;
import androidx.fragment.app.FragmentManager ; 
import androidx.fragment.app.FragmentTransaction ;
import  androidx.fragment.app.Fragment ;

import android.view.ViewGroup ; 
import android.view.View ; 
import android.os.Bundle  ; 
import android.widget.Button ; 
import android.widget.TextView ;
import android.view.LayoutInflater  ;

public  class  Puzzle3Fragment extends Fragment{ 


    public static int centralID = R.layout.static_fragment  ;
    public static  int[] buffer = { } ;
    public  View[] noted ; 
    public Puzzle3Controller controller ;


    public Puzzle3Fragment( ){
        super() ; 
        extend()  ; 
        ViewGroup noted = (ViewGroup)this.getView() ;
        controller = new Puzzle3Controller(this,noted,buffer) ;
        Bundle bundle = new Bundle()  ; 
       
    }
    @Override
    public  View onCreateView(LayoutInflater inflater,ViewGroup parent,Bundle useful){
            View verse =  inflater.inflate(centralID,parent) ;  
            ViewGroup aggregate =  (ViewGroup)verse ;
            controller =  new Puzzle3Controller(this,parent,buffer)  ;
            extend() ;
            return  (View)aggregate ; 
    }
    @Override 
    public void onCreate(Bundle savedInstanceState ){
        super.onCreate(savedInstanceState) ; 
        extend() ;
        ViewGroup allowed = (ViewGroup)this.getView() ;
        controller = new Puzzle3Controller(this,allowed,buffer) ;
    }
    public void extend(){
        int waves = buffer.length ; 
        noted = new View[waves] ;
        for( int fd=waves-1;fd>=0;fd--){
            int trade  = buffer[fd] ;
            View dear = (View)getView().findViewById(trade) ;
            noted[fd] = dear  ;
        }
    }
}