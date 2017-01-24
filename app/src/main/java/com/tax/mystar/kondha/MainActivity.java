package com.tax.mystar.kondha;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.tax.mystar.kondha.alarm.AlarmActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {

    private Button btnStart;

    private RelativeLayout relSelectFragments;

    private TextView textSanth;
    private TextView textDukh;
    private TextView textMahi;
    private TextView textPrak;

    public static int fragNum = 0;
    private int[] fragNumberArray = { 3, 1, 2, 3, 4, 2, 1 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMainTabFromDayOfWeek();

                ScreenSlidePagerActivity.judgeContinue = false;
                startActivity(new Intent(MainActivity.this, ScreenSlidePagerActivity.class));
                finish();
            }
        });

        initWidget();
        onClickFragments();
    }

    private void initWidget(){
        relSelectFragments = (RelativeLayout)findViewById(R.id.relSelectFragments);

        textSanth = (TextView) findViewById(R.id.textSanth);
        textDukh = (TextView) findViewById(R.id.textDukh);
        textMahi = (TextView) findViewById(R.id.textMahi);
        textPrak = (TextView) findViewById(R.id.textPrak);
    }

    private void onClickFragments(){

        textSanth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Santh", Toast.LENGTH_SHORT).show();
                fragNum = 1;
                commonProcessForFragment();
            }
        });

        textDukh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Dukh", Toast.LENGTH_SHORT).show();
                fragNum = 2;
                commonProcessForFragment();
            }
        });

        textMahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Mahi", Toast.LENGTH_SHORT).show();
                fragNum = 3;
                commonProcessForFragment();
            }
        });

        textPrak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Prak", Toast.LENGTH_SHORT).show();
                fragNum = 4;
                commonProcessForFragment();
            }
        });
    }

    private void commonProcessForFragment(){
        relSelectFragments.setVisibility(View.GONE);
        btnStart.setVisibility(View.VISIBLE);

        final Calendar c = Calendar.getInstance();
        SharedPreferences.Editor editor = getSharedPreferences("MyShared", MODE_PRIVATE).edit();
        editor.putInt("fragNum", fragNum);
        editor.putInt("tagNum", c.get(Calendar.DAY_OF_WEEK) - 1);
        editor.putInt("subtagNum", 0);
        editor.commit();

        ScreenSlidePagerActivity.judgeContinue = false;
        startActivity(new Intent(MainActivity.this, ScreenSlidePagerActivity.class));
        finish();
    }

    private void setMainTabFromDayOfWeek(){
        ScreenSlidePagerActivity.judgeContinue = true;

        final Calendar c = Calendar.getInstance();

//        Monday and Saturday ->Frag 1; Santh
//        Tuesday and Friday -> Frag 2; Dukh
//        Wednesday and Sunday -> Frag 3; Mahi
//        Thursday -> Frag 4; Prak

        String[] toastStr = { "Sunday : Frag 3, Mahi", "Monday : Frag 1, Santh", "Tuesday : Frag 2, Dukh",
                              "Wednesday : Frag 3, Mahi", "Thursday : Frag 4, Prak",
                              "Friday : Frag 2, Dukh", "Saturday : Frag 1, Santh" };

        fragNum = fragNumberArray[c.get(Calendar.DAY_OF_WEEK) - 1];
        Toast.makeText(getApplicationContext(), /*String.valueOf(c.get(Calendar.DAY_OF_WEEK)) +
                                        ": " + */toastStr[c.get(Calendar.DAY_OF_WEEK) - 1], Toast.LENGTH_SHORT).show();


        SharedPreferences.Editor editor = getSharedPreferences("MyShared", MODE_PRIVATE).edit();
        editor.putInt("fragNum", fragNum);
        editor.putInt("tagNum", c.get(Calendar.DAY_OF_WEEK) - 1);
        editor.putInt("subtagNum", 0);
        editor.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_content1) {
            // Handle the camera action
            startActivity(new Intent(MainActivity.this, ContentActivity.class));
            fragNum = 5;
            finish();
            Toast.makeText(getApplicationContext(), "5th Fragment", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_start) {
            setMainTabFromDayOfWeek();

            ScreenSlidePagerActivity.judgeContinue = false;
            startActivity(new Intent(MainActivity.this, ScreenSlidePagerActivity.class));
            finish();
        } else if (id == R.id.nav_fragments) {

            relSelectFragments.setVisibility(View.VISIBLE);
            btnStart.setVisibility(View.GONE);
        } else if (id == R.id.nav_continue) {

            SharedPreferences prefs = getSharedPreferences("MyShared", MODE_PRIVATE);
            fragNum = prefs.getInt("fragNum", 0);//

            ScreenSlidePagerActivity.judgeContinue = true;
            startActivity(new Intent(MainActivity.this, ScreenSlidePagerActivity.class));
            finish();
        } else if (id == R.id.nav_set_reminder) {
            startActivity(new Intent(MainActivity.this, AlarmActivity.class));
//            finish();
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        } else if (id == R.id.nav_rate) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
