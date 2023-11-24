import javafx.scene.image.ImageView;

public class StaticThing {

    private double positionX;
    private double positionY;
    private String fileName;
    private ImageView imageview;

    public StaticThing(double positionX, double positionY, String fileName) {

        this.positionX = positionX;
        this.positionY = positionY;

        this.imageview = new ImageView(fileName);
        this.imageview.setX(positionX);
        this.imageview.setY(positionY);

    }

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public ImageView getImageview() {
        return imageview;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    //On met en place des setters pour les positions de X et Y parce que ce sont des valeurs qu'on va vouloir modifier
    //par la suite.
}
