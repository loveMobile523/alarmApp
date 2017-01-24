package com.tax.mystar.kondha.alert;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.tax.mystar.kondha.MainActivity;
import com.tax.mystar.kondha.R;
import com.tax.mystar.kondha.alarm.Alarm;

import java.util.Calendar;

/**
 * Created by My Star on 9/30/2016.
 */
public class ReminderAlertActivity extends Activity implements View.OnClickListener {

    private Alarm alarm;
    private MediaPlayer mediaPlayer;

    private Vibrator vibrator;

    private boolean alarmActive;

    private TextView textAlarmTitle;
    private TextView textHourAndMin;

    private Button btnDismiss;
    private Button btnOpenApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Window window = getWindow();
        //disable the keyboard
        window.addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED
                | WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);

        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
                | WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
        //when alarm is ringing...
        setContentView(R.layout.activity_reminder_alert);

        Bundle bundle = this.getIntent().getExtras();
        alarm = (Alarm) bundle.getSerializable("alarm");

        this.setTitle(alarm.getAlarmName());

        initWidget();

        //set in order to ring the music embeded on phone
        TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);

        PhoneStateListener phoneStateListener = new PhoneStateListener() {
            @Override
            public void onCallStateChanged(int state, String incomingNumber) {
                switch (state) {

                    case TelephonyManager.CALL_STATE_RINGING:
                        Log.d(getClass().getSimpleName(), "Incoming call: " + incomingNumber);
                        try {
                            mediaPlayer.pause();
                        } catch (IllegalStateException e) {

                        }
                        break;
                    case TelephonyManager.CALL_STATE_IDLE:
                        Log.d(getClass().getSimpleName(), "Call State Idle");
                        try {
                            mediaPlayer.start();
                        } catch (IllegalStateException e) {

                        }
                        break;
                }
                super.onCallStateChanged(state, incomingNumber);
            }
        };
        // make the call state
        telephonyManager.listen(phoneStateListener, PhoneStateListener.LISTEN_CALL_STATE);

        // Toast.makeText(this, answerString, Toast.LENGTH_LONG).show();
        startAlarm();
    }

    private void initWidget(){
        textAlarmTitle = (TextView) findViewById(R.id.textAlarmTitle);
        textHourAndMin = (TextView) findViewById(R.id.textHourAndMin);
        btnDismiss = (Button)findViewById(R.id.btnDismiss);
        btnOpenApp = (Button)findViewById(R.id.btnOpenApp);

        final Calendar c = Calendar.getInstance();
        textHourAndMin.setText(String.valueOf(c.get(Calendar.HOUR)) + ":" + String.valueOf(c.get(Calendar.MINUTE)));

        textAlarmTitle.setText(alarm.getAlarmName());

        btnOpenApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReminderAlertActivity.this, MainActivity.class));
                finish();
            }
        });

        btnDismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!alarmActive)
                    return;
                String button = (String) v.getTag();
                v.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);

                alarmActive = false;
                if (vibrator != null)
                    vibrator.cancel();
                try {
                    mediaPlayer.stop();
                } catch (IllegalStateException ise) {

                }
                try {
                    mediaPlayer.release();
                } catch (Exception e) {

                }
                finish();
//                this.finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        alarmActive = true;
    }

    private void startAlarm() {

        if (alarm.getAlarmTonePath() != "") {
            mediaPlayer = new MediaPlayer();
            if (alarm.getVibrate()) {
                vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                long[] pattern = { 1000, 200, 200, 200 };
                vibrator.vibrate(pattern, 0);
            }
            try {
                mediaPlayer.setVolume(1.0f, 1.0f);
                mediaPlayer.setDataSource(this,
                        Uri.parse(alarm.getAlarmTonePath()));
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_ALARM);
                mediaPlayer.setLooping(true);
                mediaPlayer.prepare();
                mediaPlayer.start();

            } catch (Exception e) {
                mediaPlayer.release();
                alarmActive = false;
            }
        }
    }

    @Override
    public void onBackPressed() {
        if (!alarmActive)
            super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        StaticWakeLock.lockOff(this);
    }

    @Override
    protected void onDestroy() {
        try {
            if (vibrator != null)
                vibrator.cancel();
        } catch (Exception e) {

        }
        try {
            mediaPlayer.stop();
        } catch (Exception e) {

        }
        try {
            mediaPlayer.release();
        } catch (Exception e) {

        }
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
//        if (!alarmActive)
//            return;
//        String button = (String) v.getTag();
//        v.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
//
//        alarmActive = false;
//        if (vibrator != null)
//            vibrator.cancel();
//        try {
//            mediaPlayer.stop();
//        } catch (IllegalStateException ise) {
//
//        }
//        try {
//            mediaPlayer.release();
//        } catch (Exception e) {
//
//        }
//        this.finish();
    }
}