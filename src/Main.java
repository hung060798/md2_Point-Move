public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        System.out.println(p1.toString());

        MovablePoint m1 = new MovablePoint();
        m1.setSpeed(3,4);
        m1.setxy(1,2);
        System.out.println(m1.toString());
        m1.move();
        System.out.printf(m1.toString());
    }
}
