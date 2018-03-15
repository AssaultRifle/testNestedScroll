package com.example.vstremoukhov.collapseapp;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = findViewById(R.id.fab);
        final AppBarLayout appBarLayout = findViewById(R.id.mainappbar);
        final CoordinatorLayout coordinatorLayout = findViewById(R.id.coord);
        final NestedScrollView nestedScrollView = (NestedScrollView) findViewById(R.id.your_nested_scroll_view);
        final int toolbarHeight = findViewById(R.id.main_toolbar).getHeight();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nestedScrollView.post(new Runnable() {

                    @Override
                    public void run() {
                        nestedScrollView.smoothScrollTo(0,0);
                    }
                });
            }
        });
    }
}
