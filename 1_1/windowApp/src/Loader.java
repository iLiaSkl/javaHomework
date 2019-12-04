import javax.swing.*;
import java.awt.*;

public class Loader {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        int d1 = 800;
        int d2 = 600;

        frame.setSize(d1, d2);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Our First Window App");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
