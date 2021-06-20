package com.example.fgame.OthersClass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fgame.R;

public class MainActivity extends AppCompatActivity {
    private Button startBtn, exitBtn, creditsBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startBtn = findViewById(R.id.gameBtn);
        exitBtn = findViewById(R.id.exitBtn);
        creditsBtn = findViewById(R.id.creditsBtn);

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToGame();
            }
        });

        creditsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCredits();
            }
        });
    }

    public  void goToGame(){
        Intent intent = new Intent(this, Game.class);
        startActivity(intent);
    }

    public void goToCredits(){
        Intent intent = new Intent(this, Credits.class);
        startActivity(intent);
    }
}