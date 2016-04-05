package www.pointed.com.counter;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.concurrent.TimeUnit;

public class Schedulr extends AppCompatActivity implements OnClickListener {

    private static final String tag = "Main";
    public MalibuCountDownTimer countDownTimer;
    private boolean timerHasStarted = false;
    private Button startB;
    private TextView text;
    private TextView timeElapsedView;

    Context mContext;

    private final long startTime = 50000;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedulr);
        startB = (Button) this.findViewById(R.id.button);
        startB.setOnClickListener(this);

        mContext = Schedulr.this;


        text = (TextView) this.findViewById(R.id.timer);
        timeElapsedView = (TextView) this.findViewById(R.id.timeElapsed);
        long interval = 1000;
        countDownTimer = new MalibuCountDownTimer(startTime, interval);
        text.setText(text.getText() + String.valueOf(startTime));
    }

    @Override
    public void onClick(View v) {
        if (!timerHasStarted) {
            countDownTimer.start();
            timerHasStarted = true;
            startB.setText("Start");
        } else {

            countDownTimer.cancel();
            timerHasStarted = false;
            startB.setText("RESET");
        }
    }

    // CountDownTimer class
    public static class MalibuCountDownTimer extends CountDownTimer {

        private BreakIterator timeElapsedView;
        private BreakIterator text;
        private long startTime;

        public MalibuCountDownTimer(long startTime, long interval) {
            super(startTime, interval);
        }

        @Override
        public void onFinish() {
            text.setText("Time's up!");
            timeElapsedView.setText("Time Elapsed:\n" +
                    "             " + String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(startTime),
                    TimeUnit.MILLISECONDS.toSeconds(startTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(startTime))));
        }


        @Override
        public void onTick(long millisUntilFinished) {
            text.setText("Time remain:\n" +
                    "            " + String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
                    TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            long timeElapsed = startTime - millisUntilFinished;
            timeElapsedView.setText("Time Elapsed: \n" +
                    "            " + String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(timeElapsed),
                    TimeUnit.MILLISECONDS.toSeconds(timeElapsed) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(timeElapsed))));
        }
    }
}
  /*  SampleAlarmReceiver alarm = new SampleAlarmReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // Menu options to set and cancel the alarm.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // When the user clicks START ALARM, set the alarm.
            case R.id.start_action:
                alarm.setAlarm(this);
                return true;
            // When the user clicks CANCEL ALARM, cancel the alarm.
            case R.id.cancel_action:
                alarm.cancelAlarm(this);
                return true;
        }
        return false;
    }}
*/