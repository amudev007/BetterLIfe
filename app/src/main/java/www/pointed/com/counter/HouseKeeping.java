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
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import www.pointed.com.counter.utils.Common;

public class HouseKeeping extends AppCompatActivity {


    Context mContext;

    ListView sdkFunctionalityList;

    Integer social;
    Integer socialup;
    Integer socialdown;

    Integer depression;
    Integer depressionup;
    Integer depressiondown;

    Integer mood;
    Integer moodup;
    Integer mooddown;

    Integer love;
    Integer loveup;
    Integer lovedown;

    Integer fitness;
    Integer fitnessup;
    Integer fitnessdown;

    Integer concentration;
    Integer concentrationup;
    Integer concentrationdown;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeactm);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mContext = HouseKeeping.this;


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(mContext, MainActivity.class);
                startActivity(intent);

            }

        });


//        end of fab


        String[] sdkFunctionalityListValue = new String[]{

                "Read Book",                             /* 0 */
                "EFT",                                   /* 1 */
                "Exercise",                             /* 2 */
                "Drink Fresh Juice",                     /* 3 */
                "Drink Packed Juice",                     /* 4 */
                "Cleaning Up My Work Place",             /* 5 */
                "Clean House",                           /* 6 */
                "Yoga",                                     /* 7 */              

                "Meditation",                               /* 10 */             
                "Cooking",                                  /* 11 */             
                "Play Games On Phone",                     /* 12 */  
                "Visualise Psycho Cybernetics",            /* 13 */              
                "Drink Beer",                              /* 14 */              
                "Read Diary",                               /* 15 */             
                "Call Relative",                           /* 16 */              
                "Read Comedy Online",                         /* 17 */           
                "Watch New Movie.",                           /* 18 */           

                "Put Mung Beans",                           /* 22 */             
                "Use Fb",                                   /* 23 */             
                "Watch Comedy Show",                        /* 24 */             
                "DO SOMEHING 4 1st Time",             /* 25 */




        };
        sdkFunctionalityList = (ListView) findViewById(R.id.Md_list_company);
        sdkFunctionalityList.setBackgroundColor(getResources().getColor(R.color.colorB));
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this,
               R.layout.ggg, sdkFunctionalityListValue);
        sdkFunctionalityList.setAdapter(stringArrayAdapter);

        sdkFunctionalityList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                selectedListItem(position);
            }

        });

        sdkFunctionalityList.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

            }
        });


    }


    private void selectedListItem(int position) {


        switch (position) {
            case 0:
                increaseHconcentration();
                increaseMood();
                decreasefitness();
                decreaseLove();
                decreaseHSocial();
                decreaseHDepression();
                Common.showAlertDialog(mContext, "Reading Book Started", "1 Hour", false);
//// TODO: 26-Mar-16 Create Alarm After One Hour

//                ett = Common.getIntPrefrences(mContext, "intPref", getString(R.string.app_name));
//                Common.showAlertDialog(mContext, "Bhosdicha", Integer.toString(ett), false);

                break;
            case 1:
                //// TODO: 26-Mar-16 Create Timer
                increaseHMood();
                increaseHfitness();
                increaseHconcentration();
                decreaseHDepression();

//
//                vet = ett + 60;
//
//
//
//
//                Babu = Common.getIntPrefrences(mContext, "intPref", getString(R.string.app_name));
//
//                Common.showAlertDialog(mContext, "Bhosdicha", Integer.toString(Babu), false);


// // TODO: 23-Mar-16  create box to add todo or new activity for adding parameters like etc,
                break;
            case 2:
//// TODO: 26-Mar-16 Create Timer
                increaseHMood();
                increaseHfitness();
                increaseConcentration();
                decreaseLove();
                decreaseSocial();
                decreaseHDepression();

//                gtt =    Common.setIntPrefrences(mContext, "intPref", 50, getString(R.string.app_name));
//                Common.showAlertDialog(mContext, "Bhosdicha", Integer.toString(gtt), false);

                break;

            case 3:
                increaseHMood();
                increaseLove();
               increaseHfitness();
                decreaseConcentration();
                decreaseSocial();
                decreaseHDepression();

//                    Common.showAlertDialog(this, "", "Your device id is: " + Common.getDeviceId(mContext) + ".", false);
                break;
            case 4:
//// TODO: 26-Mar-16 Create Alarm After One Hour
                increaseHMood();
                decreaseHfitness();
                increaseHLove();
                increaseConcentration();
                decreaseHSocial();
                decreaseDepression();

//                    intent = new Intent(mContext, SetPrefAct.class);
                break;
            case 5:
                increaseHMood();
                increaseHfitness();
                decreaseHLove();
                increaseHconcentration();
                Toast.makeText(mContext, "Create Alarm After One Hour", Toast.LENGTH_LONG).show();
                

                increaseSocial();
                decreaseHDepression();

                break;
            case 6:
                Toast.makeText(mContext, "Create Timer", Toast.LENGTH_LONG).show();
    /*            "yoga",                          *//* 6 *//*
                        "Cartoon_watch",                      *//* 7 *//*
                        "Music_listen",                      *//* 8 *//*
                        "meditation",                            *//* 9 *//*
                        "cooking",                               *//* 10 *//*
                        "play_Games_on_phone",                   *//* 11 *//*
                        "psych_cybernetics",                     *//* 12 */
                increaseHMood();
                increaseHfitness();
                decreaseLove();
                increaseConcentration();
                increaseHSocial();
                decreaseDepression();
                break;
            case 7:
             Toast.makeText(HouseKeeping.this, "Create Alarm After One Hour", Toast.LENGTH_LONG).show();
                increaseHMood();
                increaseHDepression();
                decreaseHfitness();
                decreaseHLove();
                decreaseHconcentration();
                decreaseHSocial();
                break;
            case 8:
                Toast.makeText(mContext, "Create Alarm After 15 Hm", Toast.LENGTH_LONG).show();
                increaseMood();
                increaseHLove();
                decreaseConcentration();
                decreaseHfitness();
                decreaseHSocial();
                increaseDepression();
                break;
            case 9:
             Toast.makeText(HouseKeeping.this, "Create Alarm After One Hour", Toast.LENGTH_LONG).show();
                increaseMood();
                decreaseHconcentration();
                decreasefitness();
                increaseLove();
                decreaseSocial();
                decreaseHDepression();
                break;
            case 10:
                increaseHMood();
                increaseHconcentration();
                increasefitness();
                decreaseLove();
                increaseHSocial();
                decreaseHDepression();
                //// TODO: 26-Mar-16 Create Timer


//                    tvText.setText(Common.getRandomCharacter() + "");
                break;
            case 11:
                increaseHfitness();
                increaseHDepression();
                decreaseMood();
                increaseLove();
                decreaseConcentration();
                decreaseSocial();

                break;
            case 12:

                increaseMood();
                Toast.makeText(mContext, "Create Alarm After One Hour", Toast.LENGTH_LONG).show();
                increaseHDepression();

                decreasefitness();
                increaseLove();
                decreaseHconcentration();
                decreaseHSocial();



                break;
            case 13:
                Toast.makeText(HouseKeeping.this, "Create Alarm After One Hour", Toast.LENGTH_LONG).show();  Toast.makeText(HouseKeeping.this, "Create Alarm After One Hour", Toast.LENGTH_LONG).show();
                increaseHconcentration();
                decreaseHMood();
                decreasefitness();
                decreaseLove();
                decreaseSocial();
                decreaseHDepression();

                break;
            case 14:
                Toast.makeText(HouseKeeping.this, "Reward Received", Toast.LENGTH_LONG).show();
                increaseHMood();
                increaseHfitness();
                increaseDepression();
                increaseLove();
                decreaseHconcentration();
                decreaseHSocial();

                break;

            case 15:
                Toast.makeText(HouseKeeping.this, "Create Alarm After One Hour", Toast.LENGTH_LONG).show();
                increaseHMood();
                increaseHfitness();
                increaseConcentration();
                increaseDepression();
                increaseHLove();
                decreaseSocial();


                break;
            case 16:
                /*job of school 3k
                job of tiu 10k
                job of php 20k
                apps buisness unlimited
                trading unlimited
                the visualisation of auto driver worser of worst
                how much money can someone earn and the liberatioon of gicing away lmoney
                */
                Toast.makeText(HouseKeeping.this, "Reward Received", Toast.LENGTH_LONG).show();
                increaseHMood();
                increasefitness();
                decreaseLove();
                increaseHSocial();
                decreaseHconcentration();
                decreaseDepression();

                break;
            case 17:
                Toast.makeText(HouseKeeping.this, "Create Alarm After One Hour", Toast.LENGTH_LONG).show();

                increaseHMood();
                increaseHLove();
                decreaseHfitness();
                decreaseHconcentration();
                decreaseHSocial();
                decreaseHDepression();

                break;
            case 18:
                Toast.makeText(HouseKeeping.this, "Reward Received", Toast.LENGTH_LONG).show();
                increaseHMood();
                increaseHfitness();
                increaseHLove();
                increaseSocial();
                decreaseConcentration();
                decreaseHDepression();



                break;
            case 19:
                Toast.makeText(HouseKeeping.this, "Reward Received", Toast.LENGTH_LONG).show();
                increaseMood();
                increaseLove();
                decreaseHfitness();
                decreaseConcentration();
                decreaseHSocial();
                decreaseHDepression();

                break;
            case 20:

                increaseMood();
                increaseLove();
                decreaseHfitness();
                decreaseConcentration();
                decreaseHSocial();
                decreaseHDepression();


                break;
            case 21:
                Toast.makeText(HouseKeeping.this, "Reward Received", Toast.LENGTH_LONG).show();

                decreaseMood();
                decreaseLove();
                increaseHfitness();
                increaseConcentration();
                increaseHSocial();
                decreaseHDepression();



//todo show calculated days since installation
//                tvText.setText("Difference is " + Common.calculateDays(new Date("1/12/2014"), new Date("1/12/2015")));
                break;
            case 22:
                Toast.makeText(HouseKeeping.this, "Create Alarm After One Hour", Toast.LENGTH_LONG).show();
                increaseMood();
                increasefitness();
                increaseLove();
                increaseConcentration();
                increaseSocial();
                decreaseDepression();



//                tvText.setText("Date in milliseconds : " + Common.stringToDate("01/12/2014", "dd/MM/yyyy").getTime());
                break;
            case 23:
                Toast.makeText(HouseKeeping.this, "Create Alarm After One Hour", Toast.LENGTH_LONG).show();
                increaseMood();
                increaseLove();
                increaseSocial();
                increaseDepression();
                decreasefitness();
                decreaseConcentration();



//                tvText.setText("Date in milliseconds : " + Common.stringToDate("01/12/2014", "dd/MM/yyyy").getTime());
                break;
            case 24:
                Toast.makeText(HouseKeeping.this, "Create Alarm After One Hour", Toast.LENGTH_LONG).show();
                increaseMood();
                increaseLove();
                decreaseSocial();
                decreaseDepression();
                increasefitness();
                decreaseConcentration();



//                tvText.setText("Date in milliseconds : " + Common.stringToDate("01/12/2014", "dd/MM/yyyy").getTime());
                break;
            case 25:
                Toast.makeText(HouseKeeping.this, "Reward Received", Toast.LENGTH_LONG).show();
                increaseMood();
                increaseLove();
                increaseSocial();
                increaseDepression();
                increasefitness();
                increaseConcentration();



//                tvText.setText("Date in milliseconds : " + Common.stringToDate("01/12/2014", "dd/MM/yyyy").getTime());
                break;


        }

    }

    private void increaseDepression() {

        depression = Common.getIntPrefrences(mContext, "depressionPref", getString(R.string.depression));


        depressionup = depression + 5;

        Common.setIntPrefrences(mContext, "depressionPref", depressionup, getString(R.string.depression));


    }

    private void increaseSocial() {
        social = Common.getIntPrefrences(mContext, "socialPref", getString(R.string.social));


        socialup = social + 5;

        Common.setIntPrefrences(mContext, "socialPref", socialup, getString(R.string.social));
    }

    private void increaseConcentration() {
        concentration = Common.getIntPrefrences(mContext, "concentrationPref", getString(R.string.concentration));


        concentrationup = concentration + 5;

        Common.setIntPrefrences(mContext, "concentrationPref", concentrationup, getString(R.string.concentration));
    }

    private void increaseLove() {
        love = Common.getIntPrefrences(mContext, "lovePref", getString(R.string.loves));


        loveup = love + 5;

        Common.setIntPrefrences(mContext, "lovePref", loveup, getString(R.string.loves));
    }


    private void increasefitness() {
        fitness = Common.getIntPrefrences(mContext, "fitnessPref", getString(R.string.fitness));


        fitnessup = fitness + 5;

        Common.setIntPrefrences(mContext, "fitnessPref", fitnessup, getString(R.string.fitness));

    }

    private void increaseMood() {
        mood = Common.getIntPrefrences(mContext, "moodPref", getString(R.string.mood));


        moodup = mood + 5;

        Common.setIntPrefrences(mContext, "moodPref", moodup, getString(R.string.mood));
    }

