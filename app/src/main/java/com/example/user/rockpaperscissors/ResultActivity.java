package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView computerChoiceBox;
    TextView userChoiceBox;
    TextView resultBox;
    RandomNumberGenerator randomNumberGenerator;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        game = new Game();
        randomNumberGenerator = new RandomNumberGenerator();

        userChoiceBox = (TextView) findViewById(R.id.text_user_choice);

        String userChoiceString = extras.getString("choice");
        userChoiceBox.setText( userChoiceString );
        String randomComputerAnswer = game.getComputersChoice(randomNumberGenerator);

        computerChoiceBox = (TextView) findViewById(R.id.text_computer_choice);
        computerChoiceBox.setText(randomComputerAnswer);

        String comparisonResult = game.compare(userChoiceString, randomComputerAnswer);

        resultBox = (TextView) findViewById(R.id.text_result_string);
        resultBox.setText(comparisonResult);


    }
}
