package com.iam_sid.colorchangingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioButton RBRed,RBGreen,RBYellow;
    LinearLayout li;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RBRed=(RadioButton)findViewById(R.id.rbRed);
        RBGreen=(RadioButton)findViewById(R.id.rbGreen);
        RBYellow=(RadioButton)findViewById(R.id.rbYellow);
        rg=(RadioGroup)findViewById(R.id.rgb);
        li=(LinearLayout)findViewById(R.id.ll);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(RBRed.isChecked())
                {
                    li.setBackgroundColor(getResources().getColor(R.color.colorRed));
                }
                if(RBGreen.isChecked())
                {
                    li.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                }
                if(RBYellow.isChecked())
                {
                    li.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                }

            }
        });

    }
}
