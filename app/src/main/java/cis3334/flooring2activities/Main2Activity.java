package cis3334.flooring2activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvLength, tvWidth, tvFlooring;
    Double length, width, flooring;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvLength = (TextView) findViewById(R.id.textViewLength);
        tvWidth = (TextView) findViewById(R.id.textViewWidth);
        tvFlooring = (TextView) findViewById(R.id.textViewFlooring);


        Bundle extras = getIntent().getExtras();

        length = extras.getDouble("MainLength");
        width = extras.getDouble("MainWidth");
        flooring = extras.getDouble("MainFlooring");



        tvLength.setText("Length: " + length);
        tvWidth.setText("Width: " + width);
        tvFlooring.setText("Flooring needed: " + flooring);

    }
}
