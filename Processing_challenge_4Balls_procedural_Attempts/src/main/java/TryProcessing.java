import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;

    int ball1 = 0;
    int ball2 = 0;
    int ball3 = 0;
    int ball4 = 0;


    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(getPositionOfXAxis(1), getPositionOfYAxis(1), TryProcessing.DIAMETER, DIAMETER);
        ellipse(getPositionOfXAxis(2), getPositionOfYAxis(2), TryProcessing.DIAMETER, DIAMETER);
        ellipse(getPositionOfXAxis(3), getPositionOfYAxis(3), TryProcessing.DIAMETER, DIAMETER);
        ellipse(getPositionOfXAxis(4), getPositionOfYAxis(4), TryProcessing.DIAMETER, DIAMETER);
    }

    private int getPositionOfXAxis(int speed) {
        switch(speed){
            case 1: ball1 += speed; return ball1;
            case 2: ball2 += speed; return ball2;
            case 3: ball3 += speed; return ball3;
            case 4: ball4 += speed; return ball4;
        }
        return 0;
    }

    private int getPositionOfYAxis(int unit) {
        return (unit * HEIGHT) / 5;
    }
}
