package com.tax.mystar.kondha.fragment0;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tax.mystar.kondha.MainActivity;
import com.tax.mystar.kondha.R;
import com.tax.mystar.kondha.ScreenSlidePagerActivity;

/**
 * Created by My Star on 9/30/2016.
 */
public class Fragment0_1 extends Fragment implements ScreenSlidePagerActivity.ISetTextInFragment {
    public static TextView textStringContent1;
    public static TextView textStringContent2;
    public static TextView textStringContent3;
    public static RelativeLayout reLaySlideBg;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment0_0, container, false);

        textStringContent1 = (TextView) rootView.findViewById(R.id.textStringContent1);
        textStringContent2 = (TextView) rootView.findViewById(R.id.textStringContent2);
        textStringContent3 = (TextView) rootView.findViewById(R.id.textStringContent3);

        String[] fragStringArray = { "", "Frag 1", "Frag 2", "Frag 3", "Frag 4", "Frag 5"};

        String fragStringCommon = fragStringArray[MainActivity.fragNum];

        String fragStringCommon1, fragStringCommon2, fragStringCommon3;

        if(MainActivity.fragNum == 1){
            fragStringCommon1 = "Fragment 1, Main tag 1, Sub Tag 2, String 1";
            fragStringCommon2 = "Fragment 1, Main tag 1, Sub Tag 2, String 2";
            fragStringCommon3 = "Fragment 1, Main tag 1, Sub Tag 2, String 3";
        } else if(MainActivity.fragNum == 2){
            fragStringCommon1 = "Fragment 2, Main tag 1, Sub Tag 2, String 1";
            fragStringCommon2 = "Fragment 2, Main tag 1, Sub Tag 2, String 2";
            fragStringCommon3 = "Fragment 2, Main tag 1, Sub Tag 2, String 3";
        } else if(MainActivity.fragNum == 3){
            fragStringCommon1 = "Fragment 3, Main tag 1, Sub Tag 2, String 1";
            fragStringCommon2 = "Fragment 3, Main tag 1, Sub Tag 2, String 2";
            fragStringCommon3 = "Fragment 3, Main tag 1, Sub Tag 2, String 3";
        } else if(MainActivity.fragNum == 4){
            fragStringCommon1 = "Fragment 4, Main tag 1, Sub Tag 2, String 1";
            fragStringCommon2 = "Fragment 4, Main tag 1, Sub Tag 2, String 2";
            fragStringCommon3 = "Fragment 4, Main tag 1, Sub Tag 2, String 3";
        } else {
            fragStringCommon1 = "Fragment 5, Main tag 1, Sub Tag 2, String 1";
            fragStringCommon2 = "Fragment 5, Main tag 1, Sub Tag 2, String 2";
            fragStringCommon3 = "Fragment 5, Main tag 1, Sub Tag 2, String 3";
        }

        textStringContent1.setText(fragStringCommon1 + ":  Content 1  =>  ... ... ...");
        textStringContent2.setText(fragStringCommon2 + ":  Content 2  =>  ... ... ...");
        textStringContent3.setText(fragStringCommon3 + ":  Content 3  =>  ... ... ...");

        return rootView;
    }

    public void setText(String text) {
        TextView t = (TextView) getView().findViewById(R.id.textStringContent1);  //UPDATE
        t.setText(text);
    }

    @Override
    public void showText(String text) {
        textStringContent1.setText(text);
    }
}
