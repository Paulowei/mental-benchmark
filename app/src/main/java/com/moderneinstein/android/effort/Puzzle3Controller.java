//package com.moderneinstein.android.official  ;
//package com.moderneinstein.android.arcade ;   
package com.moderneinstein.android.effort  ;
import android.widget.Button ;
import android.widget.TextView ;
import android.view.LayoutInflater ; 
import android.widget.GridLayout ;
import android.widget.RelativeLayout ;
import android.app.Service ;
import android.content.Context ;
import android.content.Intent ;

import androidx.fragment.app.FragmentManager ;
import androidx.fragment.app.FragmentTransaction ;
import androidx.fragment.app.Fragment ;
import android.app.Activity ;
import android.view.ViewGroup ;
import android.view.View ;
import android.view.Gravity ; 

import android.graphics.drawable.Drawable ;
import android.graphics.drawable.ColorDrawable  ; 
import android.graphics.Color ;

import java.io.Serializable ; 
import java.util.Set  ; 
import java.util.Arrays  ; 
import java.lang.reflect.Array ; 
import java.util.LinkedList  ;

import  java.lang.Thread ;
import java.util.Vector ; 
import java.util.Map ; 
import java.util.HashMap ;
import java.util.List ; 

/**
 *     public View[] extras ;
        public int[]  identity ; 
        //         public Thread[][] workers ;
 */
// import java.util.MissingFormatWidthException ; 
// import  java.util.MissingFormatArgumentException ; 
//  extends Thread implements Serializable
// extends Thread implements Serializable  
//    //  public Map<View,Integer> classes ; 
public class Puzzle3Controller   {

