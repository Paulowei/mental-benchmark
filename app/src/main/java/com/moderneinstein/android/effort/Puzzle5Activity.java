 //package  com.moderneinstein.android.arcade   ; 
//package com.moderneinstein.android.official  ;
package com.moderneinstein.android.effort  ;
import android.os.Handler ;
import android.os.Looper ;
import android.os.Bundle ;
import android.os.CountDownTimer ; 

import android.app.Service ;
import android.app.Activity ; 
import android.content.Context ; 
import android.content.Intent ; 

import android.widget.RelativeLayout ;  
import android.widget.Chronometer  ; 
import android.widget.TextView ;   
 
import android.widget.Button  ; 
import android.widget.Toast ;  

import android.view.ViewGroup  ;
import  android.view.View ; 
import android.view.LayoutInflater   ; 
import android.graphics.Color ; 

import java.util.List ; 
import java.util.Vector ;
import java.util.ArrayList ;
import java.util.LinkedList ; 
import java.util.Queue ; 
import  java.lang.Class ; 


public class Puzzle5Activity  extends Activity {

    public  static int  stateId = R.layout.activity_puzzle_5 ;
    public static int[] viewId =  {R.id.puzzle_5_1_1_1_1,R.id.puzzle_5_1_1_1_3_1,R.id.puzzle_5_1_1_1_3_2,
        R.id.puzzle_5_1_1_1_4_1,R.id.puzzle_5_1_1_1_4_2,R.id.puzzle_5_1_1_1_5_1,R.id.puzzle_5_1_1_1_5_2,R.id.puzzle_5_1_1_1_6_1,R.id.puzzle_5_1_1_1_2_1 } ; 
    public static int[] groupId = {R.id.puzzle_5_1,R.id.puzzle_5_1_1,R.id.puzzle_5_1_1_1,R.id.puzzle_5_1_1_1_1,
        R.id.puzzle_5_1_1_1_2,R.id.puzzle_5_1_1_1_3,R.id.puzzle_5_1_1_1_4,R.id.puzzle_5_1_1_1_5}  ; 
    public  List<View>   icons ;
    public   List<ViewGroup> layouts ;  
    public  Context  wrapper  ;  
     public static long DEFAULT_BASE =  15l   ; 
     public boolean accepting = false  ;  
     public String[] buffers = new String[]{"00:","","",""} ;
    //  public  void configureBase 
    // implicits.getText(). 
    public int currentCount ;    
    //  TextView  implicits =  (TextView)icons.get(5) ; 
    private long[] remaining = new long[2] ;    
    private CountDownTimer timer ; 
    public int  deriveBase(){
        TextView  implicits =  (TextView)icons.get(1) ; 
        int gross  = (int)DEFAULT_BASE ; 
        String  portion = implicits.getText( ).toString( ) ; 
        if(portion.length()>0){
            Integer bright = Integer.parseInt(portion ) ; 
            return bright.intValue() ; 
        }else{
          return  gross ;
        }
    }
    // Integer.parseInt((Teicons.get(3))   
    // orders.setCountDown(true) ;   
    //  orders.setCountDown(false )   ;     
    public  void  configureTimer(View voltage){  
        Chronometer orders = (Chronometer)voltage ;    
        orders.setFormat( "%s") ;   
        orders.setCountDown(true )   ;     
         orders.setBase(deriveBase( ))   ;    
        orders.setOnChronometerTickListener(
            new  Chronometer.OnChronometerTickListener(){
                @Override 
                public  void  onChronometerTick(Chronometer chronic){
                    //  
                }
            }
        ) ;  
        orders.start() ;   
    }    
    // remaining   
    /*
     *  timer = new CountDownTimer( remaining*1000,1000){
                        @Override 
                        public void onTick (long leads ){ 
                            String greet = String.valueOf (leads/1000) ;
                        ((TextView)icons.get(3)).setText( greet )  ; 
                        remaining = remaining-1 ;     }  
                        @Override 
                        public void onFinish( ){  }    } ; 
                      timer.start() ; 
     */   
    public void attend(String causes,ViewGroup parent){
        TextView  created = Tools.dispatch(wrapper,causes) ; 
        created.setBackgroundColor(Color.argb(150,150,150,210)) ;  
        Tools.notify(parent.getClass().getName(),wrapper,900) ; 
         parent.addView(created) ; 
     //  wrapper.getMainExecutor.execute(()->{parent.addView(created) ; }) ;
    }
    public void startTimer(long crease ){
        timer = new CountDownTimer( crease*1000,1000){
                        @Override 
                        public void onTick (long leads ){ 
                            String greet = String.valueOf (leads/1000) ;
                        ((TextView)icons.get(3)).setText( buffers[0].concat( greet ))  ; 
                        remaining[0] = remaining[0]-1 ;     }  
                        @Override 
                        public void onFinish( ){ 
                            accepting = false ;   
                               setRates() ;
                            currentCount = 0 ;   
                            ((TextView)icons.get(7)).setText(new String("0") ) ; 
                         }    } ; 
                      timer.start() ; 
    }  
    // ViewGroup parent = (ViewGroup)layouts.get(5) ;   
                          //  attend(patterns,parent) ;   
        public void setRates(){
             String patterns =  ((TextView)icons.get(7)).getText().toString() ; 
              double equivs =  (double)currentCount/remaining[1] ;  
              String points =  Double.toString(equivs)   ;
                 String others = buffers[1].concat(points)   ;
             Tools.setContent(icons.get(8),others) ; 
        }
     public void interact( ) {
        icons.get(7).setOnClickListener( 
            new View.OnClickListener( ){ 
            @Override 
            public void onClick( View alias){
                if( accepting==true){
                    currentCount = currentCount+1 ;  
                    String created = String.valueOf(currentCount) ;     
                    ((TextView)(icons.get(7))).setText(created) ;   
                }else{ }
               } }
        ) ; 
        icons.get(6).setOnClickListener(
            new View.OnClickListener( ){
                @Override 
                public void onClick(View stated){
                    accepting = false ;
                    ((Chronometer)(icons.get(4))).stop () ; 
                    if( timer!=null ){  timer.cancel( ) ; }  
                }
            }
         ) ; 
        icons.get(5).setOnClickListener(
             new View.OnClickListener (){
                @Override 
                public void onClick(View greets ) { 
                    accepting = true ; 
                    ((Chronometer)(icons.get(4))).start() ;   
                 //   if( timer!=null){timer.cancel( ) ; }  
               //  remaining = (long)deriveBase( ) ;
                   startTimer(remaining[0])   ;  // }
                } 
             }  
         )  ; 
         icons.get(2).setOnClickListener(
            new View.OnClickListener( ){ 
                @Override 
                public void onClick (View  grace ){
                      remaining[1]  = deriveBase( ) ;  
                      if(remaining[1]==0){remaining[1]++ ; } 
                      remaining[0]  = remaining[1]  ; 
                      accepting = true ; 
                      startTimer(remaining[1])  ;  
                    }    
                }
            )  ;  
            icons.get(0).setOnClickListener( 
                new View.OnClickListener(){
                    @Override 
                    public void onClick(View  alias){
                        Intent intent = new Intent(wrapper,SelectActivity.class) ; 
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)  ;
                        startActivity(intent) ;  
                    }
                }
            ) ;
     }   
     /*
      *  new View.OnClickListener( ){
                        @override
                        public void onClick(View stated){
                            
                        }
      */
      // ViewGroup views =  (ViewGroup)requireViewById(groupId[])
    public void  placeIcons(){ 
        icons = new LinkedList<View>() ;
        for(int cf=0;cf<viewId.length;cf++){
            View temps  =  requireViewById(viewId[cf]) ; 
            icons.add(temps)  ;   }   
        layouts = new ArrayList<ViewGroup>( ) ;  
        for( int ky=0;ky<groupId.length;ky++){
            View views =  requireViewById(groupId[ky]) ; 
            layouts.add((ViewGroup)views) ;   }
    } 
    @Override 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;  
         setContentView(stateId) ;  
        wrapper = this.getApplicationContext() ; 
         accepting = false  ;  
         currentCount = 0 ; 
        placeIcons() ;    
        Toast toasty = new Toast(wrapper) ; 
      /*  toasty.setDuration(800) ;    
        toasty.setText (String.valueOf(icons.size( ))) ;  
        toasty.setMargin(9,9) ; 
     //   toasty.show( ) ;  
        toasty.setText(icons.get(3).getClass( ).getName()) ;  
        buffers[1] =  ((TextView)icons.get(8)).getText().toString( ) ;
        toasty.show (); */
        interact() ;  
        configureTimer(icons.get(4)) ; 
    }  
    //     configureTimer(icons.get(4)) ; 
}
