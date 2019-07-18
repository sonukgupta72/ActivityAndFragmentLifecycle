package com.sonukgupta72.activityandfragmentlifecycle;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Button btnActivity1 = findViewById(R.id.btnActivity1);
        Button btnActivity2 = findViewById(R.id.btnActivity2);
        Button btnActivity3 = findViewById(R.id.btnActivity3);
        Button btnActivity4 = findViewById(R.id.btnActivity4);
        Button btnActivity5 = findViewById(R.id.btnActivity5);
        Button btnActivity6 = findViewById(R.id.btnActivity6);
        Button btnDialog = findViewById(R.id.btnDialog);

        btnActivity1.setOnClickListener(this);
        btnActivity2.setOnClickListener(this);
        btnActivity3.setOnClickListener(this);
        btnActivity4.setOnClickListener(this);
        btnActivity5.setOnClickListener(this);
        btnActivity6.setOnClickListener(this);
        btnDialog.setOnClickListener(this);

        printLog("create");
    }

    private void showDialog() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Text dialog");
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.dismiss();
            }
        }).create().show();
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

    private void callActivity(Class<?> o) {
        Intent intent = new Intent(this, o);
        startActivity(intent);
    }

    private void printLog(String str) {
        Toast.makeText(this, this.getLocalClassName() + " " + str, Toast.LENGTH_LONG).show();
        Log.d("LIFE_CYCLE", this.getLocalClassName() + " " + str);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnActivity1:
                callActivity(Activity1.class);
                break;
            case R.id.btnActivity2:
                callActivity(Activity2.class);
                break;
            case R.id.btnActivity3:
                callActivity(Activity3.class);
                break;
            case R.id.btnActivity4:
                callActivity(Activity4.class);
                break;
            case R.id.btnActivity5:
                callActivity(Activity5.class);
                break;
            case R.id.btnActivity6:
                callActivity(Activity6.class);
                break;
            case R.id.btnDialog:
                showDialog();
                break;
        }
    }
}
