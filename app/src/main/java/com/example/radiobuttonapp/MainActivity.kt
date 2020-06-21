package com.example.radiobuttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOK(view: View) {
        TextView txvLike = findViewById(R.id.txvShow);
        RadioGroup KGirlGroup = findViewById(R.id.kGirlGroup);

        int id = kGirlGroup.getCheckedRadioButtonId();
        RadioButton selected = findViewById(id);


        txvLike.setText("你喜歡的是 :" + selected.toString());
    }
}
