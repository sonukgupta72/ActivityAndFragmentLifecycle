package com.sonukgupta72.activityandfragmentlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Fragment1 fragment1 = new Fragment1();
        getSupportFragmentManager().beginTransaction().add(R.id.llContainer1, fragment1).addToBackStack("Fr1").commit();

        Fragment2 fragment2 = new Fragment2();
        getSupportFragmentManager().beginTransaction().add(R.id.llContainer1, fragment2).addToBackStack("Fr2").commit();

        Fragment3 fragment3 = new Fragment3();
        getSupportFragmentManager().beginTransaction().add(R.id.llContainer2, fragment3).addToBackStack("Fr3").commit();

        Fragment4 fragment4 = new Fragment4();
        getSupportFragmentManager().beginTransaction().replace(R.id.llContainer2, fragment4).addToBackStack("Fr4").commit();

        printLog("create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        printLog("start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        printLog("pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        printLog("resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        printLog("stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        printLog("restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        printLog("destroy");
    }

    private void printLog(String str) {
        Log.d("LIFE_CYCLE", this.getLocalClassName() + " " + str);
    }

}
