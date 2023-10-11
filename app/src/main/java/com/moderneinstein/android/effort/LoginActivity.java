//package  com.moderneinstein.android.arcade ;  
//package com.moderneinstein.android.official  ;  
package com.moderneinstein.android.effort  ;
import android.view.View ; 
import android.os.Bundle  ; 
import android.view.ViewGroup ; 
import android.app.Activity ; 
import android.widget.Button ;  

import android.view.LayoutInflater ;
import android.content.Context ; 
import android.content.Intent ;
import android.view.ViewPropertyAnimator ;
import android.widget.TextView ; 

import java.util.ArrayList ;
import java.util.HashSet ; 
import java.util.TreeMap ; 
import java.util.Vector ;
import java.util.List ;
import java.util.concurrent.Executor ; 

import android.R.dimen ; 
import android.R.color ;
import android.R.string ; 
import android.R.layout  ;


import  com.google.firebase.auth.AuthResult ; 
import com.google.firebase.auth.FirebaseUser  ; 
import com.google.firebase.auth.FirebaseAuth ;

import com.google.android.gms.tasks.OnCompleteListener ; 
import com.google.android.gms.tasks.Task ;
import com.google.android.gms.tasks.OnFailureListener ; 
import com.google.android.gms.tasks.OnSuccessListener ; 

//import com.moderneinstein.android.official.CustomView4  ;
//import com.moderneinstein.android.official.SelectActivity ;
 import com.google.firebase.FirebaseApp ; 
/**
 * 	public  int[] viewId ={R.id.login_1,R.id.login_1_1,R.id.login_1_1_1,R.id.login_1_1_2,R.id.login_1_1_3 }; 
	public  View[] views  = {} ;
	public int[]  groupId = {R.id.login_1_1_1_1,R.id.login_1_1_1_2,R.id.login_1_1_1_3,R.id.login_1_1_1_4,R.id.login_1_1_2_1 } ; 
 * 
 */
public class LoginActivity extends Activity  {
	
