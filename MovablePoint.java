import ru.mirea.pr3.Movable;

public class MovablePoint implements Movable {
    protected int x=0;
    protected int y=0;
    protected int xSpeed=0;
    protected int ySpeed=0;

    MovablePoint(int X, int Y, int XSpeed, int YSpeed){
    x=X;
    y=Y;
    xSpeed=XSpeed;
    ySpeed=YSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
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
