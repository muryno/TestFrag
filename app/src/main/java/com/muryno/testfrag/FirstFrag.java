package com.muryno.testfrag;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by muraino harbeola on 8/9/2018.
 */

public class FirstFrag extends Fragment {
    public FirstFrag() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.firstfarg, container, false);
        Button headbtn = (Button) rootView.findViewById(R.id.bnSignIn);

        final  FragmentTransaction transaction = getFragmentManager().beginTransaction();


        headbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                SecondFrag head = new SecondFrag();

                transaction.replace(R.id.container, head);
                transaction.addToBackStack(null);

                transaction.commit();
            }
        });

        return rootView;
    }
}