        public Activity parent ;
        public  ViewGroup layout ;
        public GridLayout centre ; 
        public View[][] nested ;
        public static int  height = 3 ; 
        public static int width = 3  ;
        public View[] extras ;
        public int[]  identity ; 
        public int  oriented =  GridLayout.VERTICAL ; 
        public static Vector<Integer> select ; 
        public static Vector<Integer> braces ; 
        public static long  DURATION  =  1250 ; 
        public static long  OFFSET =  175 ; 
        public CustomThread5  trials ; 
        public static int[] colors =  {Color.argb(100,200,200,200),Color.argb(80,100,100,200) } ; 
        public static long[] states =  {4L,5L} ;
        public static  long situation ; 
        public int points ; 
        public List<View> excess  ; 
     /*   public Puzzle3Controller(ViewGroup accept){
                layout = (ViewGroup)accept.getParent() ; 
                centre = (GridLayout)accept ;
                parent =   (Activity)accept.getContext() ;
                selected = new Vector<Integer>() ;
        }     */
        public Puzzle3Controller(ViewGroup  desks){
            layout =(ViewGroup) desks.getParent() ;
            centre  = (GridLayout)desks ;
            parent = (Activity)desks.getContext()   ; 
            select = new Vector<Integer>() ;  
          //  classes = new HashMap<View,Integer>() ; 
            identity = new int[]{desks.getId(),centre.getId()} ;
            extras = new  View[]{desks,centre} ;
            StreamSource.configure() ; 
            braces  =  new Vector<Integer>() ; 
            situation =states[0] ; 
            points = 0 ;
         //   trials = new  CustomThread5(desks,CustomThread5.DEFAULT_PAUSE)  ; 
             excess = new LinkedList<View>( ) ;
        }
        public  Puzzle3Controller(ViewGroup income,int[] buffer){
            centre=  (GridLayout)income ; 
            layout =  (ViewGroup)income.getParent() ;
             parent=  (Activity)income.getContext() ;  
             identity = buffer ;   
            bindViews(identity) ;
            select = new Vector<Integer>() ; 
            // classes =  new HashMap<View,Integer>() ; 
            StreamSource.configure() ;
            braces = new Vector<Integer>( )  ; 
            situation = states[0] ;
            points = 0 ;  
         //   trials =  new CustomThread5(income,DURATION) ;   
            excess = new LinkedList<View>() ;  
        }
        public void initPuzzle(){       
            centre.setColumnCount( width) ;  
            centre.setRowCount(height) ;   
            centre.setOrientation(oriented) ;   
            centre.setRowOrderPreserved(true) ;   
           centre.setColumnOrderPreserved(true) ;    
            configurePuzzle( )  ;   
            setListener( )  ;  
            centre.setClipChildren(true)  ;   
            centre.setClipToPadding(true) ;
            centre.setAlignmentMode (GridLayout.ALIGN_BOUNDS) ;
            centre.requestLayout() ;
           // runnable() ; 
            //  append() ; 
        }    
        /*
         *    int[]  yield =  new int[4] ;
             //  Frames.createSingle(0  , reach, spans) ;
         */
             //  String  sails  =String.valueOf(verse.size()) ;
            //((TextView)centre.getChildAt(3)).setText(sails) ; 
           // long states = System.currentTimeMillis() ; 
        public void setListener(){
            centre.setOnHierarchyChangeListener(
                new  ViewGroup.OnHierarchyChangeListener(){
                    @Override 
                    public void onChildViewAdded  (View master,View servant)  {  }
                    @Override 
                    public void  onChildViewRemoved  (View parent,View child){ }
                }
             ) ;
        }
        public void  resolve(int spans){
            int reach =  width*height ;
            int spread = braces.size() ; 
            if(points%states.length==1){
            List<Integer> verse = StreamSource.allocateValues(0,reach,spans) ;
            braces =  new Vector<Integer>(verse)  ;
            }
            if(points%states.length==0){
                while(braces.size()>=spans){
                    braces.remove(braces.size()-1) ;     }
                List<Integer> fresh = StreamSource.allocateValues(0,reach,1) ;  
                braces.add(fresh.get(0)) ; 
            }
        }
        // situation== states[0]  
        // situation == states[1]
        public void toggleState(){
            points =points+1 ; 
            points = points%states.length  ;
            situation = states[points] ; 
        }
        // select.clear() ;
        public void  perform(int  spans ){
            int reach =  width*height ;
          resolve(spans) ;   
           clearBuffer() ; 
             new Thread(){
               @Override
                public void run(){
            for( int fs=0;fs<spans;fs++){
                int current=  braces.get(fs) ;
                View allow = nested[current/width][current%width] ;
                highlight(allow,DURATION) ;
                long states = System.currentTimeMillis() ; 
                while(System.currentTimeMillis()- states<DURATION+OFFSET) {} 
            }
        }   }.start() ;
        //   states = System.currentTimeMillis() ; 
        }
        /*
         *      int yPos = current/width ;
              int xPos = current%width ;
         */
        public boolean validate(){
            boolean  cases = true ; 
            if(braces.size( )==0){cases =  false ; }
            if(braces.equals(select)){cases = true ;}
            if(!select.equals(braces)){cases = false ;}
            return cases  ;
        }
           //(ColorDrawable)viewed.getBackground( ) ;
           /*
                int useful = colors[1] ;
           ColorDrawable drawn  =  new ColorDrawable(colors[0]) ;
             int known =  drawn.getColor() ; 
            */
        public void clearBuffer(){
            select.clear() ; 
          //   braces.clear() ;  
          String clean = new String ( ) ;
          if(excess.size()>0){ 
            View  recents = excess.get(0) ;   
            setText(recents,clean)  ;
          }
        }
        public void highlight (View viewed,long spans){
            long temps =  System.currentTimeMillis() ;
           CustomThread5 current = new CustomThread5(viewed, spans) ; 
           current.activate()  ;  
           current.start() ; 
       Thread great = new Thread(){
            @Override
            public void run(){ 
           viewed.setBackgroundColor(colors[1]) ; 
            while(System.currentTimeMillis()-temps<spans){  }
            viewed.setBackgroundColor(colors[0]) ; 
            }
        }    ;
       //  great.start() ;
    }
          // }
    //   }  .start() ; 
     // Todo : Reset
     // BackGround color ;  
         //     try{
     //   Handler  kinectic =  viewed.getHandler() ; 
      //  kinectic.post(current)  ;
         //   current.join() ; 
     //   }catch(InterruptedException arch)
    //  {arch.printStackTrace() ; } 
       //  }
         //   new Thread(){
         //       @Override 
           //     public void run(){
            // Set BackGround Color ; 


