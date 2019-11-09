package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button btn2;
    Button btn3,tv_num_but,tv_num_but1;
    EditText n2;
    EditText n1;
    TextView ans,n3;
    double sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","on create invoked");
//
        n3=(TextView)findViewById(R.id.tv_num);
        tv_num_but=(Button)findViewById(R.id.tv_num_but);
        tv_num_but1=(Button)findViewById(R.id.tv_num_but1);
        n1=(EditText) findViewById(R.id.firstnum_etext);
        n2=(EditText) findViewById(R.id.secnum_etext);
        btn=(Button) findViewById(R.id.addbtn);
        ans=(TextView) findViewById(R.id.result_tview);
        btn2=(Button) findViewById(R.id.sec_activity_btn);
        btn3=(Button) findViewById(R.id.btn3);
        n3.setText("0");

        tv_num_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val=Integer.parseInt(n3.getText().toString());
                val++;
                if(val>10)
                    n3.setText("0");
                else
                    n3.setText(Integer.toString(val));

            }
        });

        tv_num_but1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                int val=Integer.parseInt(n3.getText().toString());
                val++;
                if(val>10)
                    n3.setText("0");
                else
                    n3.setText(Integer.toString(val));
                return false;
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(n1.getText().toString());
                double num2=Double.parseDouble(n2.getText().toString());

                sum=num1+num2;
                ans.setText(Double.toString(sum));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent=new Intent(getApplicationContext(),Second_activity.class);

//                startIntent.putExtra("key",sum);

                startActivity(startIntent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent=new Intent(getApplicationContext(),img_act.class);

//                startIntent.putExtra("key",sum);

                startActivity(startIntent);
            }
        });
    }

    protected void onStart(){
        super.onStart();
        Log.d("lifecycle","on start invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
    }
}
