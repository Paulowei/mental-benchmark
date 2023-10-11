//package com.moderneinstein.android.official  ;
//package com.moderneinstein.android.arcade ; 
package com.moderneinstein.android.effort  ;  

import android.os.Handler ;
import android.os.Looper ; 
import android.app.Service ;
import android.os.Bundle ;
import android.app.Activity ; 
import android.view.ViewGroup ; 
import android.view.View ; 

import android.widget.Button ;
import android.widget.TextView ; 
import android.widget.EditText ;
import android.content.Context ; 
import android.content.Intent ;
import android.graphics.Color ;

import java.util.ArrayList ; 
import java.util.List ;
import java.util.Vector ;
import  java.util.Arrays ;


import android.R.layout ; 
import android.R.string ; 
import android.R.dimen ;
import android.R.color  ;

import com.google.android.gms.tasks.OnCompleteListener  ; 
import com.google.android.gms.tasks.OnSuccessListener ; 
import com.google.android.gms.tasks.OnFailureListener ;   
import com.google.android.gms.tasks.Task   ;  
import com.google.firebase.auth.FirebaseAuth ;
import com.google.firebase.auth.FirebaseUser ; 
import com.google.firebase.auth.AuthResult ; 
  import com.google.firebase.FirebaseApp ; 
// app/build/outputs/apk/release/grace6.apk
public class SignupActivity extends Activity{

    public  List<ViewGroup> parents ; 
    public  ArrayList<View> children ; 
    public static int  stateId = R.layout.signup ; 
    public static int[] array4  = new int[]{R.id.signup_1,R.id.signup_1_1,R.id.signup_1_1_1,R.id.signup_1_1_1_1,R.id.signup_1_1_1_2}  ; 
    public static int[] array5 = new int[]{R.id.signup_1_1_1_1_1,R.id.signup_1_1_1_1_2,R.id.signup_1_1_1_1_3
      ,R.id.signup_1_1_1_1_4,R.id.signup_1_1_1_2_1,R.id.signup_1_1_1_2_2}  ; 
    public  Context context ;
     public FirebaseAuth  client  ;   
     public static long[] PAUSES = new long[ ]{ 800,900 } ;
     public void  compute(){
      children.get(5).setOnClickListener( 
        new View.OnClickListener(){
          @Override 
          public void onClick(View states){
              Intent capable = new Intent() ;
              capable.setClass(context,LoginActivity.class) ;
              capable.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
              startActivity(capable) ; 
          }
        }
      )  ;
        children.get(4).setOnClickListener(
            new View.OnClickListener(){
              @Override
              public void onClick(View verse){
                   signup() ; 
              }
            }
        )  ;
    }     
       // Implement Signup Service 
                  // Testing() ; 
              //    Intent  trench = new Intent( ) ; 
             ///    trench.setClass(context,RootActivity.class );
             //   trench.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) ;
              //    startActivity(trench) ;  
    public void  resolve(){
      parents = new Vector<ViewGroup>() ; 
      int verse= array4.length ; 
      for(int ds=0;ds<verse;ds++){
          ViewGroup arrive = (ViewGroup)findViewById(array4[ds]) ;
          ((Vector<ViewGroup>)parents).addElement(arrive) ; 
      }
      int screen =array5.length ;
      children =new ArrayList<View>() ; 
      children.ensureCapacity(screen) ;
      for(int fr=0;fr<screen;fr++){
         View current = (View)requireViewById(array5[fr ]) ; 
        children.add(current) ; 
      }
    }   
    //          //  .. 
     public  void  Testing(){
      long noted = System.currentTimeMillis() ;
      new Thread(){
        @Override 
        public void run(){
           int  amount =   parents.size() ; 
          String  check = String.valueOf(amount) ; 
          while( System.currentTimeMillis() - noted < 2000 ) {}
           ((TextView)children.get(4)).setText(check) ;
        }
      }.start() ; 
    }   
    /*  public void ascend(Task<AuthResult> trials){

    }  
    public void descend(Task<AuthResult> trials){
      
    } */
    public void signup(){
       String username = 
       ((TextView)children.get(1)).getText( ).toString( ) ;
      String password = 
      ((TextView)children.get(3)).getText().toString(  ) ;  
       attempt(username,password  )  ; 
    }     
     public void succeed   ( Task<AuthResult> trials) {
      AuthResult auths = trials.getResult( ) ;
            FirebaseUser users =  auths.getUser() ;
            client.updateCurrentUser(users) ;    
            Singleton.restate(true ) ; 
            Singleton.setUser(users) ; 
            Tools.notify("Signup Successful ! ",context,PAUSES[0]) ; 
     }    //"Login Successful ! "   
     public void  recede(Task<AuthResult> trials){
          AuthResult results =trials.getResult( ); 
            Exception except =   trials.getException( ) ;  
              Singleton.restate(false) ; 
          Singleton.setUser(null) ; 
            String noted = except.toString( ) ;  
            Tools.notify(noted,context,PAUSES[1]) ;  
     }
    // signInUserWithEmailAndPassword
    public void  attempt(String username,String password){
       Task<AuthResult> tasks  =  client.createUserWithEmailAndPassword(username,password ) ; 
      tasks.addOnCompleteListener(
        this,new  OnCompleteListener<AuthResult>( ){
          @Override 
          public void onComplete( Task <AuthResult>  trials){
           if(trials.isSuccessful()){
                succeed(trials)   ; 
           } 
           else{   
               recede(trials)  ; 
           }
          }
        }
      )  ;
    }
    /*   int colors = Color.argb(75,40,40,80) ;
      children.get(3).setBackgroundColor(colors) ; 
      long  yearn = System.currentTimeMillis() ; 
    //  testing() ;    */
    //Singleton.deriveAuth( ); 
    @Override 
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState) ;    
          try{
    client =  Singleton.deriveAuth( )  ;  // FirebaseAuth.getInstance() ;    
    }catch(Exception except){
      Tools.notify (except.toString(),context,1000)  ;
    }
        setContentView(stateId) ; 
        context =  this.getApplicationContext() ; 
        resolve() ; 
        compute() ;
    }

}