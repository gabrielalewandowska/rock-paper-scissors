package com.example.user.rockpaperscissors;

import java.util.Random;

/**
 * Created by user on 19/09/2017.
 */

public class RandomNumberGenerator implements NumberGenerating {
    public int generateNumber(int upperLimit){
        Random random = new Random();
        int randomNumber = random.nextInt(upperLimit);
        return randomNumber;
    }
}
