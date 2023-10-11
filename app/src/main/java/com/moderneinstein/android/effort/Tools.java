//package  com.moderneinstein.android.arcade ; 
//package com.moderneinstein.android.official  ;
package com.moderneinstein.android.effort  ;
import java.util.Set ; 
import java.util.Vector ; 
import java.util.List ; 
import java.lang.Thread ;
import java.lang.Runnable ; 
import java.util.Objects ;  

import android.content.Intent ; 
import android.content.Context ; 
import android.widget.Toast ; 
import android.app.Activity ; 

import android.view.View ; 
import android.widget.TextView ;
import android.view.ViewGroup ;
import android.os.Environment ; 

public class Tools {
    
    public static long DEFAULT_LAPSE = 800 ;  
    public static int[] margins = new int[]{7,7,7,7} ; 
    public static int[] paddings = new int[]{8,8,8,8} ; 
    public static  int[]  traits = new int[]
    {ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT} ; 
    public static void notify( String alias,Context source,long duration){
        Toast crumbs = new Toast(source) ; 
        crumbs.setDuration((int)duration)  ;
        crumbs.setText(alias) ;  
        crumbs.setMargin(margins[2],margins[3]) ;
        crumbs.show() ;   
    }   
    public static  ViewGroup.LayoutParams parameters(){
        ViewGroup.MarginLayoutParams params = 
        new ViewGroup.MarginLayoutParams(traits[0],traits[1]) ;  
        params.setMargins(margins[3],margins[2],margins[1],margins[0]) ; 
        return params ; 
    }
    public  static TextView dispatch(Context shell,String content){
        TextView  crest = new TextView(shell)  ;
        crest.setVisibility(View.VISIBLE)  ;
        crest.setPadding(paddings[0],margins[1],paddings[2],paddings[3]) ; 
        crest.setLayoutParams(parameters()) ;
        crest.setText(content) ; 
        return  crest ; 
    }  
    public static void setContent(View views,String content){
        if( views==null){return ;  }  
        Objects.requireNonNull (views,"The supplied view was null")  ;  
        TextView  casts = (TextView)views ; 
        casts.setText( content) ; 
    }
}
