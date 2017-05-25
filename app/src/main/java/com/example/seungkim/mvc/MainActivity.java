package com.example.seungkim.mvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements NumberModel.OnNumberChangeListener, View.OnClickListener{
    private NumberModel model;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model = new NumberModel();
        model.setOnNumberChangeListener(this);

        tvResult = (TextView)findViewById(R.id.tvResult);
        findViewById(R.id.btnChangeData).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.tvResult){
            model.changeNumber();
        }
    }

    @Override
    public void onNumberChange(int number) {
        tvResult.setText("result : " + number);
    }
}