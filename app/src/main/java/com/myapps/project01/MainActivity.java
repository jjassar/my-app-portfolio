package com.myapps.project01;

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


    public void launch_spotify(View v)
    {
        Toast.makeText(this, "This button will launch Spotify app!", Toast.LENGTH_LONG).show();


    }


    public void launch_scores(View v)
    {
        Toast.makeText(this, "This button will launch Scores app!", Toast.LENGTH_LONG).show();


    }
    public void launch_library(View v)
    {
        Toast.makeText(this, "This button will launch Library app!", Toast.LENGTH_LONG).show();


    }
    public void launch_bigger(View v)
    {
        Toast.makeText(this, "This button will launch Build It Bigger app!", Toast.LENGTH_LONG).show();


    }
    public void launch_reader(View v)
    {
        Toast.makeText(this, "This button will launch Reader app!", Toast.LENGTH_LONG).show();


    }

    public void launch_capstone(View v)
    {
        Toast.makeText(this, "This button will launch My Capstone App!", Toast.LENGTH_LONG).show();


    }


}
