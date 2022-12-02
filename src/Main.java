import java.awt.*;
import java.awt.event.InputEvent;

public class Main {
    public static void main(String[] args) {
        try{
            Robot clicker = new Robot();
            int click = InputEvent.BUTTON1_DOWN_MASK;
            int counter = 0;
            while (counter != 20 * 60 * 60){
                clicker.mousePress(click);
                Thread.sleep(10);
                clicker.mouseRelease(click);
                Thread.sleep(40);
                counter++;
        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
