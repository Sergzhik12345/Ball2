package siarhei.hrakau.ball.service;

import siarhei.hrakau.ball.model.Ball;
import siarhei.hrakau.ball.model.Basket;

import java.util.Arrays;
import java.util.Comparator;

public class BallServices {
    public double findFullMass (Basket basket){
        double fullMass =0;
        for (Ball ball: basket.getBalls()){
            fullMass+=ball.getWeight();
        }
        return fullMass;
    }
    public int countBallsByColour(Basket basket, Ball.ListOfColours colour) {
        int count = 0;
        for (Ball ball : basket.getBalls()) {
            if (ball.getColour() == colour) {
                count++;
            }
        }
        return count;
    }

}
