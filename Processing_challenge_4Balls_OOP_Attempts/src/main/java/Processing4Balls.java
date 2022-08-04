import processing.core.PApplet;
public class TryProcessing extends PApplet {

    Frame frame = new Frame();
    Circle circle = new Circle();

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        frame.setWidth(640);
        frame.setHeight(480);
        circle.setDiameter(20);
        size(frame.getWidth(), frame.getHeight());
    }

    @Override
    public void draw() {
        ellipse(getPositionOfXAxis(1), getPositionOfYAxis(1), getDiameter(), getDiameter());
        ellipse(getPositionOfXAxis(2), getPositionOfYAxis(2), getDiameter(), getDiameter());
        ellipse(getPositionOfXAxis(3), getPositionOfYAxis(3), getDiameter(), getDiameter());
        ellipse(getPositionOfXAxis(4), getPositionOfYAxis(4), getDiameter(), getDiameter());
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
