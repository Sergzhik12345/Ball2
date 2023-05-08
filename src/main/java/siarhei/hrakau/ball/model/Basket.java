package siarhei.hrakau.ball.model;

public class Basket {
    private Ball[] balls;

    public Basket(Ball[] balls) {
        this.balls = balls;
    }

    public Ball[] getBalls() {
        return balls;
    }
}
