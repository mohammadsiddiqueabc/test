import java.awt.*;
import java.util.concurrent.TimeUnit;

public class KeepMeAlive {

    public static void main(String[] args) {
    	Boolean moveFlag = true;
        try {
            // Run indefinitely
            while (true) {
                // Move the mouse cursor
                moveMouse(moveFlag);
                if(moveFlag)
                	moveFlag = false;
                else
                	moveFlag = true;

                TimeUnit.SECONDS.sleep(60);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void moveMouse(Boolean moveFlag) {
        try {
            // Get the current mouse position
            Point p = MouseInfo.getPointerInfo().getLocation();

            // Move the mouse cursor by a small amount
            Robot robot = new Robot();
            if(moveFlag)
            	robot.mouseMove(p.x + 1, p.y + 1);
            else
            	robot.mouseMove(p.x - 1, p.y - 1);
            	
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}

