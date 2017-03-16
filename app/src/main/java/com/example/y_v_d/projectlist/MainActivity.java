package com.example.y_v_d.projectlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button spotify,scores,library,build,xyz,capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spotify = (Button)findViewById(R.id.button);
        scores = (Button)findViewById(R.id.button2);
        library = (Button)findViewById(R.id.button3);
        build = (Button)findViewById(R.id.button4);
        xyz = (Button)findViewById(R.id.button5);
        capstone = (Button)findViewById(R.id.button6);


        spotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                generateToast("Spotify Streamer App");
            }
        });

        scores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                generateToast("Scores App");
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                generateToast("Library App");
            }
        });
        build.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                generateToast("Build It Bigger App");
            }
        });
        xyz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                generateToast("XYZ reader App");
            }
        });
        capstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                generateToast("Capstone My App");
            }
        });

    }

    private void generateToast(String Message){
        String msg = "This Button will Launch my "+Message+" !";
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
    }
}
