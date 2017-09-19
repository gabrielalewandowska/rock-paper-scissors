package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 19/09/2017.
 */
public class GameTest {
    Game game;
    NumberGenerating randomNumberGenerator;

    @Before
    public void before(){
        randomNumberGenerator = new RandomNumberGenerator();
        game = new Game();
    }

    @Test
    public void canGetAnswers(){
        assertEquals(3, game.getAnswers().size());
    }

    @Test
    public void canGetAnswersByIndex(){
        assertEquals("rock", game.getAnswerByIndex(0));
    }

    @Test
    public void canCompare(){
       String stringResult = game.compare("rock", "scissors");
        String drawResult = game.compare("rock", "rock");
        assertEquals("You've won!", stringResult);
        assertEquals("Draw! Play again!", drawResult);
    }

//    @Test
//    public void canGetRandomAnswer(){
//        assertEquals("nope", game.getComputersChoice(randomNumberGenerator));
//    }
//
//    @Test
//    public void testRandomNumberGenerator(){
//        assertEquals(1, randomNumberGenerator.generateNumber(3));
//    }

}