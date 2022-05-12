package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDec,btnInc,reset;
        TextView textView;
        btnDec=findViewById(R.id.btnDec);
        btnInc=findViewById(R.id.btnInc);
        reset=findViewById(R.id.reset);
        textView=findViewById(R.id.textView);
        btnDec.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          counter--;
                                          textView.setText(Integer.toString(counter));
                                      }
            }
        );
        btnInc.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          counter++;
                                          textView.setText(Integer.toString(counter));
                                      }
                                  }
        );
        reset.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          counter=0;
                                          textView.setText(Integer.toString(counter));
                                      }
                                  }
        );
    }
}