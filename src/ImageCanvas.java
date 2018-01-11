import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ImageCanvas extends Component implements Updatable {
    Dimension dimension;
    BufferedImage image;

    public ImageCanvas(int width, int height, String imagePath) {
        setSize(width, height);
        dimension = new Dimension(width, height);
        try {
            URL url = this.getClass().getResource(imagePath);
            image = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint-container");
        g.drawImage(image, 0, 0, this);
    }

    @Override
    public Dimension getPreferredSize() {
        return dimension;
    }

    @Override
    public void update() {

    }
}
