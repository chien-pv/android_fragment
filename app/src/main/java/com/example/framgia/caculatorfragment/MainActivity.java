package com.example.framgia.caculatorfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(String textViewText ) {
        TopFragment topFragment
                = (TopFragment) this.getSupportFragmentManager()
                .findFragmentById(R.id.top_fragment);
        topFragment.showText(textViewText);
    }
}
