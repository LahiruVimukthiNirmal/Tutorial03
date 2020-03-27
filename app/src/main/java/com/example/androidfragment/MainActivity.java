package com.example.androidfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void changeFragment (View view) {
        Fragment fragment;

        if (view == findViewById (R.id.btnFragment1)) { //Link to Fragment1
            fragment = new Fragment1();
            FragmentManager fragmentManager = getSupportFragmentManager ();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction ();
            fragmentTransaction.replace (R.id.fgmntDefault, fragment);
            fragmentTransaction.commit ();
        }

        if (view == findViewById (R.id.btnFragment2)) { //Link to Fragment2
            fragment = new Fragment2 ();
            FragmentManager fragmentManager = getSupportFragmentManager ();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction ();
            fragmentTransaction.replace (R.id.fgmntDefault, fragment);
            fragmentTransaction.commit ();

        }
    }
}
