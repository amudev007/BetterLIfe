package www.pointed.com.counter;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import www.pointed.com.counter.utils.Common;

public class MainActivity extends AppCompatActivity {

    public Context mContext;

    public Integer lovec;
    public Integer depressionc;
    public Integer fitnessc;
    public Integer socialc;
    public Integer concentrationc;
    public Integer moodc;

    TextView love;
    TextView fitness;
    TextView social;
    TextView concentration;
    TextView mood;
    TextView depression;

    public Integer loves;
    public Integer socialv;
    public Integer depressionv;
    public Integer fitnessv;
    public Integer moodv;

    public Integer concentrationv;
    public Integer lovest;

    public Integer socialt;
    public Integer depressiont;
    public Integer fitnesst;
    public Integer moodt;

    public Integer concentrationt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fitness = (TextView) findViewById(R.id.fitness);
        love = (TextView) findViewById(R.id.love);
        social = (TextView) findViewById(R.id.social);
        concentration = (TextView) findViewById(R.id.concentration);
        mood = (TextView) findViewById(R.id.mood);
        depression = (TextView) findViewById(R.id.depression);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mContext = MainActivity.this;
        Common.showAlertDialog(mContext,Integer.toString(R.string.intro_messageScore),"Trading Started", true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        FloatingActionButton fabm = (FloatingActionButton) findViewById(R.id.fabm);
        FloatingActionButton fabd = (FloatingActionButton) findViewById(R.id.fabd);

        depressionc = Common.getIntPrefrences(mContext, "depressionPref", getString(R.string.depression));

        depression.setText(Integer.toString(depressionc));

        fitnessc = Common.getIntPrefrences(mContext, "fitnessPref", getString(R.string.fitness));

        fitness.setText(Integer.toString(fitnessc));

        moodc = Common.getIntPrefrences(mContext, "moodPref", getString(R.string.mood));

        mood.setText(Integer.toString(moodc));

        socialc = Common.getIntPrefrences(mContext, "socialPref", getString(R.string.social));

        social.setText(Integer.toString(socialc));

        concentrationc = Common.getIntPrefrences(mContext, "concentrationPref", getString(R.string.concentration));

        concentration.setText(Integer.toString(concentrationc));

        lovec = Common.getIntPrefrences(mContext, "lovePref", getString(R.string.loves));

        love.setText(Integer.toString(lovec));


/*        private final int interval = 1000; // 1 Second
        private Handler handler = new Handler();
        private Runnable runnable = new Runnable(){
            public void run() {
                Toast.makeText(MainActivity.this, "C'Mom no hands!", Toast.LENGTH_SHORT).show();
            }
        };
        handler.postAtTime(runnable, System.currentTimeMillis()+interval);
        handler.postDelayed(runnable, interval);*/


        fabm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent;
                intent = new Intent(MainActivity.this, MyPlayG.class);
                startActivity(intent);
            }

        });


        fab.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View view) {
                                       Common.showAlertDialog(mContext, "Please Be Careful", getString(R.string.five), false);

                                   }
                               }
        );
        fabd.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View view) {
                                       Common.showAlertDialog(mContext, "Reset To zero Alert", getString(R.string.zero), false);

                                   }
                               }
        );

        fab.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View view) {

                loves = Common.getIntPrefrences(mContext, "lovePref", getString(R.string.loves));
                lovest = loves - 5;
                Common.setIntPrefrences(mContext, "lovePref", lovest, getString(R.string.loves));

                moodv = Common.getIntPrefrences(mContext, "moodPref", getString(R.string.mood));
                moodt = moodv - 5;
                Common.setIntPrefrences(mContext, "moodPref", moodt, getString(R.string.mood));

                concentrationv = Common.getIntPrefrences(mContext, "concentrationPref", getString(R.string.concentration));
                concentrationt = concentrationv - 5;
                Common.setIntPrefrences(mContext, "concentrationPref", concentrationt, getString(R.string.concentration));

                depressionv = Common.getIntPrefrences(mContext, "depressionPref", getString(R.string.depression));
                depressiont = depressionv - 5;
                Common.setIntPrefrences(mContext, "depressionPref", depressiont, getString(R.string.depression));

                fitnessv = Common.getIntPrefrences(mContext, "fitnessPref", getString(R.string.fitness));
                fitnesst = fitnessv - 5;
                Common.setIntPrefrences(mContext, "fitnessPref", fitnesst, getString(R.string.fitness));

                socialv = Common.getIntPrefrences(mContext, "socialPref", getString(R.string.social));
                socialt = socialv - 5;
                Common.setIntPrefrences(mContext, "socialPref", socialt, getString(R.string.social));

/*  update textview*/

                depressionc = Common.getIntPrefrences(mContext, "depressionPref", getString(R.string.depression));

                depression.setText(Integer.toString(depressionc));

                fitnessc = Common.getIntPrefrences(mContext, "fitnessPref", getString(R.string.fitness));

                fitness.setText(Integer.toString(fitnessc));

                moodc = Common.getIntPrefrences(mContext, "moodPref", getString(R.string.mood));

                mood.setText(Integer.toString(moodc));

                socialc = Common.getIntPrefrences(mContext, "socialPref", getString(R.string.social));

                social.setText(Integer.toString(socialc));

                concentrationc = Common.getIntPrefrences(mContext, "concentrationPref", getString(R.string.concentration));

                concentration.setText(Integer.toString(concentrationc));

                lovec = Common.getIntPrefrences(mContext, "lovePref", getString(R.string.loves));

                love.setText(Integer.toString(lovec));

                return true;
            }

        });


        fabd.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                    Common.upIntPrefrences(mContext, "depressionPref", getString(R.string.depression));
                    Common.upIntPrefrences(mContext, "depressionPref", getString(R.string.fitness));
                    Common.upIntPrefrences(mContext, "depressionPref", getString(R.string.social));
                    Common.upIntPrefrences(mContext, "depressionPref", getString(R.string.concentration));
                    Common.upIntPrefrences(mContext, "depressionPref", getString(R.string.mood));
                    Common.upIntPrefrences(mContext, "depressionPref", getString(R.string.loves));

                    fitness = (TextView) findViewById(R.id.fitness);
                    love = (TextView) findViewById(R.id.love);
                    social = (TextView) findViewById(R.id.social);
                    concentration = (TextView) findViewById(R.id.concentration);
                    mood = (TextView) findViewById(R.id.mood);
                    depression = (TextView) findViewById(R.id.depression);

    //                set Updated

                    depressionc = Common.getIntPrefrences(mContext, "depressionPref", getString(R.string.depression));

                    depression.setText(Integer.toString(depressionc));

                    fitnessc = Common.getIntPrefrences(mContext, "fitnessPref", getString(R.string.fitness));

                    fitness.setText(Integer.toString(fitnessc));

                    moodc = Common.getIntPrefrences(mContext, "moodPref", getString(R.string.mood));

                    mood.setText(Integer.toString(moodc));

                    socialc = Common.getIntPrefrences(mContext, "socialPref", getString(R.string.social));

                    social.setText(Integer.toString(socialc));

                    concentrationc = Common.getIntPrefrences(mContext, "concentrationPref", getString(R.string.concentration));

                    concentration.setText(Integer.toString(concentrationc));

                    lovec = Common.getIntPrefrences(mContext, "lovePref", getString(R.string.loves));

                    love.setText(Integer.toString(lovec));

                    return true;
                }


        });



    }


    @Override
    protected void onResume() {
        super.onResume();

        depressionc = Common.getIntPrefrences(mContext, "depressionPref", getString(R.string.depression));

        depression.setText(Integer.toString(depressionc));

        fitnessc = Common.getIntPrefrences(mContext, "fitnessPref", getString(R.string.fitness));

        fitness.setText(Integer.toString(fitnessc));

        moodc = Common.getIntPrefrences(mContext, "moodPref", getString(R.string.mood));

        mood.setText(Integer.toString(moodc));

        socialc = Common.getIntPrefrences(mContext, "socialPref", getString(R.string.social));

        social.setText(Integer.toString(socialc));

        concentrationc = Common.getIntPrefrences(mContext, "concentrationPref", getString(R.string.concentration));

        concentration.setText(Integer.toString(concentrationc));

        lovec = Common.getIntPrefrences(mContext, "lovePref", getString(R.string.loves));

        love.setText(Integer.toString(lovec));

    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(MainActivity.this, "Do You Really Want to Exit Please Minimise Instead", Toast.LENGTH_SHORT).show();

        Intent intent;
        intent = new Intent(MainActivity.this, MyPlayG.class);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

// TODO: 01-Apr-16 Add alarm to do function every night
// TODO: 01-Apr-16 Search hoiw to add plain atring array into recyclerview
// TODO: 01-Apr-16 Search hoiw to add AppCompatActivity into recyclerview actionmode depreceasted
// TODO: 01-Apr-16 Search hoiw to add coordinate layoiut into actionm mode
// TODO: 01-Apr-16 Search liner layout Parameter of recycolerview
// TODO: 01-Apr-16 Add VAlues to List
// TODO: 01-Apr-16 Add Show Initial Description Button
// TODO: 01-Apr-16 Add Add Buy Now Details
// TODO: 01-Apr-16 Add Add Backup Button With Payment
// TODO: 01-Apr-16 Add Add CAll to Friend Button
// TODO: 01-Apr-16 Add Share Button Functionality
// TODO: 01-Apr-16 Add Alarm
// TODO: 01-Apr-16 Add Timer

// TODO: 01-Apr-16 add diary task -------------- Done M
// TODO: 01-Apr-16 Add Alert Dialogue on CLick Button -------------- Done M