import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene {

    Camera camera = new Camera(0,0);

    private StaticThing backgroundLeft;
    private StaticThing backgroundRight;


    public GameScene(Parent parent, double x, double y) {

        super(parent, x, y); //Hérédité

        this.backgroundLeft = new StaticThing(0,0,"img/desert.png");
        this.backgroundRight = new StaticThing(0,0,"img/desert.png");
        //On crée deux instances du fond. On les déplacera ensuite pour donner l'illusion de mouvement

        AnimationTimer rafraichissement = new AnimationTimer(){
            @Override
            public void handle(long l){
                GameScene.defilement(l);
            }
        };

        rafraichissement.start();

        private static void defilement(long l){
            int vitesse = 3;

        }

    }


}