	public static int resourceId  = R.layout.login     ;
	public  int[] viewId =  new int[]{R.id.login_1_1_1_1_1,R.id.login_1_1_1_1_2,R.id.login_1_1_1_1_3,R.id.login_1_1_1_1_4,R.id.login_1_1_1_2_1,R.id.login_1_1_1_2_2 }  ; 
	public  View[] views    ;
	public int[]  groupId = new int[]{R.id.login_1,R.id.login_1_1,R.id.login_1_1_1,R.id.login_1_1_1_1,R.id.login_1_1_1_2} ; 
	public ViewGroup[] groups = {} ; 
	public static Context context ; 
	public static LayoutInflater manager ; 	
	//public List<CustomView4> linear  ; 
	public  static long  lapse =   200 ;
	public static long alter = 150 ;   
	public static long  DELAYS[ ] = new  long[]{850,900} ;
	private  FirebaseAuth  worker ;
	@Override 
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState) ; 
		setContentView(resourceId) ;
	//	manager = getLayoutInflater()  ;   
	//    worker = FirebaseAuth.getInstance() ; 
		context = getApplicationContext()  ; 
		createViews() ; 
		registerEvents() ; 		 
		try{
		worker = Singleton.deriveAuth( );  //FirebaseAuth.getInstance() ;  //
		}catch(Exception except){
			Tools.notify(except.toString(),context,1000)  ;
		}
		}
	public void createViews(){
		int spread = groupId.length  ; 
		int drawn = viewId.length ; 
		groups = new ViewGroup[spread] ;
 		views = new View[drawn] ; 
		for(int gs=spread-1;gs>=0;gs--){
			ViewGroup square = (ViewGroup)findViewById(groupId[gs]) ;
			square.setVisibility(View.VISIBLE) ; 
			 groups[gs] = square ;
			}
		for(int rs=drawn-1;rs>=0;rs--){
			View current = (View)findViewById(viewId[rs]) ;
			current.setVisibility(View.VISIBLE ) ;
			views[rs] = current ;
			}
	//	views[3].setVisibility(View.INVISIBLE) ;
		}
		public void loginView(){  
			String Username =  ((TextView)views[1]).getText().toString() ;
			String Password = ((TextView)views[3]).getText().toString(); 
		   Thread   verse = new Thread(){  
			@Override 
			public void  run(){
		//	actions(Username,Password)  ;  
		insert(Username,Password) ;
			}
		   } ; 
		Executor  brace = new ExecutorFour() ;
		brace.execute(verse) ; 
		}
		/**
			String username  = 
			String password =  
		 */
		public void  actions(String username,String password){
		Task<AuthResult>  norms = worker.createUserWithEmailAndPassword(username,password)  ;
		norms.addOnCompleteListener(
			this,new OnCompleteListener<AuthResult>(){
				@Override 
				public void  onComplete(Task<AuthResult> brace){ 
				 if(brace.isSuccessful()){
					AuthResult results =  brace.getResult() ;
				 }else{

				 }
				}
			}) ;  
		}     
		// Task<AuthResult> tasks
		public void ascend(AuthResult result){
			FirebaseUser users = result.getUser()   ;   
						worker.updateCurrentUser(users)    ; 
						Singleton.setUser(users)   ;  
						Singleton.restate(true) ;  
						Tools.notify(new String("Login Successful ! "),context,DELAYS[0]) ;
		}  
		//Task<AuthResult> tasks)
		public void descend( Exception except){
			String taken = except.getMessage( ) ;  
			   //  Log.e("Error",taken) ;   
				Singleton.setUser(null)  ; 
				Singleton.restate(false) ; 
				Tools.notify(new String(taken),context,DELAYS[1])  ;
		}
		public void insert(String Username,String  Password){
			Task<AuthResult> tasks =  worker.signInWithEmailAndPassword(Username,Password) ;
			tasks.addOnFailureListener(this,new OnFailureListener(){
				@Override 
				public void onFailure(Exception  except){
				   	descend(except) ; 
				}
			}   ) ;  
			// <AuthResult>
			tasks.addOnSuccessListener(this,new OnSuccessListener<AuthResult>(){
					@Override 
					public void onSuccess(AuthResult result){
						ascend(result)  ; 
					}
			}   )  ;
		}
		public static boolean validate(){
			//Carry out validation ; 
			 return true ; 
		}
	public void routeRequest(){
		Intent action = new Intent(context,SelectActivity.class)  ;
					long noted = System.currentTimeMillis() ; 
					orient(views[2],40,20,20,lapse) ;
					while(System.currentTimeMillis()- noted<alter){
						//waiting time ;    
					}
					startActivity(action)  ;
	}

/* 	public void  events(){
	 	views[1].setOnClickListener(
			new  View.OnClickListener(){
				@Override 
				public void onClick(View stated){
					if(!validate()){views[3].setVisibility(View.VISIBLE) ; return  ;}
					new Thread(){
						@Override
					public void run(){ 
					    routeRequest() ;
					}  }.start() ;
				}  })  ; 

				 views[0].setOnClickListener(


				 )  ;
			}
  */
	public void registerEvents(){
		views[5].setOnClickListener(
			new View.OnClickListener(){
				@Override 
				public void onClick(View assign){
					Intent correct = new Intent() ; 
					correct.setClass(context,SelectActivity.class) ;
					//  startActivity(correct ) ;  
					loginView( ) ; 
				}
			}
		) ;
		views[4].setOnClickListener(
			new View.OnClickListener(){
				@Override
				public void onClick(View traces){
					Intent solvent = new Intent() ; 
					solvent.setClass(context,SignupActivity.class) ; 
					startActivity(solvent) ; 
 				}
			}
		); 
	}
	public synchronized void  orient(View noted, float  translateZ,float  rotateX,float rotateY,long duration){
			noted.requestLayout() ;
			ViewPropertyAnimator animator = noted.animate()  ; 
			animator.translationZ(translateZ) ;   
			animator.rotationY(rotateY) ;   
			animator.rotationX(rotateX) ;   
			animator.setDuration(duration) ;   
			new Thread(){
				@Override
				public void run (){ 
			context.getMainExecutor().execute(()->animator.start() ) ;  }
			}.start( ) ;
	}
}