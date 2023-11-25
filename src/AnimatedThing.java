import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;

public abstract class AnimatedThing {

    private double x;
    private double y;
    private ImageView sprite;
    private int attitude;

    private int index;
    private int maxIndex;
    private int delaiFrame;

    private String fileName;

    public AnimatedThing(double x, double y, String fileName) {

        this.x = x;
        this.y = y;

        this.sprite = new ImageView(fileName);

        this.sprite.setX(x);
        this.sprite.setY(y);

        this.sprite.setViewport(new Rectangle2D(0,0,75,100));

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getAttitude() {
        return attitude;
    }

    public int getIndex() {
        return index;
    }

    public int getMaxIndex() {
        return maxIndex;
    }

    public int getDelaiFrame() {
        return delaiFrame;
    }

    public ImageView getSprite() {
        return sprite;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setAttitude(int attitude) {
        this.attitude = attitude;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setMaxIndex(int maxIndex) {
        this.maxIndex = maxIndex;
    }

    public void setDelaiFrame(int delaiFrame) {
        this.delaiFrame = delaiFrame;
    }



}
