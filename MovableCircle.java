public class MovableCircle extends MovablePoint   {
private int Radius;
private MovablePoint Center;

    MovableCircle(int X, int Y, int XSpeed, int YSpeed, int radius) {
        super(X, Y, XSpeed, YSpeed);
        Radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "Radius=" + Radius +
                ", Center:"+
                " x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        y=y+1;
        ySpeed=ySpeed+y;
    }

    @Override
    public void moveDown() {
        y=y-1;
        ySpeed=ySpeed-y;
    }

    @Override
    public void moveRight() {
        x=x+1;
        xSpeed=xSpeed+x;
    }

    @Override
    public void moveLeft() {
        x=x-1;
        xSpeed=xSpeed-x;
    }
}
