package com.ricston.injectionexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ricston.injectionexample.domain.DaggerDoctor;
import com.ricston.injectionexample.domain.Doctor;
import com.ricston.injectionexample.domain.Person;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Doctor doctor = DaggerDoctor.create();

        Person person1 = createPerson(doctor);
        Person person2 = createPerson(doctor);
        TextView personTV = findViewById(R.id.person_tv);
        TextView bloodTV = findViewById(R.id.blood_tv);
        String newLine = System.lineSeparator();

        personTV.setText("Person and body 1: "
                            +person1 + newLine + person1.getBody() + newLine
                        + "Person and body 2: "
                            + person2 + newLine + person2.getBody());

        String firstBlood = person1.getBody().getBlood().getKindOfBlood();
        String secondBlood = person2.getBody().getBlood().getKindOfBlood();

        bloodTV.setText("Kind of Blood of first body: " + firstBlood + newLine
                        + "Kind of Blood of second body: "  + secondBlood);
    }

    private Person createPerson(Doctor doctor) {
        return doctor.getPerson();
    }
}