//    decrease

    private void decreaseDepression() {

        depression = Common.getIntPrefrences(mContext, "depressionPref", getString(R.string.depression));


        depressiondown = depression - 5;

        Common.setIntPrefrences(mContext, "depressionPref", depressiondown, getString(R.string.depression));


    }

    private void decreaseSocial() {
        social = Common.getIntPrefrences(mContext, "socialPref", getString(R.string.social));


        socialdown = social - 5;

        Common.setIntPrefrences(mContext, "socialPref", socialdown, getString(R.string.social));
    }

    private void decreaseConcentration() {
        concentration = Common.getIntPrefrences(mContext, "concentrationPref", getString(R.string.concentration));


        concentrationdown = concentration - 5;

        Common.setIntPrefrences(mContext, "concentrationPref", concentrationdown, getString(R.string.concentration));
    }

    private void decreaseLove() {
        love = Common.getIntPrefrences(mContext, "lovePref", getString(R.string.loves));


        lovedown = love - 5;

        Common.setIntPrefrences(mContext, "lovePref", lovedown, getString(R.string.loves));
    }


    private void decreasefitness() {
        fitness = Common.getIntPrefrences(mContext, "fitnessPref", getString(R.string.fitness));


        fitnessdown = fitness - 5;

        Common.setIntPrefrences(mContext, "fitnessPref", fitnessdown, getString(R.string.fitness));

    }

    private void decreaseMood() {
        mood = Common.getIntPrefrences(mContext, "moodPref", getString(R.string.mood));


        mooddown = mood - 5;

        Common.setIntPrefrences(mContext, "moodPref", mooddown, getString(R.string.mood));
    }




    private void increaseHDepression() {

        depression = Common.getIntPrefrences(mContext, "depressionPref", getString(R.string.depression));


        depressionup = depression + 15;

        Common.setIntPrefrences(mContext, "depressionPref", depressionup, getString(R.string.depression));


    }

    private void increaseHSocial() {
        social = Common.getIntPrefrences(mContext, "socialPref", getString(R.string.social));


        socialup = social + 15;

        Common.setIntPrefrences(mContext, "socialPref", socialup, getString(R.string.social));
    }

    private void increaseHconcentration() {
        concentration = Common.getIntPrefrences(mContext, "concentrationPref", getString(R.string.concentration));


        concentrationup = concentration + 15;

        Common.setIntPrefrences(mContext, "concentrationPref", concentrationup, getString(R.string.concentration));
    }

    private void increaseHLove() {
        love = Common.getIntPrefrences(mContext, "lovePref", getString(R.string.loves));


        loveup = love + 15;

        Common.setIntPrefrences(mContext, "lovePref", loveup, getString(R.string.loves));
    }


    private void increaseHfitness() {
        fitness = Common.getIntPrefrences(mContext, "fitnessPref", getString(R.string.fitness));


        fitnessup = fitness + 15;

        Common.setIntPrefrences(mContext, "fitnessPref", fitnessup, getString(R.string.fitness));

    }

    private void increaseHMood() {
        mood = Common.getIntPrefrences(mContext, "moodPref", getString(R.string.mood));


        moodup = mood + 15;

        Common.setIntPrefrences(mContext, "moodPref", moodup, getString(R.string.mood));
    }

