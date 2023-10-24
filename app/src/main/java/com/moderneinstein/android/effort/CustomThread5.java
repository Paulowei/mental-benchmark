//package com.moderneinstein.android.arcade ; 

//package com.moderneinstein.android.official  ;
package com.moderneinstein.android.effort  ;
import java.lang.Runnable ; 
import java.lang.Thread ; 
import java.lang.ThreadGroup ;  

import android.os.Handler ; 
import android.os.Looper ;
import java.lang.Thread.UncaughtExceptionHandler ; 
import java.util.concurrent.Executor ; 

import  android.graphics.Color ;
import android.graphics.drawable.Drawable ; 
import android.graphics.drawable.ColorDrawable ; 

import android.widget.Button ;
import android.view.View ; 
import  android.app.Activity     ;


public class CustomThread5  extends Thread implements Runnable  {

    public View delegate   ; 
    public Color  impede ;
    public static  int accepts = Color.argb(100,100,200,100) ;
    public static  int   amends = Color.argb(100,100,100,200 ) ;
    public static int DEFAULT_PAUSE = 1150 ;  //   1300 ; 
    public long  pauses ; 
    public  boolean activated ; 
    public int  front ;
    public static int[] colors =  {Color.argb(100,200,200,200),Color.argb(80,100,100,200) } ; 
    public Activity source ;  
    public static long exponent =   (long) Math.pow(10,6) ; 
     public CustomThread5(View alias ){
        this.delegate = alias ; 
        activated = false  ;
        front =  amends ;
        pauses = DEFAULT_PAUSE ;  
        this.source = (Activity )alias.getContext ( ) ;  
     } 
    public CustomThread5(View great,long  yield){
        this.pauses = yield ; 
        this.delegate = great ; 
        activated = false ; 
        front = accepts ; 
        this.source = (Activity)great.getContext() ;
    } 
    public CustomThread5(View abouts,long times,Activity parent){
        this.pauses = times ;
        this.activated = false ; 
        front = accepts ; 
        this.delegate = abouts ;  
        this.source = parent ; 
    }  
    public CustomThread5(View about,Activity central){
         this.front = accepts ;
         this.activated = false; 
        this.delegate = about ;
        this.pauses =  DEFAULT_PAUSE ; 
        this.source = central ; 
    }
    public void adjust(int states){
        if(front==accepts){front = amends ;}
        else{front = accepts  ;}
    }  
         //   delegate.setBackgroundColor(front) ;  
            //    }catch(InterruptedException 
            // except){except.printStackTrace() ; }  
        //  this.sleep(awaits)  ;   //   try{                  
    public void highlight(long  awaits){
       int greet =  accepts ; 
        long saturate = System.currentTimeMillis() ; 
        adjust(front) ; 
        delegate.setBackgroundColor(colors[1]) ;
           while(System.currentTimeMillis()-saturate< awaits){ }
        delegate.setBackgroundColor(colors[0]) ;
    }     
    public  void  implement(long distance){
         long point = System.nanoTime() ;  
         Executor noted =  source.getMainExecutor () ; 
        noted.execute(()-> delegate.setBackgroundColor(colors[1]) ); 
        while(System.nanoTime()-point<distance*exponent){}   
        noted.execute(()->{delegate.setBackgroundColor(colors[0]) ; }) ; 
        }
    public void setPause(long details) {
        this.pauses = details ; 
    }
    public void activate(){
        this.activated = true   ;
    }
    public void  restart(){
        this.activated = false;
    }  
    @Override
    public void run(){
       //  highlight(pauses) ;
      //   while(true ){
       //     if(activated==true){
         //     highlight(pauses) ;  
         implement( pauses) ; 
          //  String frames = this.getName() ; 
         //   }
        //    this.restart() ; 
       //  }
      // Testing functionality of the class ;
    }
}