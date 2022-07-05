import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MuwierMaus {
    public static void main(String[] args) throws AWTException, InterruptedException {
        PointerInfo a;
        Point b;
        int x;
        int y;
        final long startTime = System.currentTimeMillis();
        int howLongWorks;
        String timeStamp = new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
        System.out.println("Start  " + timeStamp);
        while (true) {
            a = MouseInfo.getPointerInfo();
            b = a.getLocation();
            x = (int) b.getX(); 
            y = (int) b.getY();
            Robot r = new Robot();
            r.mouseMove(x + 1, y + 1);
            r.mouseMove(x - 1, y - 1);
            Thread.sleep(55000);
            howLongWorks = (int) (System.currentTimeMillis() - startTime) / 1000 / 60;
            if ((howLongWorks % 60) < 10) {
                System.out.println(howLongWorks / 60 + ":0" + (howLongWorks % 60));
            } else {
                System.out.println(howLongWorks / 60 + ":" + howLongWorks % 60);
            }
        }
    }
}
