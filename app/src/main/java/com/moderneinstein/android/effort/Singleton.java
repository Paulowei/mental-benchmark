//package com.moderneinstein.android.arcade  ; 
//package com.moderneinstein.android.official  ;
package com.moderneinstein.android.effort  ;
import java.util.Vector;
import  java.util.Arrays  ;
import java.util.Set  ;
import java.util.Queue ;

import com.google.android.gms.tasks.Task ; 
import com.google.firebase.auth.FirebaseAuth ;
import com.google.firebase.auth.FirebaseUser ; 
import com.google.firebase.auth.AuthResult  ; 

///  import com.google.firebase.auth.
 import com.google.firebase.FirebaseApp ; 
public class Singleton{
    private static   FirebaseAuth central ; //= null ; // FirebaseAuth.getInstance() ; 
    private static boolean oriented = false ;  
    private static  FirebaseUser voltage = null ; 
    public static FirebaseApp apps ; 

    public static  FirebaseAuth  deriveAuth(){
        FirebaseAuth point = central ;
        return point  ;
    }
    public  static void  restate(boolean braces){
        boolean pause = braces ;
        oriented = pause ; 
    }
    public static boolean  identify() {
        boolean grace = oriented ; 
        return oriented ; 
    }    
    public static  void setAuth(FirebaseAuth nests){
            central = nests ; 
    }
     public static void setUser(FirebaseUser clients){
        voltage = clients ; 
     } 
    public static FirebaseUser deriveUser( ){  
        return voltage ;   
    }  
    public static void setApps (FirebaseApp  fires){
        apps = fires ; 
    } 
    public static FirebaseApp deriveApps(){
        return  apps ; 
    }

}