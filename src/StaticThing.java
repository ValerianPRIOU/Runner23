import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {

    private double sizeX;
    private double sizeY;
    private String fileName;

    private Image background = new Image(fileName);
    private ImageView dispBackground = new ImageView(background);

    public StaticThing(double sizeX, double sizeY, String fileName) {

        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.fileName = fileName;

    }

    public ImageView getDispBackground() {
        return dispBackground;
    }
}
