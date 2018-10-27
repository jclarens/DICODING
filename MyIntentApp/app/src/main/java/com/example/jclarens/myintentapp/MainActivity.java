package com.example.jclarens.myintentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnMoveActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = (Button)findViewById(R.id.btn_move_activity);
//        btnMoveActivity.setOnClickListener(this);
        btnMoveActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btn_move_activity:
                        Intent i = new Intent(MainActivity.this,MoveActivity.class);
                        startActivity(i);
                    break;
                }
            }
        });
    }
//    public void onClick (View v){
//        switch (v.getId()){
//
//        }
//    }
}
