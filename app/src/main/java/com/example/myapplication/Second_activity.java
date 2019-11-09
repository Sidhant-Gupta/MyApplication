package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class Second_activity extends AppCompatActivity {
    Button btn,btn_option;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        btn=(Button) findViewById(R.id.btn_inr);
        et=(EditText) findViewById(R.id.et_bitcoin);
        btn_option=(Button) findViewById(R.id.btn_option);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp=Integer.parseInt(et.getText().toString());
                String str=Integer.toString(temp*1013);
                Toast.makeText(Second_activity.this, str, Toast.LENGTH_SHORT).show();
            }
        });


//        if(getIntent().hasExtra("key")) {
//            TextView tv = (TextView) findViewById(R.id.sec_textview);
//            int text=getIntent().getExtras().getInt("key");
//            tv.setText(Integer.toString(text));
//        }

    }
}
