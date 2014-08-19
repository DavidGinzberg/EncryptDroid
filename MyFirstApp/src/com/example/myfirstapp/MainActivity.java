package com.example.myfirstapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setVolumeControlStream(AudioManager.STREAM_NOTIFICATION);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
        
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	//handle presses on the action bar items
    	switch (item.getItemId()){
    	case R.id.action_search:
    		openSearch();	//TODO implement
    		return true;
    	case R.id.action_settings:
    		openSettings();	//TODO implement
    		return true;
    	default:
    		return super.onOptionsItemSelected(item);
    	}
    }
    
    /**
     * Called when the user clicks the send button
     * @param view
     */
    public void sendMessage(View view){
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	String message = editText.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
    
    //Methods for action bar items
    private void openSearch(){
    	Context context = getApplicationContext();
    	CharSequence text = "Search not implemented. Sorry";
    	int duration = Toast.LENGTH_SHORT;
    	
    	Toast toast = Toast.makeText(context, text, duration);
    	//position toast near top
    	toast.setGravity(Gravity.TOP, 0, 15);
    	toast.show();
    	return;
    }
    
    private void openSettings(){
    	Context context = getApplicationContext();
    	CharSequence text = "Settings not implemented. Sorry";
    	int duration = Toast.LENGTH_SHORT;
    	
    	Toast toast = Toast.makeText(context, text, duration);
    	//position toast near top
    	toast.setGravity(Gravity.TOP, 0, 15);
    	toast.show();
    	return;
    }
    
}
