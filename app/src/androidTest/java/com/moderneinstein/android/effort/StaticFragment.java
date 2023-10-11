//package com.moderneinstein.android.official ; //arcade ;
package com.moderneinstein.android.effort  ;
import androidx.fragment.app.Fragment ; 
import android.view.LayoutInflater ; 
import android.content.Context ; 
import android.view.ViewGroup ; 
import androidx.fragment.app.FragmentTransaction ; 
import androidx.fragment.app.FragmentManager ; 

import android.app.Activity ; 
import android.view.View ; 
import android.widget.Button ; 
import android.os.Bundle ;


public class StaticFragment extends Fragment{


    public static int  coresId = R.layout.static_fragment ; 
    public View values[] = {  } ;
    public static int[] frames =  {  }  ;
   // public Puzzle3Controller controller ;

    public void bindViews(){
        int amount = frames.length ; 
        Activity  action = this.getActivity() ;
        values= new View[amount];
        for(int dc=amount-1;dc>=0;dc--){
            int crest = frames[dc]  ; 
            View portion = action.requireViewById(crest) ;
            values[dc] = portion ;
        }
    }
    public  StaticFragment(){
        super( ) ; 
        bindViews() ; 

    }
    @Override 
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState)  ;
    }
    @Override
    public View onCreateView(LayoutInflater inflate,ViewGroup  parent,Bundle options){
        View noted = (View)inflate.inflate(coresId,parent,true ) ;
      //  controller = new Puzzle3Controller(this,parent,frames) ;
        
        bindViews() ;
        return  noted ;  
    }

}

