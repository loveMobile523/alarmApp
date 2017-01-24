package com.tax.mystar.kondha;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by My Star on 9/20/2016.
 */
public class ScreenSlidePageFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_screen_slide_page, container, false);

        int tagNum =  ScreenSlidePagerActivity.tagNum; // prefs.getInt("tagNum", 0);
        int subtagNum = ScreenSlidePagerActivity.subtagNum; // prefs.getInt("subtagNum", 0);

        String displayString = "Main Tab Number: " + String.valueOf(tagNum) + ", Sub Tab Number: " + String.valueOf(subtagNum);

//        TextView textSwipe = (TextView)rootView.findViewById(R.id.textSwipe);
//        textSwipe.setText(displayString);

        return rootView;
    }
}
