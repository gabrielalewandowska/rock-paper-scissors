package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayActivity extends AppCompatActivity {
    Button rockButton;
    Button paperButton;
    Button scissorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

    rockButton = (Button) findViewById(R.id.rock_button);
    paperButton = (Button) findViewById(R.id.paper_button);
    scissorsButton = (Button) findViewById(R.id.scissors_button);
    }

    public void onRockButtonClicked(View rockButton){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("choice", "rock");
        startActivity(intent);
    }

    public void onPaperButtonClicked(View paperButton){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("choice", "paper");
        startActivity(intent);
    }

    public void onScissorsButtonClicked(View scissorsButton){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("choice", "scissors");
        startActivity(intent);
    }
}