     /*     public void  runnable(){
       //     workers  =  new   Thread[height][width] ; 
             for( int fd=height-1;fd>=0;fd--){
                for( int cs=width-1 ;cs>=0;cs--){
                    View current =  nested[fd][cs] ; 
                //    workers[fd][cs] =  new CustomThread5(current,DURATION) ; 
                //    workers[fd][cs].start() ; 
                //    workers[fd][cs].join() ; 
                     new Thread(){
                        @Override
                        public void run(){
                            highlight(current,DURATION ) ;
                         //   selected.addElement(fd*height+cs+1) ;  
                        }
                    }   ;  
                }
             }
          //   String  verse = new int[]{} ; 
        }  */  
        public void  consider(View integral){
              this.excess.add(integral)  ;
        }
        public void bindViews(int linear[]){
            int range = linear.length ; 
            for(int fs=0;fs<range;fs++){
                int data = linear[fs] ; 
                View parts =  (View)layout.findViewById(data)  ;
                extras[fs] = parts ; 
            }
        }
        //    int value = trials.getPriority() ;
            ////    trials.start() ; 
              //   trials.interrupt() ; 
            //   ((Puzzle3Activity)parent).execute(stated,DURATION) ;
             // trials =  (CustomThread5) workers[dc][sc] ; 
      // (CustomThread5)
        //  reach.setPadding(2,2,2,2)  ;   
        public void appendText(View member,String point){
             TextView converted = (TextView)member   ;
             String crease = converted.getText().toString() ; 
             crease = crease.concat ( point) ;
            converted.setText(crease) ; 
        }  
        public void setText(View portion,String queries) {
            TextView voltage = (TextView)portion ; 
            String liable =  voltage.getText().toString( ) ;
            String recents = new String( queries) ; 
             voltage.setText(recents) ;
        }  
        public View createText(int fc,int sf){
            Button current = new Button(parent) ;
             current.setText(String.valueOf(sf*width+fc+1 )) ; 
             current.setLayoutParams(parameters(sf,fc) ) ;  
             current.setMaxWidth(40) ; 
            current.setMaxHeight(40 ) ; 
        //    current.setPadding( ) ;  
        return current ; 
        }
        public void  append (){
            for( int  sc=width-1 ;sc>=0 ;sc--){
            for( int  dc =height-1;dc>=0;dc--){
                    View reach = nested[dc][sc] ;
                    int value = sc+dc*width ;
             //       classes.put(reach,value)  ;
                    reach.setOnClickListener(
                        new View.OnClickListener(){
                            @Override 
                            public  void  onClick(View stated){
                                 highlight(reach,DURATION) ;
                               select.addElement(value)  ; 
                                if(excess.size( )>0){ appendText( excess.get(0),((TextView)reach).getText().toString()) ; }
                            }   }  ) ; 
                       //     reach.performClick( ) ; 
                }     // excess.get(0).add()  ;
            }
        }    
        public void  present(View reach,int postX,int postY){ 
             int value =  postY*width+postX ;
               reach.setOnClickListener(
                        new View.OnClickListener(){
                            @Override 
                            public  void  onClick(View stated){
                                 highlight(reach,DURATION) ;
                               select.addElement(value)  ; 
                                if(excess.size( )>0){ appendText( excess.get(0),((TextView)reach).getText().toString()) ; }
                            }   }  ) ; 
        }
          //  workers[fd][cs].start() ; 
                         //  boolean known =  workers[fd][cs].isInterrupted() ; 
                       //      workers[fd][cs].interrupt( ) ; 
                    //   int value = workers[fd][cs].getPriority() ;
                  //  String alias =  trials.getName() ; 
                  //  trials.start () ;   
                 //   trials.interrupt() ;
                  //       trials.highlight(DURATION) ;
                   //highlight(reach,DURATION) ; 

                    //   Thread verse = new CustomThread5(reach,CustomThread5.DEFAULT_PAUSE) ;
                           //     try{
                           //     verse.start() ; 
                              //  verse.join() ;
                           //  }
                            //    catch(InterruptedException except){except.printStackTrace() ; }
                        //    new Thread(){
                         //       @Override
                          //      public void run( ){
                          //      }
                          //  }.start()  ;
        public GridLayout.LayoutParams parameters(int posX,int posY){
            GridLayout.Spec specY = GridLayout.spec(posY,1) ;
            GridLayout.Spec specX =  GridLayout.spec(posX,1) ; 
            GridLayout.LayoutParams params 
            = new GridLayout.LayoutParams(specX,specY) ; 
        //    params.setGravity(Gravity.CENTER ) ;
            params.setMargins(2,2,2,2) ;
              params.setGravity(Gravity.LEFT) ;
            return params ;
        }  
        /**
         *  Button current = new Button(parent) ;
                    current.setText(String.valueOf(sf*width+fc+1 )) ; 
                    current.setLayoutParams(parameters(sf,fc) ) ;
         */
        public void configurePuzzle(){
            nested = new View[height][width] ; 
            for(int fc=0;fc<width;fc++){
                for(int  sf=0;sf<height;sf++){
                    Button  current = (Button)createText(fc,sf) ;
                    centre.addView(current) ;
                    nested[sf][fc] = (View)current ;
                   ((Puzzle3Activity)parent).bundles[sf][fc] = (View)(current)   ; 
                   present(current,fc,sf) ; 
                }
            }
        }
        /**    current.setWidth(10) ; 
                    current.setHeight(10) ; */
        /*
         * current.setWidth((int)centre.getWidth()/width) ; 
                    current.setHeight((int)centre.getHeight()/ height) ;
         */
        //     int mount =  sf*width+fc+1   ;
        //    GridLayout.LayoutParams params =  
        // current.co
        /**
         *   public Button noted ; 
        public Button check  ; 
        public TextView  present ; 
         */
}
