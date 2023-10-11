
//package com.moderneinstein.android.official  ;
//package com.moderneinstein.android.arcade ;   
package com.moderneinstein.android.effort  ;
import android.content.Intent ; 
import android.content.Context ;
import android.app.Service ;
import android.app.Activity ; 
//import android.util.Toast ; 
import android.content.res.Resources ;

import android.widget.Button ; 
import android.widget.TextView ;
import android.widget.EditText ;
import android.widget.GridLayout ;
import android.view.Gravity ; 
import android.widget.Switch  ; 

import java.util.List ; 
import java.util.ArrayList  ; 
import java.util.Vector  ; 
import java.util.Map ; 
import java.util.HashMap ;
import java.util.Random ; 
import java.util.concurrent.ThreadFactory ; 
import java.util.concurrent.Executor ; 

import androidx.fragment.app.FragmentTransaction ; 
import androidx.fragment.app.FragmentManager ; 
import androidx.fragment.app.Fragment ; 
import androidx.fragment.app.FragmentActivity ; 

import  android.view.View  ;
import android.os.Bundle ; 
import android.view.ViewGroup ; 
import android.graphics.Color ; 
import android.os.Handler ; 
import android.os.Looper ; 

   // public Fragment fragment ; 
  // public Fragment[] fragments ; 
  //     public Thread[ ][] actions ; 
public class Puzzle3Activity extends FragmentActivity{

