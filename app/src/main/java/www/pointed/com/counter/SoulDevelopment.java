package www.pointed.com.counter;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class SoulDevelopment extends ActionBarActivity implements Adapter.ViewHolder.ClickListener{

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


    private static final String TAG = MainActivity.class.getSimpleName();

    private Adapter adapter;
    private ActionModeCallback actionModeCallback = new ActionModeCallback();
    private ActionMode actionMode;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sdm);

    
        mContext = SoulDevelopment.this;

        adapter = new Adapter(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
    }

    @Override
    public void onItemClicked(int position) {
        if (actionMode != null) {
            toggleSelection(position);
        } else {
            adapter.removeItem(position);
        }
    }

    @Override
    public boolean onItemLongClicked(int position) {
        if (actionMode == null) {
            actionMode = startSupportActionMode(actionModeCallback);
        }

        toggleSelection(position);

        return true;
    }

    /**
     * Toggle the selection state of an item.
     *
     * If the item was the last one in the selection and is unselected, the selection is stopped.
     * Note that the selection must already be started (actionMode must not be null).
     *
     * @param position Position of the item to toggle the selection state
     */
    private void toggleSelection(int position) {
        adapter.toggleSelection(position);
        int count = adapter.getSelectedItemCount();

        if (count == 0) {
            actionMode.finish();
        } else {
            actionMode.setTitle(String.valueOf(count));
            actionMode.invalidate();
        }
    }

    private class ActionModeCallback implements ActionMode.Callback {
        @SuppressWarnings("unused")
        private final String TAG = ActionModeCallback.class.getSimpleName();

        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            mode.getMenuInflater().inflate (R.menu.selected_menu, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            switch (item.getItemId()) {
                case R.id.menu_remove:
                    adapter.removeItems(adapter.getSelectedItems());
                    mode.finish();
                    return true;

                default:
                    return false;
            }
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            adapter.clearSelection();
            actionMode = null;
        }
    }
/*
        String[] sdkFunctionalityListValue = new String[]{

                "Giving Donation.",                      */
/* 3 *//*

                "Go Long Drive.",                      */
/* 3 *//*

                "Do EFT",                        */
/* 5 *//*

                "Do Something For 1st Time",                        */
/* 5 *//*

                "Control Anger.",                        */
/* 15 *//*

                "Give Social Service.",                  */
/* 15 *//*

                "Visit Orphanage.",                       */
/* 15 *//*

                "Do Meditation",                          */
/* 14 *//*

                "Be Jealous",                          */
/* 14 *//*

                "Feel Special",                          */
/* 14 *//*

                "Motivate Someone",                          */
/* 14 *//*

                "Motivate Someone",                          */
/* 14 *//*

                "Eacape Habit",                          */
/* 14 *//*

                "Give Free Tuition",                          */
/* 14 *//*







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
*/


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

