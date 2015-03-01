package com.example.home_task;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView img1 = (ImageView) findViewById(R.id.Img1);
        ImageView img2 = (ImageView) findViewById(R.id.Img2);
        ImageView img3 = (ImageView) findViewById(R.id.Img3);

        View.OnClickListener oclFilm = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.Img1:
                        Intent firstFilm = new Intent(MainActivity.this, firstFilm.class);
                        startActivity(firstFilm);
                        break;
                    case R.id.Img2:
                        Intent secondFilm = new Intent(MainActivity.this, secondFilm.class);
                        startActivity(secondFilm);
                        break;

                    case R.id.Img3:
                        Intent thirdFilm = new Intent(MainActivity.this, secondFilm.class);
                        startActivity(thirdFilm);
                        break;
                }

            };
        };
        img1.setOnClickListener(oclFilm);
        img2.setOnClickListener(oclFilm);
        img3.setOnClickListener(oclFilm);

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
}
