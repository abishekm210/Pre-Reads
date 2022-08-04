public class Circle extends Frame{
    private int diameter;
    private int numberOfBalls;
    private int balls[];

    public int getPositionOfXAxis(int speed) {
        balls[speed-1] += speed;
        return balls[speed-1];
    }

    public int getPositionOfYAxis(int unit, int height) {
        return (unit * height) / 5;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getNumberOfBalls() {
        return numberOfBalls;
    }

    public void setNumberOfBalls(int numberOfBalls) {
        this.numberOfBalls = numberOfBalls;
        balls = new int[numberOfBalls];
    }
}
