package com.example.user.rockpaperscissors;

import java.util.ArrayList;

/**
 * Created by user on 19/09/2017.
 */

public class Game {

    private ArrayList<String> answers;

    public Game() {
        this.answers = new ArrayList<>();
        this.answers.add("rock");
        this.answers.add("paper");
        this.answers.add("scissors");
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public int getLength(){
        return this.answers.size();
    }

    public String getAnswerByIndex(int index){
        return this.answers.get(index);
    }

    public String getComputersChoice(NumberGenerating randomNumber){
        int randomIndex = randomNumber.generateNumber(getLength());
        String randomComputerChoice = getAnswerByIndex(randomIndex);
        return randomComputerChoice;
    }

    public String compare(String userInput, String computerChoice){
        userInput = userInput.toLowerCase().trim();
        computerChoice = computerChoice.toLowerCase().trim();
        String userWon = "You've won!";
        String computerWon = "You lose!";



        if (userInput.equals("rock") && computerChoice.equals("scissors")){
            return userWon;
        } else if (userInput.equals("scissors")  && computerChoice.equals("paper")){
            return userWon;
        } else if (userInput.equals("paper") && computerChoice.equals("rock")){
            return userWon;
        } else if (computerChoice.equals("rock") && userInput.equals("scissors")){
            return computerWon;
        } else if (computerChoice.equals("scissors") && userInput.equals("paper")){
            return computerWon;
        } else if (computerChoice.equals("paper") && userInput.equals("rock")){
            return computerWon;
        } else if (computerChoice.equals(userInput)) {
            return "Draw! Play again!";
        } else {
            return "Incorrect input";
        }

    }


}
