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

import www.pointed.com.counter.utils.Common;

public class MyPlayG extends AppCompatActivity {


    Context mContext;

    ListView sdkFunctionalityList;


    Intent intent;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mContext = MyPlayG.this;

        setContentView(R.layout.activity_main2);
        Common.showAlertDialog(mContext, "Welcome to BetterLife", getString(R.string.intro_message), false);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent = new Intent(mContext, MainActivity.class);
                startActivity(intent);

            }

        });


//        end of fab



        String[] sdkFunctionalityListValue = new String[]{
                "Food",              /* 0 OutsideAct*/
                "House Keeping",              /* 1 HouseKeeping */
                "Personal Grooming",              /* 2 */
                "Career Oriented",              /* 3 WorkAct */
                "Job Oriented",                       /* 4 */
                "Social Entertainment",                /* 5 */
                "Private Entertainment",       /* 6 */
                "RelationShips",                  /* 7 */
                "Soul Development",              /* 8 */
        };
        sdkFunctionalityList = (ListView) findViewById(R.id.Md_list_company);

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
sdkFunctionalityList.setBackgroundColor(getResources().getColor(R.color.colorB));

    }


    private void selectedListItem(int position) {


        switch (position) {
            case 0:
                intent = new Intent(mContext, SoulDevelopment.class);
                startActivity(intent);


                break;
            case 1:
                intent = new Intent(mContext, HouseKeeping.class);
                startActivity(intent);

                break;
            case 2:
                intent = new Intent(mContext, PersonalGrooming.class);
                startActivity(intent);


                break;
     case 3:
         intent = new Intent(mContext, CareerOriented.class);
         startActivity(intent);



                break;
     case 4:

         intent = new Intent(mContext, WorkAct.class);
         startActivity(intent);


                break;
     case 5:

                intent = new Intent(mContext, SocialEntertainment.class);
                startActivity(intent);

                break;
     case 6:

                intent = new Intent(mContext, PrivateEntertainment.class);
                startActivity(intent);

                break;
     case 7:

                intent = new Intent(mContext, RelationShips.class);
                startActivity(intent);

                break;
     case 8:

                intent = new Intent(mContext, SoulDevelopment.class);
                startActivity(intent);

                break;




        }

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
