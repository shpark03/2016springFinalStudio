package com.shpark.a2016springfinalstudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView label1;
    private EditText start;
    private TextView label2;
    private EditText end;
    private TextView label3;
    private EditText total;
    private Button calcButton;
    private int tot =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (EditText) findViewById(R.id.start);
        end = (EditText) findViewById(R.id.end);
        total = (EditText) findViewById(R.id.total);

        calcButton = (Button) findViewById(R.id.calcButton);

        calcButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                tot = 0;
                int i;

                for (i= Integer.parseInt(String.valueOf(start.getText())); i <= Integer.parseInt(String.valueOf(end.getText())); i++) {
                    tot = tot + i;
                }
                total.setText(Integer.toString(tot));


            }
        });
    }
}
