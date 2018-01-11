import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Frame frame = new CustomFrame();
        frame.setTitle("TEST");
        frame.setSize(300, 300);

        CustomPanel panel = new CustomPanel();
        panel.setBackground(Color.black);
        panel.setSize(300, 300);
        panel.setLayout(null);
        frame.add(panel);

        CustomLabel label1 = new CustomLabel("STAR WARS",new Font("Serif" , Font.BOLD , 30));
        panel.add(label1);
        label1.setLocation(panel.getWidth() / 2 - label1.getWidth() / 2, panel.getHeight()-50);

        CustomLabel label2 = new CustomLabel("A long time ago in a galaxy far, far away....", new Font("Serif" , Font.PLAIN , 15));
        panel.add(label2);
        label2.setLocation(panel.getWidth() / 2 - label2.getWidth() / 2, panel.getHeight());

        ImageCanvas background = new ImageCanvas(300, 300, "resources/images/background.jpeg");
        panel.add(background);
        background.setLocation(0, 0);

        Thread thread = new Thread(panel);
        thread.start();

        frame.setVisible(true);
    }

}
