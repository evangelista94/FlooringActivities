package cis3334.flooring2activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tvLength, tvWidth;
    EditText etLength, etWidth;
    Button btnResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLength = (TextView) findViewById(R.id.textViewLength);
        tvWidth = (TextView) findViewById(R.id.textViewWidth);


        etLength = (EditText) findViewById(R.id.editTextLength);
        etWidth = (EditText) findViewById(R.id.editTextWidth);

        btnResult = (Button) findViewById(R.id.buttonResult);


        // Call the second activity using intent
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double length = Double.parseDouble(etLength.getText().toString());
                Double width = Double.parseDouble(etWidth.getText().toString());
                Double flooring = length * width;

                Intent secActIntent = new Intent(MainActivity.this, Main2Activity.class);
                secActIntent.putExtra("MainLength", length);
                secActIntent.putExtra("MainWidth", width);
                secActIntent.putExtra("MainFlooring", flooring);
                startActivity(secActIntent);


            }
        });
    }
}


