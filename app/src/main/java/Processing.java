import processing.core.PApplet;

public class Processing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x;
    public static void main(String[] args) {
        PApplet.main("Processing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void setup() {
        super.setup();
    }
    @Override
    public void draw() {
        int noOfBalls = 4;
        for (int i = 1; i <= noOfBalls; i++) {
            int YSpacing = (HEIGHT / (noOfBalls + 1)) * i;
            ellipse(x*i, YSpacing,DIAMETER,DIAMETER);
        }
        x++;
    }
}