package com.cobatte.taxi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class LogoActivity extends Activity {
	ImageView introImage;
	
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo);
        
        new Thread(new Runnable(){
        public void run(){
        	try{
        		introImage = (ImageView)findViewById(R.id.logo);
        		Animation alphaAnim =
        				AnimationUtils.loadAnimation(getApplicationContext(), R.anim.intro);
        		introImage.startAnimation(alphaAnim);
        		Thread.sleep(2500);
        		logoIntro();
        	}catch(Exception e){}
        }
        }).start();
    }
        
    private void logoIntro(){
    	Intent i = new Intent(LogoActivity.this, PopupActivity.class);
       	startActivity(i);
       	finish();
    }
}
