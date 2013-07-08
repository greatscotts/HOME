package com.app.sanbeda;

import android.app.Activity;
import android.content.Intent;


import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity{

	
	@Override
	protected void onCreate(Bundle gianjavelona) {
		// TODO Auto-generated method stub
		super.onCreate(gianjavelona);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
	    
		setContentView(R.layout.activity_main);
		
		Thread timer = new Thread(){
		public void run(){
			try{
				sleep(4000);
				
			} catch (InterruptedException e){
				e.printStackTrace();
			} finally{
				Intent openLogon = new Intent("com.app.sanbeda.LOGON");
				startActivity(openLogon);
			}
		}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		finish();
	}
	

}
	
		
	