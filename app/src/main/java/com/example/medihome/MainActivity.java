package com.example.medihome;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle("Items List");

        title = new String[]{"1. Arthritis",
                "2. Cold and Congestion",
                "3. Itchy Skin",
                "4. Hiccups",
                "5. Constipation",
                "6. Nausea",
                "7. Headache",
                "8. Anxiety",
                "9. Stress",
                "10. Eczema",
                "11 Vertigo",
                "12 Asthma",
                "13. Infected cut",
                "14. Dandruff",
                "15. Bad Breath"};

        description = new String[]{"-Green tea",
                "-Chicken soup",
                "-Oatmeal","-Sugar",
                "-Flaxseed",
                "-Peppermint",
                "-Coffee",
                "-Try meditation",
                "-Avoiding caffeine",
                "-Magnesium baths",
                "-Basil",
                "-Fish oil and Vitamin C",
                "-Honey",
                "-Baking soda",
                "-Eating prunes",
                "-Oil pulling"};

        icon = new int[]{R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.g,
                R.drawable.h,
                R.drawable.i,
                R.drawable.j,
                R.drawable.k,
                R.drawable.l,
                R.drawable.m,
                R.drawable.n,
                R.drawable.o};

        listView = findViewById(R.id.listView);

        for(int i =0; i<title.length; i++){
            Model model = new Model (title[i], description[i], icon[i]);

            arrayList.add(model);
        }

        adapter = new ListViewAdapter(this, arrayList);

        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (TextUtils.isEmpty(newText)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(newText);
                }
                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}