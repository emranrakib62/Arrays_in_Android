package com.example.arraysinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView1,textView2;
    int[] values={1,2,3,4,5,6,9,8,9,1};
    String[] names={"hasan","rakib","kader"};
   float[] value= new float[]{7,8,9,5,2,5,4,7};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);




        for(int x=0;x<values.length;x++){

            textView.append(values[x]+"\n");

        }
        for (int i=0;i<names.length;i++){

            textView1.append(names[i]+"\n");

        }

        for (int j=0;j<value.length;j++){

            textView2.append(value[j]+"\n");

        }





    }
}