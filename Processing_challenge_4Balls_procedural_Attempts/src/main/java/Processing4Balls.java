import processing.core.PApplet;

public class Processing4Balls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;
    int numberOfBalls = 4;
    int balls[] = new int[numberOfBalls];

    public static void main(String[] args) {
        PApplet.main("Processing4Balls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for(int iterator = 1 ; iterator <= numberOfBalls ; iterator++)
            ellipse(getPositionOfXAxis(iterator), getPositionOfYAxis(iterator), Processing4Balls.DIAMETER, DIAMETER);
    }

    private int getPositionOfXAxis(int speed) {
        balls[speed-1] += speed;
        return balls[speed-1];
    }

    private int getPositionOfYAxis(int unit) {
        return (unit * HEIGHT) / 5;
    }
}
