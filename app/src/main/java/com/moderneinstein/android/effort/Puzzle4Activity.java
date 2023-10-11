//package com.moderneinstein.android.arcade  ; 

//package com.moderneinstein.android.official  ;
package com.moderneinstein.android.effort  ;

import  android.os.Environment ; 
import android.util.AttributeSet ; 
import android.os.Handler ;  
import android.view.ViewGroup ; 
import android.widget.TextView ;
import android.widget.Button ;
import android.widget.LinearLayout ; 

import android.app.Activity ; 

import android.view.View ; 
import android.content.Intent ; 
import android.content.Context ; 
import android.os.Bundle ; 
import  android.os.Handler ;  
import android.widget.GridLayout ; 
import android.widget.Chronometer ; 

import java.util.Set ; 
import java.util.List ; 
import java.util.Queue ; 
import java.util.ArrayList ; 
import java.util.LinkedList  ; 
import java.util.concurrent.Executor ; 


//import android.os.Environment ; 

public class Puzzle4Activity extends Activity {

    public  static int pointId =  R.layout.activity_puzzle_4 ; 
    public static   int[] views = new int[]{R.id.puzzle_4_1_1_1_1_1,R.id.puzzle_4_1_1_1_1_2,R.id.puzzle_4_1_1_1_2_1, 
        R.id.puzzle_4_1_1_1_2_2,R.id.puzzle_4_1_1_1_3_1,R.id.puzzle_4_1_1_1_3_2,R.id.puzzle_4_1_1_1_3_3,R.id.puzzle_4_1_1_1_4_1,R.id.puzzle_4_1_1_1_4_2} ; 
    public static  int[] groups= new int[] {R.id.puzzle_4_1,R.id.puzzle_4_1_1,R.id.puzzle_4_1_1_1, 
        R.id.puzzle_4_1_1_1_1,R.id.puzzle_4_1_1_1_2,R.id.puzzle_4_1_1_1_3,R.id.puzzle_4_1_1_1_3_3,R.id.puzzle_4_1_1_1_4}  ; 
    public  ViewGroup[] array5  ;
    public  View[] array4 ; 
    public static Context shell ; 
    public  Puzzle4Controller controls ; 
    public  Integer counts ;  
    public static int special = 6 ;  
    public List<Integer> container  ;   
    public static long leads = 3500  ;
    public static long[] pauses = new long[]{3500,3000,2500,2000,1500} ; 
    public static double shift = 350 ; 
                 //   long leaps = System.nanoTime() ; 
              //  while(System.nanoTime( )-leaps<lapses){  }
              //  leaps = System.nanoTime() ;    
                  //    voltage.setText(current) ;   
                         // executor.execute (worker) ; 
    public void  display(TextView voltage,String current,long lapses){  
        Executor mains =  getMainExecutor() ; 
        String notes =  voltage.getText().toString( ); 
        Thread  worker = new Thread(){
            @Override 
            public void run(){ 
                voltage.setText(current) ;      
              }    }   ;  
        Thread restore = new Thread(){
            @Override 
            public void run(){
                voltage.setText(notes) ;
            }        }  ; 
        Thread  master = new Thread(){
            @Override 
            public void run(){  
                long nanos = System.nanoTime( ) ; 
                mains.execute(worker) ;  
                while(System.nanoTime()-nanos<lapses*(1000000)){ } 
            mains.execute(restore) ;     }       }  ;
        master.start() ;      }    
    /**   ExecutorFour executor = new ExecutorFour() ;
        // worker.start() ;  
          //    mains.execute(worker) ;   */
    public static List<Integer> deriveText (TextView voltage){
        String  numbers =  voltage.getText().toString() ;  
        List<Integer> linear =new  ArrayList<Integer>() ;   
        int width = numbers.length ( ) ;  
        for( int my=0 ;my<width;my++) {
            char checks =  numbers.charAt(my) ; 
            Integer equiv = Integer.parseInt(String.valueOf(checks)) ; 
            linear.add (equiv) ;    }  
        return  linear  ;
    }  
    public   void  actions ()   {
        List<Integer> serial = controls.perform(counts) ; 
          controls.setBuffer(1,serial)  ;
            String  threads = new String() ; 
            for( int vf=0;vf<serial.size();vf++){  
           String portion =  Integer.toString(serial.get(vf)) ; 
              threads= threads.concat(portion) ;   } 
              long  needs = (long) (leads+shift*serial.size())   ;
            display((TextView)array4[4],threads,needs) ;
    }   
    public void checks(boolean cover){ 
        if(cover==true){setCount(counts+1 ) ;  
            String  patterns = shell.getResources().getString(R.string.puzzle_3_correct_string ) ;
            display ((TextView)array4[0],patterns,pauses[2]) ; }    
            else{setCount(Integer.valueOf(1)) ;  
                String patterns = shell.getResources().getString(R.string.puzzle_3_incorrect_warning ) ;
            display((TextView)array4[0],patterns,pauses[2]) ; }    
    }  // }
    // getResou.getString( 
      //R.string.puzzle_3_incorrect_warning) ;  
      // R.getString
      //(R.string.puzzle_3_correct_string)  
    //Intent.FLAG_ACTIVITY_CLEAR_TASK ; 
    public void attach(Activity active ){  
        array4[2].setOnClickListener(
            new  View.OnClickListener(){
                @Override 
                public void onClick(View greats){
                    Intent intention = new Intent(active,SelectActivity.class) ;  
                    Intent  reverse = active.getParentActivityIntent ()  ;    
                     intention.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) ;  
                 //   startActivity(reverse) ;    
                    startActivity(intention)  ;
                }
            }
        ) ;  
           //List<Integer> vectors = deriveText((TextView)array4[4]) ;  
             // array4[3].performLongClick () ;     //controls.validate(vectors) ;  
        array4[3].setOnLongClickListener( 
            new View.OnLongClickListener ( ){
                @Override    
                public boolean  onLongClick(View agree){
                   actions( ) ;      
                    return true  ;  }    }   ) ;  
        array4[7].setOnLongClickListener( 
            new View.OnLongClickListener( ) {
                @Override
                public boolean onLongClick(View visible){  
                    boolean cover =   controls.incase()  ;   
                    checks( cover);  
                      controls.resetBuffer( ) ;   
           return cover ;   }   }  ) ; 
                array4[8].setOnClickListener( 
                    new View.OnClickListener() {
                        @Override 
                        public void onClick(View created){
                            controls.resetBuffer() ;   
                        }
                    }
                ) ;  }  
    public  void setCount(Integer venue) {
         this.counts = venue ; 
        TextView noted = (TextView)array4[1] ; 
        String strides = new String("Score : ") + String.valueOf (venue) ; 
        noted.setText (strides) ; 
    }
    public void search( ){
        int width =  groups.length ;  
        array5 = new ViewGroup[width] ; 
        for( int bh=0;bh<width;bh++){
            ViewGroup phase = (ViewGroup)(findViewById(groups[bh])) ; 
            array5[bh] = phase ;     } 
        width =  views.length ;
         array4 = new View[width ] ; 
        for(int fr=0 ;fr<width;fr++){
            View diverse =  (View)(requireViewById(views[fr])) ; 
            array4[fr]  =   diverse ;     } 
    } 
    public  void initiate() { 
           controls.placeExtra ((View)array4[5]) ;    
            controls.initialiseGrid() ;   
         //   counts = 0 ; 
    }  
    public void adjustTimer (){ 
        View relays = requireViewById(R.id.puzzle_4_chronometer) ;
        Chronometer  chromes =  (Chronometer)(relays) ; 
        chromes.setBase(15) ; 
        chromes.setCountDown(false) ;
        chromes.setFormat("%s") ;
        chromes.setOnChronometerTickListener(
            new Chronometer.OnChronometerTickListener(){
                @Override 
                public void onChronometerTick(Chronometer chronos){

                }
            }
        ) ; 
        Thread threaded = new Thread( ){
            @Override 
            public void run( ){ 
                long begin = System.currentTimeMillis( ) ;
                chromes.start( ) ;
                while(System.currentTimeMillis( )-begin<1500) {} 
                chromes.stop( ) ;
            }
        }  ;
         threaded.start( ) ;
        // chromes.start() ;
     } 
     public void recents()  {
           array4[7].setOnClickListener( 
            new View.OnClickListener( ){ 
                @Override
                public void onClick(View stated){
                    boolean cover =   controls.incase()  ;   
                    checks( cover);  
                      controls.resetBuffer( ) ;   
                }
            }
           ) ; 
        array4[3].setOnClickListener( 
            new View.OnClickListener(){
                @Override
                public void onClick(View sides){
                 //   sides.performLongClick() ;   
                 actions( ) ;     
                }
            }
        ) ;
     }
     @Override 
    public void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;  
        setContentView(pointId) ; 
        shell = this.getApplicationContext() ;  
        counts =  Integer.valueOf(1)  ; 
   //   controls = new Puzzle4Controller(array5[0]) ;  
     search () ;  
       attach(this) ;  
       controls = new Puzzle4Controller(array5[special]) ;  
     //   search() ; 
         initiate( ) ;  
        adjustTimer( ) ;   
        recents()  ; 
     }
}
