package siarhei.hrakau.ball.main;

import siarhei.hrakau.ball.model.Ball;
import siarhei.hrakau.ball.model.Basket;
import siarhei.hrakau.ball.service.BallServices;

import java.util.Arrays;

public class BallsApplication {
    public static void main (String[] args){
        Ball ball1 = new Ball(Ball.ListOfColours.RED, 3 );
        Ball ball2 = new Ball(Ball.ListOfColours.BLUE, 2 );
        Ball ball3 = new Ball(Ball.ListOfColours.GREEN, 2 );
        Ball ball4 = new Ball(Ball.ListOfColours.GREEN, 1 );
        Ball[] balls = {ball1,ball2,ball3,ball4};
        Basket basket = new Basket(balls);

        BallServices ballServices = new BallServices();
        double fullMass = ballServices.findFullMass(basket);
        System.out.println(fullMass);


        for (Ball.ListOfColours colour : Ball.ListOfColours.values()) {
            int count = ballServices.countBallsByColour(basket, colour);
            if (count > 0) {
                System.out.println("There are "+count+" "+colour+" balls in the basket.");
            }
        }

    }
}
