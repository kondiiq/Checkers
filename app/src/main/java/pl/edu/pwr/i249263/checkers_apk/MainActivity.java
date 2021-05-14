package pl.edu.pwr.i249263.checkers_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button startBtn, creditBtn, exitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startBtn = findViewById(R.id.newgameBtn);
        creditBtn = findViewById(R.id.creditBtn);
        exitBtn = findViewById(R.id.exitBtn);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openBoardGameActivity();
            }
        });

        creditBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreditsActivity();
            }
        });

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
    public void openBoardGameActivity() {
        Intent intent = new Intent(this, GameBoard.class);
        startActivity(intent);
    }

    public void openCreditsActivity()
    {
        Intent intent = new Intent(this, CreditsActivity.class);
        startActivity(intent);
    }
}