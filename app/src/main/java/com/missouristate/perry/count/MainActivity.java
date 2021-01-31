package com.missouristate.perry.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.tv_1);
                String stringValue = tv.getText().toString();
                Integer originalValue = Integer.parseInt(stringValue);
                Integer newValue = MyHelper.addMyValue(originalValue);
                tv.setText(newValue.toString());
            }
        });
    }
}