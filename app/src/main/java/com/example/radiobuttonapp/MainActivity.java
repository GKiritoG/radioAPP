package com.example.radiobuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view, int kGirlGroup) {

        TextView txvLike = findViewById(R.id.txvShow);
        RadioGroup KGirlGroup = findViewById(R.id.kGirlGroup);

        int id = kGirlGroup.getCheckedRadioButtonId();
        RadioButton selected = findViewById(id);


        txvLike.setText("你喜歡的是 :" + selected.toString());
    }
}
