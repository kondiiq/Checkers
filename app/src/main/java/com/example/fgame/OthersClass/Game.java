package com.example.fgame.OthersClass;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fgame.Models.BoardModel;
import com.example.fgame.R;
import com.example.fgame.Views.BoardView;

public class Game extends AppCompatActivity {

    private Button play, back2menu;
    private Context context;
    AttributeSet attributeSet;
    private ImageButton imageButton;
    private BoardModel model;
    private BoardView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        view = findViewById(R.id.boardView);
        imageButton = findViewById(R.id.musicButton);
        play = findViewById(R.id.playGameBtn);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameLoop();
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast;
                toast = Toast.makeText(Game.this, "Game stop!!", Toast.LENGTH_SHORT);
                toast.show();
                view.setVisibility(View.INVISIBLE);
            }
        });

        back2menu = findViewById(R.id.back2Menu);
        back2menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMenu();
            }
        });
    }

    public void goToMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void gameLoop(){
        Toast toast;
        toast = Toast.makeText(Game.this, "Game started!!", Toast.LENGTH_SHORT);
        toast.show();
        view.setVisibility(View.VISIBLE);
    }
}