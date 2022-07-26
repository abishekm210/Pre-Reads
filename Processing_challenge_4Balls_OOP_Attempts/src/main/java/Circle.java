
public class Circle extends Frame{
    private int diameter;
    private int ball1 = 0;
    private int ball2 = 0;
    private int ball3 = 0;
    private int ball4 = 0;

    public int getPositionOfXAxis(int speed) {
        switch(speed) {
            case 1: ball1 += 1; return ball1;
            case 2: ball2 += 2; return ball2;
            case 3: ball3 += 3; return ball3;
            case 4: ball4 += 4; return ball4;
        }
        return 0;
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
}
