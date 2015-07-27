package com.example.kiora.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /*
    ---------------------------------------- BUTTONS ----------------------------------------------
    Method must be public & return void
    */
    public void sendMessageB(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch: Spotify Streamer!";
        int duration = Toast.LENGTH_LONG;

        Toast.makeText(context, text, duration).show();
    }

    public void sendMessageB2(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch: Super Duo!";
        int duration = Toast.LENGTH_LONG;

        Toast.makeText(context, text, duration).show();
    }

    public void sendMessageB3(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch: Build It Bigger!";
        int duration = Toast.LENGTH_LONG;

        Toast.makeText(context, text, duration).show();
    }

    public void sendMessageB4(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch: XYZ Reader!";
        int duration = Toast.LENGTH_LONG;

        Toast.makeText(context, text, duration).show();
    }

    public void sendMessageB5(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch: Capstone App!";
        int duration = Toast.LENGTH_LONG;

        Toast.makeText(context, text, duration).show();
    }
}
