package hu.petrik.javaoop;

public class Kor {
    Pont center = new Pont();
    double radius;

    public Kor(double r) {
        this.radius = r;
    }

    public Kor(int x, int y, double r) {
        this.center.setX(x);
        this.center.setY(y);
        this.radius = r;
    }

}