//    decreaseH

    private void decreaseHDepression() {

        depression = Common.getIntPrefrences(mContext, "depressionPref", getString(R.string.depression));


        depressiondown = depression - 15;

        Common.setIntPrefrences(mContext, "depressionPref", depressiondown, getString(R.string.depression));


    }

    private void decreaseHSocial() {
        social = Common.getIntPrefrences(mContext, "socialPref", getString(R.string.social));


        socialdown = social - 15;

        Common.setIntPrefrences(mContext, "socialPref", socialdown, getString(R.string.social));
    }

    private void decreaseHconcentration() {
        concentration = Common.getIntPrefrences(mContext, "concentrationPref", getString(R.string.concentration));


        concentrationdown = concentration - 15;

        Common.setIntPrefrences(mContext, "concentrationPref", concentrationdown, getString(R.string.concentration));
    }

    private void decreaseHLove() {
        love = Common.getIntPrefrences(mContext, "lovePref", getString(R.string.loves));


        lovedown = love - 15;

        Common.setIntPrefrences(mContext, "lovePref", lovedown, getString(R.string.loves));
    }


    private void decreaseHfitness() {
        fitness = Common.getIntPrefrences(mContext, "fitnessPref", getString(R.string.fitness));


        fitnessdown = fitness - 15;

        Common.setIntPrefrences(mContext, "fitnessPref", fitnessdown, getString(R.string.fitness));

    }

    private void decreaseHMood() {
        mood = Common.getIntPrefrences(mContext, "moodPref", getString(R.string.mood));


        mooddown = mood - 15;

        Common.setIntPrefrences(mContext, "moodPref", mooddown, getString(R.string.mood));
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
