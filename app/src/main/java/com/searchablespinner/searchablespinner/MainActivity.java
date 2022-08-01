package com.searchablespinner.searchablespinner;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import com.searchablespinner.searchspinnerlibrary.SearchableSpinner;
import com.searchablespinner.searchspinnerlibrary.interfaces.IStatusListener;
import com.searchablespinner.searchspinnerlibrary.interfaces.OnItemSelectedListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final ArrayList<String>      mStrings                = new ArrayList<>();
    private SearchableSpinner mSearchableSpinner;
    private       SearchableSpinner      mSearchableSpinner1;
    private       SearchableSpinner      mSearchableSpinner2;
    private       SearchableSpinner      mSearchableSpinner3;
    private       SimpleListAdapter      mSimpleListAdapter;
    private       SimpleArrayListAdapter mSimpleArrayListAdapter;
    private OnItemSelectedListener mOnItemSelectedListener = new OnItemSelectedListener() {
        @Override
        public void onItemSelected(View view, int position, long id) {
            Toast.makeText(MainActivity.this, "Item on position " + position + " : " + mSimpleListAdapter.getItem(position) + " Selected", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected() {
            Toast.makeText(MainActivity.this, "Nothing Selected", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initListValues();
        mSimpleListAdapter      = new SimpleListAdapter(this, mStrings);
        mSimpleArrayListAdapter = new SimpleArrayListAdapter(this, mStrings);

        mSearchableSpinner = findViewById(R.id.SearchableSpinner);
        mSearchableSpinner.setAdapter(mSimpleArrayListAdapter);
        mSearchableSpinner.setOnItemSelectedListener(mOnItemSelectedListener);
        mSearchableSpinner.setStatusListener(new IStatusListener() {
            @Override
            public void spinnerIsOpening() {
                mSearchableSpinner1.hideEdit();
                mSearchableSpinner2.hideEdit();
            }

            @Override
            public void spinnerIsClosing() {

            }
        });

        mSearchableSpinner1 = findViewById(R.id.SearchableSpinner1);
        mSearchableSpinner1.setAdapter(mSimpleListAdapter);
        mSearchableSpinner1.setOnItemSelectedListener(mOnItemSelectedListener);
        mSearchableSpinner1.setStatusListener(new IStatusListener() {
            @Override
            public void spinnerIsOpening() {
                mSearchableSpinner.hideEdit();
                mSearchableSpinner2.hideEdit();
            }

            @Override
            public void spinnerIsClosing() {

            }
        });

        mSearchableSpinner2 = findViewById(R.id.SearchableSpinner2);
        mSearchableSpinner2.setAdapter(mSimpleListAdapter);
        mSearchableSpinner2.setOnItemSelectedListener(mOnItemSelectedListener);
        mSearchableSpinner2.setStatusListener(new IStatusListener() {
            @Override
            public void spinnerIsOpening() {
                mSearchableSpinner.hideEdit();
                mSearchableSpinner1.hideEdit();
            }

            @Override
            public void spinnerIsClosing() {

            }
        });

        mSearchableSpinner3 = findViewById(R.id.SearchableSpinner3);
        mSearchableSpinner3.setAdapter(mSimpleListAdapter);
        mSearchableSpinner3.setOnItemSelectedListener(mOnItemSelectedListener);
        mSearchableSpinner3.setStatusListener(new IStatusListener() {
            @Override
            public void spinnerIsOpening() {
                mSearchableSpinner.hideEdit();
                mSearchableSpinner3.hideEdit();
            }

            @Override
            public void spinnerIsClosing() {

            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (!mSearchableSpinner.isInsideSearchEditText(event)) {
            mSearchableSpinner.hideEdit();
        }
        if (!mSearchableSpinner1.isInsideSearchEditText(event)) {
            mSearchableSpinner1.hideEdit();
        }
        if (!mSearchableSpinner2.isInsideSearchEditText(event)) {
            mSearchableSpinner2.hideEdit();
        }
        return super.onTouchEvent(event);
    }

    private void initListValues() {
        mStrings.add("Samwel Nyandoro");
        mStrings.add("Samwel Nyandoro1");
        mStrings.add("Samwel Nyandoro2");
        mStrings.add("Samwel Nyandoro3");
        mStrings.add("Samwel Nyandoro4");
        mStrings.add("Samwel Nyandoro5");
        mStrings.add("Samwel Nyandoro6");
        mStrings.add("Samwel Nyandoro7");
        mStrings.add("Samwel Nyandoro8");
        mStrings.add("Samwel Nyandoro9");
        mStrings.add("Samwel Nyandoro10");
        mStrings.add("Samwel Nyandoro11");
        mStrings.add("Samwel Nyandoro12");
        mStrings.add("Samwel Nyandoro13");
        mStrings.add("Samwel Nyandoro14");
        mStrings.add("Samwel Nyandoro15");
        mStrings.add("Samwel Nyandoro16");
        mStrings.add("Samwel Nyandoro17");
        mStrings.add("Samwel Nyandoro18");
        mStrings.add("Samwel Nyandoro19");
        mStrings.add("Samwel Nyandoro20");
        mStrings.add("Samwel Nyandoro21");
        mStrings.add("Samwel Nyandoro22");
        mStrings.add("Samwel Nyandoro23");
        mStrings.add("Samwel Nyandoro24");
        mStrings.add("Samwel Nyandoro25");
        mStrings.add("Samwel Nyandoro26");
        mStrings.add("Samwel Nyandoro27");
        mStrings.add("Samwel Nyandoro28");
        mStrings.add("Samwel Nyandoro29");
        mStrings.add("Samwel Nyandoro30");
        mStrings.add("Samwel Nyandoro31");
        mStrings.add("Samwel Nyandoro32");
        mStrings.add("Samwel Nyandoro33");
        mStrings.add("Samwel Nyandoro34");
        mStrings.add("Samwel Nyandoro35");
        mStrings.add("Samwel Nyandoro36");
        mStrings.add("Samwel Nyandoro37");
        mStrings.add("Samwel Nyandoro38");
        mStrings.add("Samwel Nyandoro39");
        mStrings.add("Samwel Nyandoro40");
        mStrings.add("Samwel Nyandoro41");
        mStrings.add("Samwel Nyandoro42");
        mStrings.add("Samwel Nyandoro43");
        mStrings.add("Samwel Nyandoro44");
        mStrings.add("Samwel Nyandoro45");
        mStrings.add("Samwel Nyandoro46");
        mStrings.add("Samwel Nyandoro48");
        mStrings.add("Samwel Nyandoro49");
        mStrings.add("Samwel Nyandoro50");
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
        if (id == R.id.action_reset) {
            mSearchableSpinner.setSelectedItem(0);
            mSearchableSpinner1.setSelectedItem(0);
            mSearchableSpinner2.setSelectedItem(0);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
