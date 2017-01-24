package com.tax.mystar.kondha;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.tax.mystar.kondha.fragment0.Fragment0_0;
import com.tax.mystar.kondha.fragment0.Fragment0_1;
import com.tax.mystar.kondha.fragment0.Fragment0_10;
import com.tax.mystar.kondha.fragment0.Fragment0_11;
import com.tax.mystar.kondha.fragment0.Fragment0_2;
import com.tax.mystar.kondha.fragment0.Fragment0_3;
import com.tax.mystar.kondha.fragment0.Fragment0_4;
import com.tax.mystar.kondha.fragment0.Fragment0_5;
import com.tax.mystar.kondha.fragment0.Fragment0_6;
import com.tax.mystar.kondha.fragment0.Fragment0_7;
import com.tax.mystar.kondha.fragment0.Fragment0_8;
import com.tax.mystar.kondha.fragment0.Fragment0_9;
import com.tax.mystar.kondha.fragment1.Fragment1_0;
import com.tax.mystar.kondha.fragment1.Fragment1_1;
import com.tax.mystar.kondha.fragment1.Fragment1_10;
import com.tax.mystar.kondha.fragment1.Fragment1_11;
import com.tax.mystar.kondha.fragment1.Fragment1_2;
import com.tax.mystar.kondha.fragment1.Fragment1_3;
import com.tax.mystar.kondha.fragment1.Fragment1_4;
import com.tax.mystar.kondha.fragment1.Fragment1_5;
import com.tax.mystar.kondha.fragment1.Fragment1_6;
import com.tax.mystar.kondha.fragment1.Fragment1_7;
import com.tax.mystar.kondha.fragment1.Fragment1_8;
import com.tax.mystar.kondha.fragment1.Fragment1_9;
import com.tax.mystar.kondha.fragment2.Fragment2_0;
import com.tax.mystar.kondha.fragment2.Fragment2_1;
import com.tax.mystar.kondha.fragment2.Fragment2_10;
import com.tax.mystar.kondha.fragment2.Fragment2_11;
import com.tax.mystar.kondha.fragment2.Fragment2_2;
import com.tax.mystar.kondha.fragment2.Fragment2_3;
import com.tax.mystar.kondha.fragment2.Fragment2_4;
import com.tax.mystar.kondha.fragment2.Fragment2_5;
import com.tax.mystar.kondha.fragment2.Fragment2_6;
import com.tax.mystar.kondha.fragment2.Fragment2_7;
import com.tax.mystar.kondha.fragment2.Fragment2_8;
import com.tax.mystar.kondha.fragment2.Fragment2_9;
import com.tax.mystar.kondha.fragment3.Fragment3_0;
import com.tax.mystar.kondha.fragment3.Fragment3_1;
import com.tax.mystar.kondha.fragment3.Fragment3_10;
import com.tax.mystar.kondha.fragment3.Fragment3_11;
import com.tax.mystar.kondha.fragment3.Fragment3_2;
import com.tax.mystar.kondha.fragment3.Fragment3_3;
import com.tax.mystar.kondha.fragment3.Fragment3_4;
import com.tax.mystar.kondha.fragment3.Fragment3_5;
import com.tax.mystar.kondha.fragment3.Fragment3_6;
import com.tax.mystar.kondha.fragment3.Fragment3_7;
import com.tax.mystar.kondha.fragment3.Fragment3_8;
import com.tax.mystar.kondha.fragment3.Fragment3_9;
import com.tax.mystar.kondha.fragment4.Fragment4_0;
import com.tax.mystar.kondha.fragment4.Fragment4_1;
import com.tax.mystar.kondha.fragment4.Fragment4_10;
import com.tax.mystar.kondha.fragment4.Fragment4_11;
import com.tax.mystar.kondha.fragment4.Fragment4_2;
import com.tax.mystar.kondha.fragment4.Fragment4_3;
import com.tax.mystar.kondha.fragment4.Fragment4_4;
import com.tax.mystar.kondha.fragment4.Fragment4_5;
import com.tax.mystar.kondha.fragment4.Fragment4_6;
import com.tax.mystar.kondha.fragment4.Fragment4_7;
import com.tax.mystar.kondha.fragment4.Fragment4_8;
import com.tax.mystar.kondha.fragment4.Fragment4_9;
import com.tax.mystar.kondha.fragment5.Fragment5_0;
import com.tax.mystar.kondha.fragment5.Fragment5_1;
import com.tax.mystar.kondha.fragment5.Fragment5_10;
import com.tax.mystar.kondha.fragment5.Fragment5_11;
import com.tax.mystar.kondha.fragment5.Fragment5_2;
import com.tax.mystar.kondha.fragment5.Fragment5_3;
import com.tax.mystar.kondha.fragment5.Fragment5_4;
import com.tax.mystar.kondha.fragment5.Fragment5_5;
import com.tax.mystar.kondha.fragment5.Fragment5_6;
import com.tax.mystar.kondha.fragment5.Fragment5_7;
import com.tax.mystar.kondha.fragment5.Fragment5_8;
import com.tax.mystar.kondha.fragment5.Fragment5_9;
import com.tax.mystar.kondha.fragment6.Fragment6_0;
import com.tax.mystar.kondha.fragment6.Fragment6_1;
import com.tax.mystar.kondha.fragment6.Fragment6_10;
import com.tax.mystar.kondha.fragment6.Fragment6_11;
import com.tax.mystar.kondha.fragment6.Fragment6_2;
import com.tax.mystar.kondha.fragment6.Fragment6_3;
import com.tax.mystar.kondha.fragment6.Fragment6_4;
import com.tax.mystar.kondha.fragment6.Fragment6_5;
import com.tax.mystar.kondha.fragment6.Fragment6_6;
import com.tax.mystar.kondha.fragment6.Fragment6_7;
import com.tax.mystar.kondha.fragment6.Fragment6_8;
import com.tax.mystar.kondha.fragment6.Fragment6_9;

