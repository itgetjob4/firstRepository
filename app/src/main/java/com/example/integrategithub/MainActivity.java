package com.example.integrategithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView text1;
    Button button1,button2,button3,button4;
    StringBuilder stnBuilder,stnBuilder2;
    int maxInt=12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.text1);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              printStar1();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                printStar2();


            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printStar3();
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    public void printStar1(){
        stnBuilder=new StringBuilder();
        for (int i=0;i<12;i++){
            for (int j=0;j<i;j++){
                stnBuilder.append("*");
            }
            stnBuilder.append("\n");
        }

        text1.setText(stnBuilder);
    }

    public void printStar2(){
        stnBuilder=new StringBuilder();
        for (int i=12;i>0;i--){
            for (int j=0;j<i;j++){
                stnBuilder.append("*");
            }
            stnBuilder.append("\n");
        }
        text1.setText(stnBuilder);
    }

    public void printStar3(){
        stnBuilder=new StringBuilder();
        for (int i=maxInt;i>0;i--){
            for(int k=0;k<maxInt-i;k++){
                stnBuilder.append(" ");
            }
            for (int j=0;j<i;j++){
                stnBuilder.append("*");
            }
            stnBuilder.append("\n");
        }
        text1.setText(stnBuilder);
    }

    public void printStar4(){
        stnBuilder=new StringBuilder();
        for (int i=maxInt;i>0;i--){
            for(int k=0;k<maxInt-i;k++){
                stnBuilder.append(" ");
            }
            for (int j=0;j<i;j++){
                stnBuilder.append("*");
//                if (j==1){
//                    for(int x=0;x<maxInt;x++){
//                        for(int y=0;y<maxInt-i;y++){
//                            stnBuilder.append(" ");
//                        }
//                        for (int z=0;z<x;z++){
//
//                        }
//
//                    }
//                }
            }
            stnBuilder.append("\n");
        }
        text1.setText(stnBuilder);
    }
}
