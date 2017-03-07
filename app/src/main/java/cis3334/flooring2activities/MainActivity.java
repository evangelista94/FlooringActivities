package cis3334.flooring2activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.width;
import static cis3334.flooring2activities.R.id.editTextLength;
import static cis3334.flooring2activities.R.id.editTextWidth;

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

        etLength = (EditText) findViewById(editTextLength);
        etWidth =  (EditText) findViewById(editTextWidth);

        btnResult = (Button) findViewById(R.id.buttonResult);

    }

    public void onButtonClick( View view) {

        // Call the second activity using intent

        /*Double length = Double.parseDouble(tvLength.getText().toString());
        Double width  = Double.parseDouble( tvWidth.getText().toString() );
        Intent secActIntent = new Intent(MainActivity.this, Main2Activity.class);
        secActIntent.putExtra("MainLength", length);
        secActIntent.putExtra("MainWidth", width);
        startActivity(secActIntent);*/

            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            Double length = Double.parseDouble(tvLength.getText().toString());
            Double width  = Double.parseDouble( tvWidth.getText().toString() );
            etLength = (EditText) findViewById(R.id.editTextLength);
            etWidth = (EditText) findViewById(R.id.editTextWidth);
            //String message = editText.getText().toString();
            intent.putExtra("MainLength", length);
            intent.putExtra("MainWidth", width);
            startActivity(intent);
    }
}
