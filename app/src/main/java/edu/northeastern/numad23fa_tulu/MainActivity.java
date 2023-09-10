package edu.northeastern.numad23fa_tulu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutMeButton = findViewById(R.id.aboutMeButton);
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a Toast with name and email
                Toast.makeText(MainActivity.this,
                        "Tu Lu\namostulu@gmail.com",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}