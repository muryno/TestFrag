package com.muryno.testfrag;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by muraino harbeola on 8/9/2018.
 */

public class SecondFrag  extends Fragment implements BottomSheetDialog.BottomSheetDialogListner {

    EditText etPhone;
    public SecondFrag(){
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.secondfrag,container,false);

         etPhone=(EditText) rootView.findViewById(R.id.etPhone);
        Button headbtn=(Button) rootView.findViewById(R.id.bnSignout);

        headbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                BottomSheetDialog dialog=new BottomSheetDialog();

                dialog.show(getFragmentManager(),"Bottomsheetdialog");


            }
        });

        return rootView;

    }

    @Override
    public void OnTextClicked(String value) {
        etPhone.setText(value);
    }
}