import java.util.ArrayList;

/**
 * Created by My Star on 9/20/2016.
 */
public class ScreenSlidePagerActivity extends FragmentActivity {
    private RelativeLayout relFloatingBar;
    private boolean judgeFloating;

    private ViewPager mPager;
    private PagerTitleStrip titleStrip;
    private String                  type;
    private FragmentPagerAdapter    fragmentPager;  //UPDATE

    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 84;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
//    int currentPage = 0;
//    public static int currentmoodid;

    private ImageButton imageBtnLeft;
    private ImageButton imageBtnRight;

    private Button btnHome;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;

    public final int NUM_OF_LINEAR_TAG= 7;
    public final int NUM_OF_LINEAR_SUBTAG= 12;

    private int[] linearTagId = { R.id.linearTag0, R.id.linearTag1, R.id.linearTag2,
                                  R.id.linearTag3, R.id.linearTag4, R.id.linearTag5, R.id.linearTag6,};

    private int[] linearSubTagId = { R.id.linearSubTag0, R.id.linearSubTag1,  R.id.linearSubTag2,
                                     R.id.linearSubTag3, R.id.linearSubTag4,  R.id.linearSubTag5,
                                     R.id.linearSubTag6, R.id.linearSubTag7,  R.id.linearSubTag8,
                                     R.id.linearSubTag9, R.id.linearSubTag10, R.id.linearSubTag11, };

    private LinearLayout[] linearTag;
    private LinearLayout[] linearSubTag;

    public static int tagNum;
    public static int subtagNum;

    public static boolean judgeContinue;

    private final int sdk = android.os.Build.VERSION.SDK_INT;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_slide);

        initeWidget();
        resetWidget();

       /* mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//                Toast.makeText(getApplicationContext(), mPager.getCurrentItem() + ": okay!", Toast.LENGTH_SHORT).show();
                resetWidget();
                selectedPageDisplay(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }

        });*/

        mPager = (ViewPager) findViewById(R.id.pager);
        // Determine which type of sheet to create
        Intent intent = getIntent();
        this.type = intent.getStringExtra("type");
        FragmentManager manager = getSupportFragmentManager();
        mPager.setAdapter(new InstallAdapter(manager));
        fragmentPager = (FragmentPagerAdapter) mPager.getAdapter();  //UPDATE

        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                resetWidget();
                selectedPageDisplay(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        if(judgeContinue){
            SharedPreferences prefs = getSharedPreferences("MyShared", MODE_PRIVATE);
            tagNum = prefs.getInt("tagNum", 0);//
            subtagNum = prefs.getInt("subtagNum", 0); //0 is the default value.

            if(tagNum == 0 && subtagNum == 0){
                mPager.setCurrentItem(0);
                selectedPageDisplay(0);
            } else {
                mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + subtagNum);
            }
        } else {
            selectedPageDisplay(0);
        }

        OnClickTag();
        OnClickSubTag();
        OnClickButtons();

