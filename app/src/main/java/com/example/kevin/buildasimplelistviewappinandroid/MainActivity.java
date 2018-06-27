package com.example.kevin.buildasimplelistviewappinandroid;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity implements AdapterView.OnItemClickListener {

    String[] courseNames = {"Android Developer Course", "iOS Developer Course", "Java Developer Course",
            "Objective-C Developer Course", "Web Developer Course"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.activity_main, courseNames);

        setListAdapter(adapter);


        ListView lstView = getListView();

        lstView.setOnItemClickListener(MainActivity.this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String itemValue = parent.getItemAtPosition(position).toString();
        Toast.makeText(MainActivity.this, itemValue, Toast.LENGTH_SHORT).show();



    }
}
