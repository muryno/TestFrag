package com.muryno.testfrag;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MultiActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);

        if(savedInstanceState==null){
            FirstFrag memnu=new FirstFrag();
            FragmentManager manager=getSupportFragmentManager();
            manager.popBackStack();
            manager.beginTransaction()
                    .replace(R.id.container,memnu)
                    .commit();
        }
    }
}
