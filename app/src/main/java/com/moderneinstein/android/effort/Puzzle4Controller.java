//package  com.moderneinstein.android.arcade  ;
//package com.moderneinstein.android.official  ;
package com.moderneinstein.android.effort  ;
import  java .util.Arrays ;     
import java.util.Vector ;  
import java.util.Set ;   
import java.util.Objects ;   
import java.util.TreeSet ;    

import android.widget.FrameLayout ; 
import android.widget.GridLayout ;
import android.widget.Button ; 
import android.widget.EditText ; 
import android.app.Activity ; 


import android.widget .TextView ; 
import android.view.View ; 
import android.view.ViewGroup ; 
import  android.view.Gravity ; 

import  java.util.List ; 
import java.util.LinkedList ; 
import  java.util.ArrayList ; 


public class Puzzle4Controller {
    
    public GridLayout squares ; 
    public Activity starter ;
    public ViewGroup parent ; 
    public View[][]  items ; 
    public List<Integer> buffers[ ] ;  
    public static int depth  = 3 ;  
    public static int  breadth = 3 ;   
    public static Integer[] forms =  new Integer[]{GridLayout.VERTICAL ,GridLayout.HORIZONTAL} ; 
    public  static int[] margins = new int[]{4,4,4,4}  ; 
    public static List<View> extras ; 
    public  Puzzle4Controller(ViewGroup allowed){
       squares = (GridLayout)allowed ; 
        starter = (Activity) allowed .getContext() ;
        parent =  (ViewGroup)allowed.getParent(); 
         buffers = new  List[2] ;  
        buffers[1] = new LinkedList<Integer>( ) ; 
        buffers[0] =new  ArrayList<Integer> ( ) ;  
        items = new  View[depth][breadth] ; 
        this.extras = new ArrayList<View>()  ;
    }   
     
    public void initialiseGrid(){ 
         squares.setRowOrderPreserved(true) ; 
         squares.setColumnOrderPreserved (true) ; 
         squares.setColumnCount(breadth) ;
        squares.setRowCount(depth) ; 
        squares.setOrientation(forms[0])  ;
        configureGrid () ; 
        squares.setClipToPadding( true) ;
        squares.setClipChildren(true ) ; 
        squares.setAlignmentMode(GridLayout.ALIGN_BOUNDS) ;   
        squares.requestLayout(); 
    }  
    // ViewGroup.MarginLayoutParams
    public ViewGroup.LayoutParams parameters(int postX,int postY){ 
        GridLayout.Spec spec4 =  GridLayout.spec(postX,1) ;
        GridLayout.Spec spec5 = GridLayout.spec(postY,1) ;
        GridLayout.LayoutParams voltage 
        = new   GridLayout.LayoutParams (spec4,spec5) ;   
        voltage.setGravity(android.view.Gravity.CENTER) ;  
        voltage.setMargins(margins[3],margins[2],margins[1],margins[0]) ;
        return voltage ;
    }     
    // GridLayout.CENTER
    public View createView(int stateX,int stateY) {
        Button  verse =  new Button(starter.getApplicationContext()) ;
        Integer  value =  stateY*breadth+stateX  ;  //value
        verse.setText(Integer.toString(value+1)) ;
        verse.setLayoutParams(parameters(stateY,stateX)) ; 
        verse.setMaxWidth(28) ; 
        verse.setMaxHeight(28) ;
        verse.setMinWidth(20) ;
      return verse ; 
    }   
    public void placeExtra(View reach  ) {
        this.extras.add(reach) ; 
    }  
    public void resetBuffer( ){
         buffers[1].clear() ;
        buffers[0].clear() ; 
        if(extras.size( )>0){
            View views = extras.get(0) ;
            ((TextView)views).setText(new String("")) ;
        }
    }
    public List<Integer> perform(Integer stage){
        int range =  breadth*depth ; 
        List<Integer> imports = StreamSource.allocateValues(1,range,stage) ; 
        List<Integer> legal = new LinkedList<Integer>(imports)  ; 
        buffers[1] =  legal ;
        return legal  ;
    }
    public void listener( View notes){    
        notes.setOnClickListener(   
            new View.OnClickListener(){   
                @Override   
                public void onClick(View  reach){
                    CustomThread5 custom = new CustomThread5(reach,starter) ;   
                    custom.start() ;        
                   TextView  view4 = (TextView)(reach) ;    
                   TextView view5 =  (TextView)(extras.get(0)) ;     
                if(extras.size ()>0){String crease = (view5).getText().toString( ) ;   
                view5.setText(crease.concat(view4.getText().toString( ))) ;   
             } }    }  ) ;
        // notes.performClick() ;
    }  
    /**for(int fc=depth-1;fc>=0;fc--){ 
            for(int cd=breadth-1;cd>=0;cd--){
            View  gains =   createView(cd,fc) ; */
    public void configureGrid(){      
        for(int fc=0;fc<depth;fc++){ 
            for(int cd=0;cd<breadth;cd++){
            View  gains =   createView(fc,cd) ;
            items[fc][cd] =   gains  ;
            squares.addView(gains) ;       
            listener(gains) ;  
            }     
        }      
    }    
  //  public void resetState( ){
         
  //  }
    public boolean validate(List<Integer> graces){
        if(graces.equals(buffers[1]))
        {return true ; } else{
        return false  ;  }  
    }   
    /**char checks = template.charAt(rf) ; 
            Integer parts = Integer.parseInt(checks ) ; */
    public boolean incase( ){  
        if(extras.size( )<=0){return true ; } 
        if(buffers[1].size()==0){return false ; }
        TextView samples =   (TextView)(extras.get(0)) ;
        String templates = samples.getText( ).toString() ;
        List<Integer> created =new ArrayList<Integer>( ) ;
        for(int rf =0;rf<templates.length ( ) ;rf++ ){ 
            String checks = String.valueOf(templates.charAt(rf) ) ;  
            Integer parts = Integer.parseInt(checks) ;
            created.add(parts) ;
         } 
    return created.equals(buffers[1]) ;
    }  
    //  if( created.equals(buffer[1])==false){return  false ; }
    public void setBuffer(int position , List<Integer> actives ){
        this.buffers[position] = actives ; 
    }
}
