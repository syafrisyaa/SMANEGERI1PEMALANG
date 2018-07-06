package com.blogspot.broapplications.smanegeri1pemalang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class PermActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perm);
        getSupportActionBar().hide();
        View decorView = getWindow().getDecorView();
        int uiOption = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOption);

    }


    @Override
    public void onBackPressed() {
        System.exit(0);
    }


    public void Permm (View view) {

        //pindah hal/activity
        Intent LinkToperm = new Intent(PermActivity.this,BerandaActivity.class);
        startActivity(LinkToperm);

    }


}
