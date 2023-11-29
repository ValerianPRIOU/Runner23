import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Hero extends AnimatedThing {

    public Hero(){
        super(20,245,"img/heros.png");
    }

    @Override
    public void deplacement(long l) {
        super.deplacement(l);
        // Votre logique spécifique à Hero, si nécessaire.
    }

}
