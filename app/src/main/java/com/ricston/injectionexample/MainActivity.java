package com.ricston.injectionexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ricston.injectionexample.domain.Body;
import com.ricston.injectionexample.domain.DaggerDoctor;
import com.ricston.injectionexample.domain.Doctor;
import com.ricston.injectionexample.domain.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Body body = createPerson().getBody();
        Body body2 = createPerson().getBody();
        TextView personTV = findViewById(R.id.person_tv);
        TextView bloodTV = findViewById(R.id.blood_tv);
        String newLine = System.lineSeparator();

        personTV.setText("First body of person 1: " + body + newLine
                        + "Second body of person 2: " + body2);

        String firstBlood = body.getBlood().getKindOfBlood();
        String secondBlood = body2.getBlood().getKindOfBlood();

        bloodTV.setText("Kind of Blood of first body: " + firstBlood + newLine
                        + "Kind of Blood of second body: "  + secondBlood);
    }

    private Person createPerson() {
        Doctor doctor = DaggerDoctor.create();
        return doctor.getPerson();
    }
}