//        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();*/
//
//                if(judgeFloating) {
//                    judgeFloating = false;
//                    relFloatingBar.setVisibility(View.INVISIBLE);
//                    fab.setImageResource(R.drawable.plus100);
//                } else {
//                    judgeFloating = true;
//                    relFloatingBar.setVisibility(View.VISIBLE);
//                    fab.setImageResource(R.drawable.back_nav);
//                }
//
//            }
//        });
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }


    private void initeWidget() {
        relFloatingBar = (RelativeLayout) findViewById(R.id.relFloatingBar);

        imageBtnLeft = (ImageButton) findViewById(R.id.imageBtnLeft);
        imageBtnRight = (ImageButton) findViewById(R.id.imageBtnRight);

        btnHome = (Button) findViewById(R.id.btnHome);

        linearTag = new LinearLayout[NUM_OF_LINEAR_TAG];
        linearSubTag = new LinearLayout[NUM_OF_LINEAR_SUBTAG];
        for (int i = 0; i < NUM_OF_LINEAR_TAG; i++)
            linearTag[i] = (LinearLayout) findViewById(linearTagId[i]);

        for (int i = 0; i < NUM_OF_LINEAR_SUBTAG; i++)
            linearSubTag[i] = (LinearLayout) findViewById(linearSubTagId[i]);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void resetWidget() {
        judgeFloating = false;

        tagNum = 0;
        subtagNum = 0;

        for(int i = 0; i < NUM_OF_LINEAR_SUBTAG ; i++){
            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                linearSubTag[i].setBackgroundDrawable( getResources().getDrawable(R.drawable.sub_off) );
            } else {
                linearSubTag[i].setBackground( getResources().getDrawable(R.drawable.sub_off));
            }
        }

        for(int i = 1; i < NUM_OF_LINEAR_TAG - 1 ; i++){
            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                linearTag[i].setBackgroundColor(getResources().getColor(R.color.colorTag1));
            } else {
                linearTag[i].setBackgroundColor(getResources().getColor(R.color.colorTag1));
            }
        }

        if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            linearTag[0].setBackgroundColor(getResources().getColor(R.color.colorStart));
            linearTag[6].setBackgroundColor(getResources().getColor(R.color.colorStart));
        } else {
            linearTag[0].setBackgroundColor(getResources().getColor(R.color.colorStart));
            linearTag[6].setBackgroundColor(getResources().getColor(R.color.colorStart));
        }
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void selectedPageDisplay (int selectedNum) {
        int tagNum = selectedNum / NUM_OF_LINEAR_SUBTAG;
        int subtagNum = selectedNum % NUM_OF_LINEAR_SUBTAG;

        this.tagNum = tagNum;
        this.subtagNum = subtagNum;

        SharedPreferences.Editor editor = getSharedPreferences("MyShared", MODE_PRIVATE).edit();
//        editor.putInt("fragNum", fragNum);
        editor.putInt("tagNum", tagNum);
        editor.putInt("subtagNum", subtagNum);
        editor.commit();

        if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            linearTag[tagNum].setBackgroundColor(getResources().getColor(R.color.colorOn));
            linearSubTag[subtagNum].setBackgroundDrawable( getResources().getDrawable(R.drawable.sub_on) );
        } else {
            linearTag[tagNum].setBackgroundColor(getResources().getColor(R.color.colorOn));
            linearSubTag[subtagNum].setBackground( getResources().getDrawable(R.drawable.sub_on));
        }
    }

    private void OnClickTag(){
        linearTag[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(0);
                tagNum = 0;
            }
        });

        linearTag[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(12);
                tagNum = 1;
            }
        });

        linearTag[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(24);
                tagNum = 2;
            }
        });

        linearTag[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(36);
                tagNum = 3;
            }
        });

        linearTag[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(48);
                tagNum = 4;
            }
        });

        linearTag[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(60);
                tagNum = 5;
            }
        });

        linearTag[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(72);
                tagNum = 6;
            }
        });
    }

    private void OnClickSubTag(){
        linearSubTag[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG);
                subtagNum = 0;
            }
        });

        linearSubTag[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + 1);
                subtagNum = 1;
            }
        });

        linearSubTag[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + 2);
                subtagNum = 2;
            }
        });

        linearSubTag[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + 3);
                subtagNum = 3;
            }
        });

        linearSubTag[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + 4);
                subtagNum = 4;
            }
        });

        linearSubTag[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + 5);
                subtagNum = 5;
            }
        });

        linearSubTag[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + 6);
                subtagNum = 6;
            }
        });

        linearSubTag[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + 7);
                subtagNum = 7;
            }
        });

        linearSubTag[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + 8);
                subtagNum = 8;
            }
        });

        linearSubTag[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + 9);
                subtagNum = 9;
            }
        });

        linearSubTag[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + 10);
                subtagNum = 10;
            }
        });

        linearSubTag[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtagNum = 11;
                mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + subtagNum);
            }
        });
    }

    private void OnClickButtons() {
        imageBtnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(subtagNum == 0) {
                    if(tagNum > 0){
                        tagNum--;
                        subtagNum = NUM_OF_LINEAR_SUBTAG - 1;
                        mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + subtagNum);
                    }
                } else {
                    subtagNum--;
                    mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + subtagNum);
                }
            }
        });

        imageBtnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(subtagNum == NUM_OF_LINEAR_SUBTAG - 1) {
                    if(tagNum < NUM_OF_LINEAR_TAG - 1){
                        tagNum++;
                        subtagNum = 0;
                        mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + subtagNum);
                    }
                } else {
                    subtagNum++;
                    mPager.setCurrentItem(tagNum * NUM_OF_LINEAR_SUBTAG + subtagNum);
                }
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScreenSlidePagerActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return new ScreenSlidePageFragment();
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }

    @Override
    public void onResume() {
        super.onResume();

//        fragmentPager.getItem(0).setText("something"); //UPDATE
    }

    //Declare your values for activity;
    ISetTextInFragment setText0;
    ISetTextInFragment setText1;
    ISetTextInFragment setText2;
    ISetTextInFragment setText3;
    ISetTextInFragment setText4;

    //Add interface
    public interface ISetTextInFragment{
        public abstract void showText(String testToShow);
    }

    class InstallAdapter extends FragmentPagerAdapter {

        private final String[]      TITLES      = { "Title1", "Title2", "Title1", "Title2", "Title1",
                "Title1", "Title2", "Title1", "Title2", "Title1",
                                                    "Title2", "Title2", "Title1", "Title2", "Title1",
                "Title2", "Title2", "Title1", "Title2", "Title1",
                                                    "Title3", "Title2", "Title1", "Title2", "Title1",
                "Title3", "Title2", "Title1", "Title2", "Title1",
                                                    "Title4", "Title2", "Title1", "Title2", "Title1",
                "Title4", "Title2", "Title1", "Title2", "Title1",
                                                    "Title5", "Title2", "Title1", "Title2", "Title1",
                "Title5", "Title2", "Title1", "Title2", "Title1",
                                                    "Title6", "Title2", "Title1", "Title2", "Title1",
                "Title6", "Title2", "Title1", "Title2", "Title1",
                                                    "Title7", "Title2", "Title1", "Title2", "Title1",
                "Title7", "Title2", "Title1", "Title2", "Title1",
                                                    "Title8", "Title2", "Title1", "Title2", "Title1",
                "Title8", "Title2", "Title1", "Title2", "Title1",
                                                    "Title2", "Title1", "Title2", "Title2" };
        private final int           PAGE_COUNT  = TITLES.length;
        private ArrayList<Fragment> FRAGMENTS   = null;


        @Override
        public Fragment getItem(int pos) {
            return FRAGMENTS.get(pos);
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public CharSequence getPageTitle(int pos) {
            return TITLES[pos];
        }

        public InstallAdapter(FragmentManager fm) {
            super(fm);

            addFragment0(fm);
            addFragment1(fm);
            addFragment2(fm);
            addFragment3(fm);
            addFragment4(fm);
            addFragment5(fm);
            addFragment6(fm);
        }

        private void addFragment0(FragmentManager fm){
            FRAGMENTS = new ArrayList<Fragment>();

            Fragment frag0 = new Fragment0_0();
            FRAGMENTS.add(frag0);

            Fragment frag1 = new Fragment0_1();
            FRAGMENTS.add(frag1);

            Fragment frag2 = new Fragment0_2();
            FRAGMENTS.add(frag2);

            Fragment frag3 = new Fragment0_3();
            FRAGMENTS.add(frag3);

            Fragment frag4 = new Fragment0_4();
            FRAGMENTS.add(frag4);

            Fragment frag5 = new Fragment0_5();
            FRAGMENTS.add(frag5);

            Fragment frag6 = new Fragment0_6();
            FRAGMENTS.add(frag6);

            Fragment frag7 = new Fragment0_7();
            FRAGMENTS.add(frag7);

            Fragment frag8 = new Fragment0_8();
            FRAGMENTS.add(frag8);

            Fragment frag9 = new Fragment0_9();
            FRAGMENTS.add(frag9);

            Fragment frag10 = new Fragment0_10();
            FRAGMENTS.add(frag10);

            Fragment frag11 = new Fragment0_11();
            FRAGMENTS.add(frag11);
        }

        private void addFragment1(FragmentManager fm){
            Fragment frag0 = new Fragment1_0();
            FRAGMENTS.add(frag0);

            Fragment frag1 = new Fragment1_1();
            FRAGMENTS.add(frag1);

            Fragment frag2 = new Fragment1_2();
            FRAGMENTS.add(frag2);

            Fragment frag3 = new Fragment1_3();
            FRAGMENTS.add(frag3);

            Fragment frag4 = new Fragment1_4();
            FRAGMENTS.add(frag4);

            Fragment frag5 = new Fragment1_5();
            FRAGMENTS.add(frag5);

            Fragment frag6 = new Fragment1_6();
            FRAGMENTS.add(frag6);

            Fragment frag7 = new Fragment1_7();
            FRAGMENTS.add(frag7);

            Fragment frag8 = new Fragment1_8();
            FRAGMENTS.add(frag8);

            Fragment frag9 = new Fragment1_9();
            FRAGMENTS.add(frag9);

            Fragment frag10 = new Fragment1_10();
            FRAGMENTS.add(frag10);

            Fragment frag11 = new Fragment1_11();
            FRAGMENTS.add(frag11);
        }

        private void addFragment2(FragmentManager fm){
            Fragment frag0 = new Fragment2_0();
            FRAGMENTS.add(frag0);

            Fragment frag1 = new Fragment2_1();
            FRAGMENTS.add(frag1);

            Fragment frag2 = new Fragment2_2();
            FRAGMENTS.add(frag2);

            Fragment frag3 = new Fragment2_3();
            FRAGMENTS.add(frag3);

            Fragment frag4 = new Fragment2_4();
            FRAGMENTS.add(frag4);

            Fragment frag5 = new Fragment2_5();
            FRAGMENTS.add(frag5);

            Fragment frag6 = new Fragment2_6();
            FRAGMENTS.add(frag6);

            Fragment frag7 = new Fragment2_7();
            FRAGMENTS.add(frag7);

            Fragment frag8 = new Fragment2_8();
            FRAGMENTS.add(frag8);

            Fragment frag9 = new Fragment2_9();
            FRAGMENTS.add(frag9);

            Fragment frag10 = new Fragment2_10();
            FRAGMENTS.add(frag10);

            Fragment frag11 = new Fragment2_11();
            FRAGMENTS.add(frag11);
        }

        private void addFragment3(FragmentManager fm){
            Fragment frag0 = new Fragment3_0();
            FRAGMENTS.add(frag0);

            Fragment frag1 = new Fragment3_1();
            FRAGMENTS.add(frag1);

            Fragment frag2 = new Fragment3_2();
            FRAGMENTS.add(frag2);

            Fragment frag3 = new Fragment3_3();
            FRAGMENTS.add(frag3);

            Fragment frag4 = new Fragment3_4();
            FRAGMENTS.add(frag4);

            Fragment frag5 = new Fragment3_5();
            FRAGMENTS.add(frag5);

            Fragment frag6 = new Fragment3_6();
            FRAGMENTS.add(frag6);

            Fragment frag7 = new Fragment3_7();
            FRAGMENTS.add(frag7);

            Fragment frag8 = new Fragment3_8();
            FRAGMENTS.add(frag8);

            Fragment frag9 = new Fragment3_9();
            FRAGMENTS.add(frag9);

            Fragment frag10 = new Fragment3_10();
            FRAGMENTS.add(frag10);

            Fragment frag11 = new Fragment3_11();
            FRAGMENTS.add(frag11);
        }

        private void addFragment4(FragmentManager fm){
            Fragment frag0 = new Fragment4_0();
            FRAGMENTS.add(frag0);

            Fragment frag1 = new Fragment4_1();
            FRAGMENTS.add(frag1);

            Fragment frag2 = new Fragment4_2();
            FRAGMENTS.add(frag2);

            Fragment frag3 = new Fragment4_3();
            FRAGMENTS.add(frag3);

            Fragment frag4 = new Fragment4_4();
            FRAGMENTS.add(frag4);

            Fragment frag5 = new Fragment4_5();
            FRAGMENTS.add(frag5);

            Fragment frag6 = new Fragment4_6();
            FRAGMENTS.add(frag6);

            Fragment frag7 = new Fragment4_7();
            FRAGMENTS.add(frag7);

            Fragment frag8 = new Fragment4_8();
            FRAGMENTS.add(frag8);

            Fragment frag9 = new Fragment4_9();
            FRAGMENTS.add(frag9);

            Fragment frag10 = new Fragment4_10();
            FRAGMENTS.add(frag10);

            Fragment frag11 = new Fragment4_11();
            FRAGMENTS.add(frag11);
        }

        private void addFragment5(FragmentManager fm){
            Fragment frag0 = new Fragment5_0();
            FRAGMENTS.add(frag0);

            Fragment frag1 = new Fragment5_1();
            FRAGMENTS.add(frag1);

            Fragment frag2 = new Fragment5_2();
            FRAGMENTS.add(frag2);

            Fragment frag3 = new Fragment5_3();
            FRAGMENTS.add(frag3);

            Fragment frag4 = new Fragment5_4();
            FRAGMENTS.add(frag4);

            Fragment frag5 = new Fragment5_5();
            FRAGMENTS.add(frag5);

            Fragment frag6 = new Fragment5_6();
            FRAGMENTS.add(frag6);

            Fragment frag7 = new Fragment5_7();
            FRAGMENTS.add(frag7);

            Fragment frag8 = new Fragment5_8();
            FRAGMENTS.add(frag8);

            Fragment frag9 = new Fragment5_9();
            FRAGMENTS.add(frag9);

            Fragment frag10 = new Fragment5_10();
            FRAGMENTS.add(frag10);

            Fragment frag11 = new Fragment5_11();
            FRAGMENTS.add(frag11);
        }

        private void addFragment6(FragmentManager fm){
            Fragment frag0 = new Fragment6_0();
            FRAGMENTS.add(frag0);

            Fragment frag1 = new Fragment6_1();
            FRAGMENTS.add(frag1);

            Fragment frag2 = new Fragment6_2();
            FRAGMENTS.add(frag2);

            Fragment frag3 = new Fragment6_3();
            FRAGMENTS.add(frag3);

            Fragment frag4 = new Fragment6_4();
            FRAGMENTS.add(frag4);

            Fragment frag5 = new Fragment6_5();
            FRAGMENTS.add(frag5);

            Fragment frag6 = new Fragment6_6();
            FRAGMENTS.add(frag6);

            Fragment frag7 = new Fragment6_7();
            FRAGMENTS.add(frag7);

            Fragment frag8 = new Fragment6_8();
            FRAGMENTS.add(frag8);

            Fragment frag9 = new Fragment6_9();
            FRAGMENTS.add(frag9);

            Fragment frag10 = new Fragment6_10();
            FRAGMENTS.add(frag10);

            Fragment frag11 = new Fragment6_11();
            FRAGMENTS.add(frag11);
        }
    }


}
