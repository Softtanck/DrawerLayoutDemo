package com.softtanck.drawerlayoutdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;


public class MainActivity extends Activity implements DrawerLayout.DrawerListener {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.dl);
        drawerLayout.setDrawerListener(this);
        //The drawer is locked open. The user may not close it, though the app may close it programmatically.
//        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_OPEN);
    }

    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {
        Log.d("Tanck", "onDrawerSlide");
    }

    @Override
    public void onDrawerOpened(View drawerView) {
        Log.d("Tanck", "onDrawerOpened");
    }

    @Override
    public void onDrawerClosed(View drawerView) {
        Log.d("Tanck", "onDrawerClosed");
    }

    @Override
    public void onDrawerStateChanged(int newState) {
        Log.d("Tanck", "onDrawerStateChanged");
    }

    public void test(View view) {
        drawerLayout.closeDrawer(GravityCompat.START);
    }
}
