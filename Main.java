public class Main {
        public static void main(String[] args) {
                MovablePoint A = new MovablePoint(0, 0, 0, 0);
                A.moveUp();
                A.moveRight();
                A.moveUp();
                System.out.println(A);

                MovableCircle B = new MovableCircle(0, 0, 0, 0, 5);
                B.moveDown();
                B.moveLeft();
                B.moveDown();
                B.moveDown();
                System.out.println(B);

                MovableRectangle C=new MovableRectangle(0,1,0,1,0,0);
                C.moveUp();
                C.moveRight();
                C.moveUp();
                C.stabilizeSpeed();
                System.out.println(C);
        }

}
