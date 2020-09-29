import ru.mirea.pr3.Movable;

public class MovablePoints implements Movable {
    protected int x1;
    protected int x2;
    protected int y1;
    protected int y2;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoints(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        y1=y1+1;
        y2=y2+1;
        ySpeed=ySpeed+1;
    }

    @Override
    public void moveDown() {
        y1=y1-1;
        y2=y2-1;
        ySpeed=ySpeed-1;
    }

    @Override
    public void moveRight() {
        x1=x1+1;
        x2=x2+1;
        xSpeed=xSpeed+1;
    }

    @Override
    public void moveLeft() {
        x1=x1-1;
        x2=x2-1;
        xSpeed=xSpeed-1;
    }
    public void stabilizeSpeed(){
        if(ySpeed>xSpeed){
            xSpeed=ySpeed;
        }
        if(ySpeed<xSpeed){
            ySpeed=xSpeed;
        }
    }
}
