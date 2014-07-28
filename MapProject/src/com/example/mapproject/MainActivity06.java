package com.example.mapproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity06 extends Activity {
	
	private EditText et1;
	private EditText et2;
	private EditText et3;
	private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity06);
        
        
        
        myButton = (Button) findViewById(R.id.button1);
        myButton.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v) {
        		myButtonAction();
        	}
        });
        
        
     
     } 
        
     private void myButtonAction() {
        	//Uri uri = Uri.parse("geo:46.55,9.56?z=8");

    	 	//String Text1 = getResources().getString(R.string.editText1);
    	 	//String Text2 = getResources().getString(R.string.editText2);
    	 	//String Text3 = getResources().getString(R.string.editText13);
    	    	
    	 	//setText
        	EditText et1 = (EditText) findViewById(R.id.editText1);
            //String hello = et1.getText().toString();
            EditText et2 = (EditText) findViewById(R.id.editText2);
            EditText et3 = (EditText) findViewById(R.id.editText3);
            
            String loc = "geo:"+et1.getText().toString()+","+et2.getText().toString()+"?z="+et3.getText().toString();
            
        	Uri uri = Uri.parse(loc);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
     } 
        
        
}
