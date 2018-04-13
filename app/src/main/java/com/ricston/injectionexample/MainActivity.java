package com.ricston.injectionexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ricston.injectionexample.domain.Body;
import com.ricston.injectionexample.domain.com.ricston.injectionexample.domain.blood.Blood;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Body body = createBody();

        TextView bloodTV = findViewById(R.id.blood_tv);

        bloodTV.setText("Kind of Blood: " + body.getBlood().getKindOfBlood());
    }

    private Body createBody() {
        return null;
    }
}
