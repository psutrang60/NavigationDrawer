package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        // set title color to white
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        // set three dot color as white , we need new icon for that
        toolbar.setOverflowIcon(getDrawable(R.drawable.ic_more_vert_black_24dp));
        setSupportActionBar(toolbar);

        // drawer menu settings
        drawerLayout = findViewById(R.id.drawer);
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.addDrawerListener(drawerToggle);
        // set hamburger color white
        drawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        drawerToggle.setDrawerIndicatorEnabled(true); // enable hamburger
        drawerToggle.syncState();

        // lets select navigation view first
        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // set menu layout
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case  R.id.rateus:
                Toast.makeText(this, "Rate Btn Clicked", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.settings:
                Toast.makeText(this, "Settings Btn Clicked", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.contact:
                Toast.makeText(this, "Contact Btn Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case  R.id.home:
                Toast.makeText(this,"Home Btn Clicked",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.profile:
                Toast.makeText(this,"Profile Btn Clicked",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.rate:
                Toast.makeText(this,"Rete Btn Clicked",Toast.LENGTH_SHORT).show();
                break;

        }
        return false;
    }
}
