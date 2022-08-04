import processing.core.PApplet;
public class Processing4Balls extends PApplet {

    Frame frame = new Frame();
    Circle circle = new Circle();

    public static void main(String[] args) {
        PApplet.main("Processing4Balls", args);
    }

    @Override
    public void settings() {
        super.settings();
        frame.setWidth(640);
        frame.setHeight(480);
        circle.setDiameter(20);
        circle.setNumberOfBalls(4);
        size(frame.getWidth(), frame.getHeight());
    }

    @Override
    public void draw() {
        for(int iterator = 1 ; iterator <= circle.getNumberOfBalls() ; iterator++)
            ellipse(getPositionOfXAxis(iterator), getPositionOfYAxis(iterator), getDiameter(), getDiameter());
    }

    private int getDiameter() {
        return circle.getDiameter();
    }

    private int getPositionOfYAxis(int unit) {
        return circle.getPositionOfYAxis(unit, frame.getHeight());
    }

    private int getPositionOfXAxis(int speed) {
        return circle.getPositionOfXAxis(speed);
    }

}
