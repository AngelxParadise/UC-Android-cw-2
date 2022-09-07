package com.example.day1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etfirstnumber = findViewById(R.id.editfirstnumber);
        EditText etsecondnumber = findViewById(R.id.editsecondnumber);
        TextView textresult = findViewById(R.id.textViewResult);
        Button calc = findViewById(R.id.buttonCalc);
        Button subt = findViewById(R.id.buttonSub);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texta = etfirstnumber.getText().toString();
                int x = Integer.parseInt(texta);

                String textb = etsecondnumber.getText().toString();
                int y = Integer.parseInt(textb);

                int z = sum(x, y);

                textresult.setText(String.valueOf(z));
            }
        });

        subt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texta = etfirstnumber.getText().toString();
                int x = Integer.parseInt(texta);

                String textb = etsecondnumber.getText().toString();
                int y = Integer.parseInt(textb);

                int z = sub(x, y);

                textresult.setText(String.valueOf(z));
            }
        });
    }

    public int sum(int x, int y){
        int a = x + y;
        return a;
    }

    public int sub(int x, int y){
        int a = x - y;
        return a;
    }
}