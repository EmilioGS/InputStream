package com.example.tarea9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt1 = (TextView) findViewById(R.id.Txt1);
        TextView txt2 = (TextView) findViewById(R.id.Txt2);

        InputStream entradaDatos = getResources().openRawResource(R.raw.cyberpunk);
        InputStreamReader stream1 = new InputStreamReader(entradaDatos);
        BufferedReader buffer1 = new BufferedReader(stream1);

        String  lineaDatos;
        while(true){
            try {
                lineaDatos = buffer1.readLine();
                if(lineaDatos == null){
                    break;
                }
                txt2.append("\n" + lineaDatos);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}