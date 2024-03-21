import java.awt.*;
import java.util.concurrent.TimeUnit;

public class KeepMeAlive {

    public static void main(String[] args) {
        try {
            // Run indefinitely
            while (true) {
                // Move the mouse cursor
                moveMouse();

                // Wait for a short duration
                TimeUnit.SECONDS.sleep(30);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void moveMouse() {
        try {
            // Get the current mouse position
            Point p = MouseInfo.getPointerInfo().getLocation();

            // Move the mouse cursor by a small amount
            Robot robot = new Robot();
            robot.mouseMove(p.x + 1, p.y + 1);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}