    public int[]   vesselId =  {R.id.puzzle_3_1,R.id.puzzle_3_1_1,R.id.puzzle_3_1_1_1,R.id.puzzle_3_1_1_1_1,
               R.id.puzzle_3_1_1_1_2,R.id.puzzle_3_1_1_1_3,R.id.puzzle_3_1_1_1_3_1,R.id.puzzle_3_1_1_1_4,R.id.puzzle_3_1_1_1_5,R.id.puzzle_3_1_1_1_6}   ; 
    public int[]  itemId  =  {R.id.puzzle_3_1_1_1_1_1,R.id.puzzle_3_1_1_1_1_2,R.id.puzzle_3_1_1_1_2_1,R.id.puzzle_3_1_1_1_2_2
        ,R.id.puzzle_3_1_1_1_4_1,R.id.puzzle_3_1_1_1_4_2,R.id.puzzle_3_1_1_1_5_1,R.id.puzzle_3_1_1_1_3_1,R.id.puzzle_3_1_1_1_6_1}  ; 
    public List<ViewGroup> collect  ; 
    public List<View>  icons ; 
    public int[] stateId =  {}  ;
    public  Context  source  ; 
    public Puzzle3Controller  handler  ; 
    public int stage ; 
    public  View[][] bundles ; 
    public static int  displayId = R.layout.activity_puzzle_3 ; 
    public static long  ERROR_DURATION = 950 ; 
    public static long CORRECT_DURATION = 950 ; 
    public int height = 3 ; 
    public int width =  3 ; 
    public long verse ;
    public static long sieve = 100000 ; 
    public boolean verify  ; 
    public int bases = 1 ; 
  //  public int points ; 
    @Override 
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState) ; 
        setContentView(displayId) ;
        source =  this.getApplicationContext() ; 
        stateViews() ;
      //  associate() ;
     //  classes = new HashMap<View,Integer>() ; 
        initialise() ;  
         listenersB() ; 
         listenersC(); 
     //   points = 0 ; 
       // configurePuzzle() ;
     //   append() ; 
      //  testing() ;   
       // handler.perform(5) ; 
    }
    public void testing( ){
        for(int fd=handler.width;fd>=1;fd--){
            for(int cs= handler.height;cs>=1;cs--){
                View current = this.bundles[fd-1][cs-1] ; 
                if(current==null){continue ;}
            //  execute(current,Puzzle3Controller.DURATION)  ; 
       //  handler.highlight(current,CustomThread5.DEFAULT_PAUSE) ; 
            //  handler.workers[fd][cs].start() ;
         //  current.performClick() ; 
            }
        }
    }
    public void stateViews(){   
        int check =  vesselId.length  ; 
        collect = new Vector<ViewGroup>() ; 
        for(int ds=0 ;ds<check;ds++){
            int data =   vesselId[ds] ;
            ViewGroup parts =  requireViewById(data) ;
            collect.add(parts) ;      }
        int crest  = itemId.length ; 
        icons =  new ArrayList<View>() ; 
        for(int cd=0;cd<crest;cd++){
            int noted =  itemId[cd] ;
            View reach =  requireViewById(noted) ;
            icons.add(reach) ;      }   
    }
    public boolean judge(){
            boolean active = handler.validate() ;  
            return true ;       
    }
    public void setScore(int data){
        View branch =  icons.get(1) ;
        TextView change =(TextView)branch ; 
        int apply = R.string.score_text_3 ; 
        String names = source.getResources().getString(apply) ;    
        String verses= names.concat(Integer.toString(data)) ;    
        change.setText(verses) ;
    }
    public void initialise(){
     //   handler = fragments[0].controller ; 
    // handler = new Puzzle3Controller() ;
    bundles = new View[height][width] ; 
        ViewGroup above = collect.get(6) ; 
         handler = new Puzzle3Controller(above) ;
        stage = bases ;
        handler.consider(icons.get(8)) ; 
         verify = true  ;
        setScore(stage) ;  
        handler.initPuzzle() ; 
    } 
    public void incrementStage(){
        int higher = stage+bases  ; 
        stage = higher ;
    }
    public boolean validate(){
         // //
        boolean given =  handler.validate() ;  
        int point = bases ;
        Resources access = source.getResources( ) ; 
         if(!given){
            String  names = access.getString(R.string.puzzle_3_incorrect_warning)  ;
            correct(ERROR_DURATION,bases-bases,names )  ;
            return false ;    }
         if(given){
            String great = access.getString(R.string.puzzle_3_correct_string) ;
            correct(CORRECT_DURATION,bases-bases,great)   ; 
            return true   ;  }
         return true     ;     }
    /*
     *     if(given){
         return true  ;
         }
     */
    public void correct(long spans,int index ,String assign){
        long current= System.currentTimeMillis() ; 
        TextView shows =(TextView) icons.get(index);
        CharSequence kept = shows.getText()  ;
        String known =  source.getResources().getString(R.string.neutral_string_4)  ;
        new Thread() {
            @Override 
            public void run( ){
            //    shows.setVisibility(View.VISIBLE) ;
            shows.setText(assign) ; 
            while(System.currentTimeMillis()-current<spans){}
            shows.setText(known) ; 
              //  current = System.currentTimeMillis() ;
             //   shows.setVisibility(View.INVISIBLE) ;
            }
        }.start()    ;
    }
    //   verify = false ; 
    public void listenersB(){
        icons.get(6).setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View holder){
                    Switch toggle =  (Switch)holder ; 
                    String current =  toggle.getText().toString() ;    
                    if(current.equals(toggle.getTextOff()))
                    {handler.situation = handler.states[0] ; }
                    if(current.equals(toggle.getTextOn()))
                    {handler.situation = handler.states[1] ; }
                    handler.toggleState() ; 
                }
            }
        ) ; 
        icons.get(5).setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick( View created){
                    handler.clearBuffer() ;
                }
            }
        ) ;
        icons.get(4).setOnClickListener(
            new View.OnClickListener(){
            @Override 
            public void onClick(View alias){
               verify  =   validate() ;  
               if(verify==true ){
                incrementStage() ; }else{
                stage =   bases ;       }
                setScore(stage) ;
            handler.clearBuffer()  ; 
            }
            }
          ) ;
    }
    public void listenersC(){
        icons.get(2).setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View verify){
                    Intent trans = new Intent() ; 
                    trans.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) ;
                    trans.setClass(source,SelectActivity.class) ; 
                    startActivity(trans) ; 
                }
            } 
         )  ; 
        /* ((Button)icons.get(3)).setOnClickListener(
            new View.OnClickListener(){ 
                @Override 
                public void onClick(View states){ 
                    handler.perform(stage) ; 
                    if(verify ==true){
                     }
                }
            }
        ) ;  */
    }
    public GridLayout.LayoutParams parameters(int posX,int posY){
        GridLayout.Spec specY = GridLayout.spec(posY,1) ;
        GridLayout.Spec specX =  GridLayout.spec(posX,1) ; 
        GridLayout.LayoutParams params 
        = new GridLayout.LayoutParams(specX,specY) ; 
        params.setGravity(Gravity.CENTER) ;
        return params ;
    }
   /*  public void configurePuzzle(){
          bundles = new View[height][width] ; 
        for(int fc=0;fc<width;fc++){
            for(int  sf=0;sf<height;sf++){
                Button current = new Button(this) ;
                int mount =  sf*width+fc+1 ;
                current.setText(String.valueOf(mount)) ;
                current.setLayoutParams( parameters(sf,fc)  ) ;
                 collect.get(6).addView(current) ;
                 current.setId((int)(sieve++)) ;
               bundles[sf][fc] = (View)(current)   ;
            }
        }
    }  */
    //      classes.put(current,fc*width+sf) ;
                //   ((TextView)icons.get(0)).setText(brace.getId( )) ;
                           // try{
                       //     stated.requestLayout() ; 
                    //   while(System.currentTimeMillis()-verse<400){} 
                    //   (int)sieve-2   stated.getId()
                 //      Handler handle =  stated.getHandler() ; 
                //       CustomThread5 custom = new CustomThread5(stated) ;
                  //     brace.setEnabled(true) ; 
                   //    stated.setFocusable(View.FOCUSABLE) ; 
                   //  ((TextView)stated).setText("R") ;  
                  // collect.get(6).setBackgroundColor(Color.argb(80,200,100,100)) ; 
                  //  stated.setBackgroundColor(Color.argb(80,200,100,100)) ;
                   //  while(System.currentTimeMillis()-verse<1200){} 
                   // ((Button)stated).setText("C") ;
                       // handle.post(custom)  ;
                        //    verse =  System.currentTimeMillis();
                           //     while(System.currentTimeMillis()-verse<1200){} 
                           // this.sleep(1200) ;
                  //       stated.setBackgroundColor(Color.argb(60,150,150,150)) ;
                          // collect.get(6).setBackgroundColor(Color.argb(60,150,150,150)) ;
                       //    collect.get(6).setBackgroundColor(Color.argb(60,150,150,150)) ;
                           //    stated.setBackgroundColor(Color.argb(60,150,150,150)) ;
                         //   stated.setBackgroundColor(Color.argb(80,200,100,100)) ; 
                          //  }catch(InterruptedException brace)
                            //{String given = brace.getMessage() ; }
                               // selected.addElement(fd*height+cs+1) ;  
    //    GridLayout.LayoutParams params =  
             // nested[sf][fc] = (View)current ;
         //((Puzzle3Activity)parent).
            //   centre.addView(current) ;
}
/**
 *   //     ViewGroup.LayoutParams params =  reach.getLayoutParams( ) ; 
//    handler.selected.addElement(value)  ; 
  //      verse = System.currentTimeMillis() ;
 * 
 * 
 */
    //     ( (TextView)reach).setText(String.valueOf(vases)) ; 
                             //   execute(reach,CustomThread5.DEFAULT_PAUSE) ; 
                         //   View frail =   collect.get(6).getChildAt(value) ; 
                         //   int notes =  Color.argb(70,200,200,140) ;
                         //   frail.setBackgroundColor(notes) ;   // 100,
                                              // holder.post(  
                       // runOnUiThread(   
                        //    new Thread(){   
                           //     @Override public void run(){   
                                            /*   new Thread(){
                                @Override 
                                public void run(){
                           tests.start() ;}
                            }.run () ;   */
                            //    highlight(current,DURATION ) ;
                      //      ViewGroup.LayoutParams mason =  stated.getLayoutParams( ) ; 
                       //    View brace = collect.get(6).requireViewById(reach.getId()) ; 
                         //   execute(reach,CustomThread5.DEFAULT_PAUSE) ; 
                         //   }
                     // ..  }.start()   ;  
                     //   stated.setBackgroundColor(Color.argb(60,100,200,200)) ; 
                                               //   }
                          //  }.run() ; // )  ;
                                            //  service.execute(tests);
                     //      tests.start() ;  
                           // above.post(tests) ; 
                        //   lanes.activate() ; 
                         /**   View leads = checks ; 
                            int given = vr ;  */
                            /**
    *     int dc = 0 ; 
        int sc = 0 ; 
        int vr= 0 ;
        View checks = new View( source) ;
                             */
    /*public void  append ()  {
    //    actions = new Thread[height][width] ;
        for( int dc =height-1;dc>=0;dc--){
            for( int sc=width-1 ;sc>=0 ;sc--){
                View reach = this.bundles[dc][sc] ;
                int value = dc+sc*width ;   
            //   actions[dc][sc]  =  new CustomThread5(reach) ;
               // actions[dc][sc].start()   ; 
         //       CustomThread5 lanes = (CustomThread5)actions[dc][sc]  ;
              // classes.put(reach,value) ; 
                reach.setOnClickListener(
                    new View.OnClickListener(){
                        @Override 
                        public  void  onClick(View stated){




                         Thread tests =    new Thread(){
                            @Override
                            public void run(){
                             //   Random random = new Random() ;
                             int vases = (stage++)%(width*height) ;
                             Handler holder = stated.getHandler( ) ; 
                         int mused = Color.rgb(240,120,140) ;
                         long spread = System.currentTimeMillis() ; 
                   //     int  index = classes.get(stated) ;
                          stated.setBackgroundColor(mused) ;
                         while(System.currentTimeMillis()-spread<1000){ }
                       stated.setBackgroundColor(Color.argb(100,150,150,150)) ;
                            } }; 
                            // ollect.get(6).getChildAt(value)
                            Handler  above = reach.getHandler() ;
                            ExecutorFour service = new ExecutorFour() ; 
                           CustomThread5 frames = new CustomThread5(reach) ; 
                           frames.start()  ;
                        }   }  ) ; 
                  reach.performClick() ; 
            }
        }
    }   */
    /**
     *    while(System.currentTimeMillis()-verse<400){} 
                            stated.setBackgroundColor(Color.argb(80,200,100,100)) ; 
                            verse =  System.currentTimeMillis();
                                while(System.currentTimeMillis()-verse<1200){} 
                           // this.sleep(1200) ;
                               stated.setBackgroundColor(Color.argb(60,150,150,150)) ;
    // * @param delegate
    // * @param times
     */
        // (CustomThread5)
      //    int value = trials.getPriority() ;
                       ////    trials.start() ; 
                        //   trials.interrupt() ;
          // trials =  (CustomThread5) workers[dc][sc] ; 
  /*   public void execute(View delegate,long times){
        Integer  brace =  classes.get(delegate) ; 
        if(brace==null){return ;}  
       Integer stateX =  brace%width ; 
        Integer stateY  = brace/width ;
     Random rand =  new Random(System.currentTimeMillis())  ;
    // int postY = rand.nextInt()%height ; 
    // int postX =  rand.nextInt()%width ; 
     int  postX = 2 ;          
      int  postY = 2 ;          
        CustomThread5 custom =  new CustomThread5(delegate,times) ;
        //(CustomThread5) actions[stateY][stateX]  ;
       // int aligns = custom.getPriority()  ;
       // ((TextView)delegate).setText(Integer.toString(aligns)) ; 
  //      custom.activate() ; 
      //  custom.highlight(times) ; 
          custom.start( )  ;
    //  Handler  kinectic =  delegate.getHandler() ; 
    //  kinectic.post(custom)  ;
          // new CustomThread5(delegate,times) ; 
          // custom.restart() ; 
        //    this.handler.highlight(delegate,times) ; 
    }  */
          // highlight(current,duration) ;
                            //  ((Puzzle3Activity)parent)
                     //    execute(stated,Puzzle3Controller.DURATION) ;  
                       /*  public  void  associate() {
        int  verse = stateId.length  ; 
        fragments = new Fragment[verse] ; 
        FragmentManager moderator = this.getFragmentManager() ; 
        for(int fd=verse-1; fd>=0;fd--){
             int rates = stateId[fd] ; 
            Fragment portion = moderator.findFragmentById(rates) ;
            fragments[fd] = portion ;
        }
    }  */