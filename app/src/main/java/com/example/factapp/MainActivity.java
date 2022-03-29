package com.example.factapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    Button add;
    TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 =findViewById(R.id.num);
        add= findViewById(R.id.btn);
        res =findViewById(R.id.res);
add.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
//
        int n= Integer.parseInt(num1.getText().toString());
//        int i= Integer.parseInt(num1.getText().toString());
        int i=1,sum=0;

        while (i<=n/2) {

            if (n% i == 0)
            {
               sum=sum+i;
            }
            i++;
        }
        if(sum==n)
        {
            res.setText("Perfact No : " + n);
        }
        else
        {
            res.setText("Not Perfact No : " + n);
        }


//        i=1;
//        while (i<=n)
//        {
//            if(i%2==0){
//
//            }
//            res.setText(" Sum :" + i);
//        }
//        i++;

    }
});
    }
}