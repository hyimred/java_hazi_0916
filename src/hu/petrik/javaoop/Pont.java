package hu.petrik.javaoop;

public class Pont {
    private int x;
    private int y;

    public Pont() {
        this.x = 0;
        this.y = 0;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pont(int n) {
        this.x = koordinataGeneralasa(n);
        this.y = koordinataGeneralasa(n);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getTavolsagAzOrigotol() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        //return Math.sqrt(Math.pow(this.x - 0, 2) + Math.pow(this.y - 0, 2));
        //return tavolsag(new Pont());
    }

    public double tavolsag(Pont masikPont) {
        return Math.sqrt(Math.pow(this.x - masikPont.x, 2) + Math.pow(this.y - masikPont.y, 2));
    }

    private int koordinataGeneralasa(int n) {
        return (int) (Math.random() * (2 * n + 1)) - n;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
