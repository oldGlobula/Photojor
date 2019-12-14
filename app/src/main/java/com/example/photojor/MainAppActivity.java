package com.example.photojor;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainAppActivity extends AppCompatActivity {

    HistoryFragment historyFragment;
    PhotoFragment photoFragment;
    RecipeFragment recipeFragment;
    FragmentTransaction fTrans;
    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);
        historyFragment = new HistoryFragment();
        photoFragment = new PhotoFragment();
        recipeFragment = new RecipeFragment();
        fTrans = getSupportFragmentManager().beginTransaction();
        fTrans.add(R.id.fragmentContainer, historyFragment);
        fTrans.commit();
        bnv=findViewById(R.id.bottom_navigation);

        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.action_history:
                        fTrans = getSupportFragmentManager().beginTransaction();
                        fTrans.replace(R.id.fragmentContainer, historyFragment);
                        fTrans.commit();
                        break;
                    case R.id.action_take_photo:
                        fTrans = getSupportFragmentManager().beginTransaction();
                        fTrans.replace(R.id.fragmentContainer, photoFragment);
                        fTrans.commit();
                        break;
                    case R.id.action_recipes:
                        fTrans = getSupportFragmentManager().beginTransaction();
                        fTrans.replace(R.id.fragmentContainer, recipeFragment);
                        fTrans.commit();
                        break;
                }
                return false;
            }
        });



    }


}
