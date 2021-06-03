package com.codingurbrain.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*if (Build.VERSION.SDK_INT >= 21){
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.white));
        }*/

        Adapter adapter = new Adapter(generateSimpleList());
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.mainrecyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private List<ViewModel> generateSimpleList() {
        List<ViewModel> simpleViewModelList = new ArrayList<>();

        //for (int i = 1; i <= 100; i++) {
            simpleViewModelList.add(new ViewModel(String.format(Locale.US, "This is item 1")));
            simpleViewModelList.add(new ViewModel(String.format(Locale.US, "This is item 2")));

        simpleViewModelList.add(new ViewModel(String.format(Locale.US, "This is item 1")));
        simpleViewModelList.add(new ViewModel(String.format(Locale.US, "This is item 2")));
        simpleViewModelList.add(new ViewModel(String.format(Locale.US, "This is item 1")));
        simpleViewModelList.add(new ViewModel(String.format(Locale.US, "This is item 2")));
        simpleViewModelList.add(new ViewModel(String.format(Locale.US, "This is item 1")));
        simpleViewModelList.add(new ViewModel(String.format(Locale.US, "This is item 2")));
       // }

        return simpleViewModelList;
    }
}