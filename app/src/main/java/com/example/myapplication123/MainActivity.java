package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getresult (View v)
    {
        TextView n1=findViewById(R.id.n1);
        TextView n2 =findViewById(R.id.n2);
        int x=Integer.parseInt(n1.getText().toString());
        int y=Integer.parseInt(n2.getText().toString());
        int w=x+y;
        TextView result=findViewById(R.id.result);
        result.setText("le resultat est"+w);


    }
}