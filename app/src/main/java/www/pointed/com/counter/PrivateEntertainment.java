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

public class PrivateEntertainment extends AppCompatActivity {

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
        setContentView(R.layout.workactm);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mContext = PrivateEntertainment.this;



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

                "Movies Watch.",                         /* 9 */
                "Videos Watch (old).",                         /* 9 */
                "Videos Watch (new).",                         /* 9 */
                "Music Listen.",                         /* 10 */
                "Watch New Youtube Videos.",                         /* 10 */
                "Play Games On Phone.",                  /* 11 */
                "Play Games On PC.",                  /* 11 */
                "Play Games On Social Site.",                  /* 11 */
                "Movies Watch New.",                  /* 11 */
                "Read Diary.",
                "Cartoon Watch",                           /* 8 */
                "Music Listen",                             /* 9 */


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
                Toast.makeText(mContext, "Create Alarm After One Hour Dont induklge ,much do other tasks", Toast.LENGTH_LONG).show();
                increaseDepression();

                decreaseMood();

                decreasefitness();

                decreaseLove();

                decreaseconcentration();

                decreaseSocial();

                Common.showAlertDialog(mContext,Integer.toString(R.string.oneHour),"Trading Started", true);


//                ett = Common.getIntPrefrences(mContext, "intPref", getString(R.string.app_name));
//                Common.showAlertDialog(mContext, "Bhosdicha", Integer.toString(ett), false);

                break;
            case 1:




                increaseDepression();
                decreaseMood();
                decreasefitness();
                decreaseLove();
                decreaseconcentration();
                decreaseSocial();


//
//
// vet = ett + 60;
//
//
//
//
//                Babu = Common.getIntPrefrences(mContext, "intPref", getString(R.string.app_name));
//
//                Common.showAlertDialog(mContext, "Bhosdicha", Integer.toString(Babu), false);



                break;
            case 2:



                Toast.makeText(mContext, "Create Alarm After One Hour", Toast.LENGTH_LONG).show();
                increaseconcentration();



                decreaseMood();
                decreasefitness();
                decreaseLove();

                decreaseSocial();
                decreaseDepression();

//                gtt =    Common.setIntPrefrences(mContext, "intPref", 50, getString(R.string.app_name));
//                Common.showAlertDialog(mContext, "Bhosdicha", Integer.toString(gtt), false);

                break;

        case 3:


            increaseHMood();
            Toast.makeText(mContext, "Create Alarm After One Hour", Toast.LENGTH_LONG).show();
            increaseHDepression();

            decreasefitness();
            increaseHLove();
            decreaseHconcentration();
            decreaseHSocial();

//                gtt =    Common.setIntPrefrences(mContext, "intPref", 50, getString(R.string.app_name));
//                Common.showAlertDialog(mContext, "Bhosdicha", Integer.toString(gtt), false);

                break;



        }

    }

    private void increaseDepression() {

        depression = Common.getIntPrefrences(mContext, "depressionPref", getString(R.string.depression));


        depressionup = depression + 5;

        Common.setIntPrefrences(mContext, "depressionPref", depressionup, getString(R.string.depression));


    }



    private void increaseconcentration() {
        concentration = Common.getIntPrefrences(mContext, "concentrationPref", getString(R.string.concentration));


        concentrationup = concentration + 5;

        Common.setIntPrefrences(mContext, "concentrationPref", concentrationup, getString(R.string.concentration));
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

    private void decreaseconcentration() {
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
    protected void onResume() {
        super.onResume();


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
