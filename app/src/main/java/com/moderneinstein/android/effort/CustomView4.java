//package  com.moderneinstein.android.arcade ;  
//package com.moderneinstein.android.official  ;  
package com.moderneinstein.android.effort  ;
import android.widget.Button ; 
import android.os.Handler ; 
import android.content.res.Resources ; 
import android.content.Context ; 
import android.view.View ; 
import android.view.ViewGroup ; 

import android.util.Xml ; 
import org.xmlpull.v1.XmlPullParser ; 
import android.util.AttributeSet ; 


//import  java.awt.Dimension ;

import java.util.Arrays ; 
import java.util.Set   ;
import java.util.LinkedList  ;

import android.R.layout ;
import android.R.dimen ; 
import android.R.string ;
import android.R.color ;


public class CustomView4 extends Button{

	public static  int[] sampleId = {} ; 
	public static int defaultId =   R.layout.custom_view_4 ; 
	public static int[] paddings = {6,6,6,6} ;
	public static int[]  describe = {} ;
	public static int[] margins = {7,7,7,7}  ;
	public  static AttributeSet  source(Context context){
	    //   int value = sampleId[defaultId] ;
		Resources sources =  context.getResources() ;
		XmlPullParser parsed = sources.getXml(defaultId) ;
		AttributeSet sets = Xml.asAttributeSet(parsed) ;
		return sets ; 
		}
		// ,source(current)
	public CustomView4(Context current,String value){
		super(current) ;
		this.setText(value) ;
		this.setPadding(paddings[0],paddings[1],paddings[2],paddings[3]) ;
		ViewGroup.MarginLayoutParams  params = 
		 new ViewGroup.MarginLayoutParams(current,source(current)) ;	
		params.setMargins(margins[0],margins[1],margins[2],margins[3]) ;
		this.generateViewId() ; 
		this.setLayoutParams(params) ; 
		}
		
}

	