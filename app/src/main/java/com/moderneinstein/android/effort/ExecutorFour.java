//package com.moderneinstein.android.arcade ;   
//package com.moderneinstein.android.official  ;  
package com.moderneinstein.android.effort  ; 
import  java.util.concurrent.FutureTask ; 
import java.util.concurrent.Callable ;
import  java.util.concurrent.Executor ; 
import java.util.concurrent.ThreadFactory ; 
import  java.lang.Runnable ; 
import java.lang.Thread ; 
import java.util.Deque ; 
import java.util.ArrayDeque ; 



public class ExecutorFour implements Executor  {
    public Thread  worker ;

    public void Colors(){
        Deque<String> mentos =  new ArrayDeque<>() ;
        mentos.add("Orange");
        String first =  mentos.pop() ; 
      //  System.out.println(first);
    }
    @Override 
    public void execute(Runnable runner){
        worker = new Thread(){
            @Override 
            public void run(){
                runner.run() ; 
            }
        } ;
     //   worker.start() ;
     worker = new Thread(runner) ;   
     worker.start()  ;   
    }

}
