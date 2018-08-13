package com.muryno.testfrag;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



/**
 * Created by muraino harbeola on 8/10/2018.
 */

public class BottomSheetDialog extends BottomSheetDialogFragment {

    private BottomSheetDialogListner mListner;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.bottonsheetdialog,container,false);

        Button guess1=(Button) v.findViewById(R.id.guess1);
        Button guess2=(Button)  v.findViewById(R.id.guess2);
        Button guess3=(Button) v.findViewById(R.id.guess3);


        guess1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mListner.OnTextClicked("guess1");
                dismiss();
            }
        });

        guess2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.OnTextClicked("guess2");
                dismiss();
            }
        });
        guess3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListner.OnTextClicked("guess3");
                dismiss();
            }
        });
        return v;
    }
    public interface BottomSheetDialogListner{
        void OnTextClicked(String value);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            mListner = (BottomSheetDialogListner) context;

        }catch (ClassCastException e){
            throw new ClassCastException(context.toString()+ " must implement BottomSheetDialogListner ");
        }
    }
}

