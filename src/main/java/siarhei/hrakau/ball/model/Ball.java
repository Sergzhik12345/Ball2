package siarhei.hrakau.ball.model;

public class Ball {
    public enum ListOfColours {RED, BLUE, GREEN, BLACK, PINK};
    private ListOfColours colour;
    private double weight;

    public Ball(ListOfColours colour, double weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public ListOfColours getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }

}
