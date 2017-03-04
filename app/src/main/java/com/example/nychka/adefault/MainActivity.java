package com.example.nychka.adefault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText aEditText;
    private EditText bEditText;
    private Button resultButton;
    private TextView resultTexyView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
//        aEditText = (EditText) findViewById(R.id.aNumber);
//        bEditText =  (EditText) findViewById(R.id.bNumber);
//        resultButton = (Button) findViewById(R.id.resultButton);
//        resultTexyView = (TextView) findViewById(R.id.resultTextView);
//
//        resultButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String aString =  aEditText.getText().toString();
        String bString = bEditText.getText().toString();
        int aNumber = Integer.parseInt(aString);
        int bNumber = Integer.parseInt(bString);
        Computation comp = new Computation();
        int result = comp.add(aNumber, bNumber);
        resultTexyView.setText("Result: " + result);

        // Create the text message with a string
        Intent intent = new Intent(v.getContext(), Example.class);

        // Start the activity
        startActivity(intent);
    }
}
