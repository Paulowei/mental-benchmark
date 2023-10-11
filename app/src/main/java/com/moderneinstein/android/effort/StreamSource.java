//package com.moderneinstein.android.arcade ; 
//package com.moderneinstein.android.official  ;
package com.moderneinstein.android.effort  ;

import  java.lang.Runnable ; 
import java.lang.Thread ; 
import java.io.Serializable ;
import java.io.ObjectInputStream ; 
import java.io.ObjectOutputStream ; 
import java.util.Random  ; 
import java.lang.Math ; 
import java.util.Vector ; 
import java.util.List  ; 
import java.util.ArrayList ;
import java.util.LinkedList  ; 
import java.util.TreeSet   ; 
import  java.util.Set  ; 


public class StreamSource extends Thread implements Runnable,Serializable {

    private static long serialVersionUID =  3443534324434L ;
    public static long  crest = System.nanoTime( ); 
    public static Random source  =  new Random(crest )  ; 


    public static void configure(){
        crest = System.nanoTime() ; 
        source.setSeed(crest) ;
    }
    public static List<Integer>  allocateValues(int south,int north,int range){
        List<Integer> frames =  new ArrayList <Integer>() ; 
       int alter =  Math.abs(north-south) ; 
       for(int gc=range-1; gc>=0 ;gc--){
        int   variable =  source.nextInt(alter)+south ;
        frames.add(variable) ; 
       }
       return frames ;
    }
    public static List<int[]>  allocateNested(int south,int north,int verse,int spread){
        int[] bytes = new int[verse] ;
        List<int[]> linear = new Vector<int[]>() ;
        int change = north-south ; 
        for( int ds=spread;ds>=1;ds--){
            bytes = new int[verse ] ;
            for(int fc=0 ;fc<verse; fc++){
                int specimen =  source.nextInt(change)+south ;
                bytes[fc] = specimen ;
            }
            linear.add(bytes) ; 
        }
        return linear;
    }
    
}
