package com.anirudh24seven.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

    public void spotifyButtonClicked(View view) {
        Toast.makeText(MainActivity.this, "This button will launch Spotify Streamer!", Toast.LENGTH_SHORT).show();
    }

    public void scoresAppButtonClicked(View view) {
        Toast.makeText(MainActivity.this, "This button will launch Scores App", Toast.LENGTH_SHORT).show();
    }

    public void libraryAppButtonClicked(View view) {
        Toast.makeText(MainActivity.this, "This button will launch Library App!", Toast.LENGTH_SHORT).show();
    }

    public void buildItBiggerButtonClicked(View view) {
        Toast.makeText(MainActivity.this, "This button will launch Build It Bigger!", Toast.LENGTH_SHORT).show();
    }

    public void xyzReaderButtonClicked(View view) {
        Toast.makeText(MainActivity.this, "This button will launch XYZ Reader!", Toast.LENGTH_SHORT).show();
    }

    public void capstoneAppButtonClicked(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
    }
}
