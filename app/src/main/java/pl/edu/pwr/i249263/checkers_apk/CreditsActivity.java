package pl.edu.pwr.i249263.checkers_apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreditsActivity extends AppCompatActivity {

    private Button back;
    private TextView credit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        back = findViewById(R.id.returnBtn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToMenu();
            }
        });

        credit = findViewById(R.id.textView);
        credit.setText("My github: https://github.com/kondiiq");
        Linkify.addLinks(credit, Linkify.WEB_URLS);
    }

    public void backToMenu()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}