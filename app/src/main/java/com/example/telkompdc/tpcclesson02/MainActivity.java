package com.example.telkompdc.tpcclesson02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private int number;
    private TextView counterNumber;
    Button plus,minus,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterNumber = (TextView) (findViewById(R.id.counter_number));
        plus = (Button) findViewById(R.id.button);
        minus = (Button) findViewById(R.id.button2);
        reset = (Button) findViewById(R.id.button3);
        number = Integer.parseInt(String.valueOf(counterNumber.getText()));

        Log.v(LOG_TAG, "angka sekarang : " + number);
        Toast.makeText(this,"Angka sekarang nilainya : " + number, Toast.LENGTH_LONG).show();
    }

    public void increment(View view){
        number++;
        counterNumber.setText(""+number);
    }

    public void decrement(View view){
        number--;
        counterNumber.setText(""+number);
    }

    public void reset(View view){
        number=0;
        counterNumber.setText(""+number);
    }
}
