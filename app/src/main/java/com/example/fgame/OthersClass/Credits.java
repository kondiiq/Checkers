package com.example.fgame.OthersClass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fgame.R;

public class Credits extends AppCompatActivity {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        back = findViewById(R.id.back2MenuCredits);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go2Menu();;
            }
        });
    }

    public void go2Menu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}