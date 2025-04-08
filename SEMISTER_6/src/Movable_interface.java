public interface Movable_interface {
    interface Movable {
        void move();
    }


    interface Drawable {
        void draw();
    }


    class Robot implements Movable, Drawable {
        @Override
        public void move() {
            System.out.println("Robot is moving.");
        }

        @Override
        public void draw() {
            System.out.println("Robot is drawing.");
        }
    }

    public class Main {
        public static void main(String[] args) {

            Robot robot = new Robot();


            robot.move();
            robot.draw();
        }
    }
}
