import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene {

    Camera camera = new Camera(0,0);

    private static StaticThing backgroundLeft;
    private static StaticThing backgroundRight;


    public GameScene(Parent parent, double x, double y) {

        super(parent, x, y); //Hérédité (Scene)

        this.backgroundLeft = new StaticThing(0, 0, "img/desert.png");
        this.backgroundRight = new StaticThing(0, 0, "img/desert.png");
        //On crée deux instances du fond. On les déplacera ensuite pour donner l'illusion de mouvement

        AnimationTimer rafraichissement = new AnimationTimer() {
            @Override
            public void handle(long l) {
                GameScene.defilement(l); //rafraichissement est responsable de la création d'un timer qui va permettre d'animer notre jeux
            }
        };

        rafraichissement.start(); // démarre le timer

    }

    public static StaticThing getBackgroundLeft() {
        return backgroundLeft;
    }

    public static StaticThing getBackgroundRight() {
        return backgroundRight;
    }
    private static void defilement(long l){

        int vitesse = 3;
        double xl = backgroundLeft.getPositionX();
        double xr = backgroundRight.getPositionX();

        if (xl < 4){
            backgroundLeft.getImageview().setX(800); //crée le fond de gauche et lui donne la taille de 800pixels en x.
            backgroundLeft.setPositionX(800); //prend le fond qui vient d'être créé et le met à x = 800.
            //Ici, on s'assure juste que le fond de gauche se refresh lorsqu'il arrive au bout du défilement.
            backgroundRight.getImageview().setX(0); // "efface" le fond de droite en rendant sa longueur nulle
            backgroundRight.setPositionX(0); //déplace le fond de droite tout à gauche
            //La combinaison de ces quatre lignes assure l'illusion de défilement en échangeant la place de ces deux fonds
            //Lorsque l'on arrive au bout de la longueur du fond de gauche.
        }
        else{
            backgroundLeft.getImageview().setX(xl - vitesse); //Fait disparaitre progressivement backgroundLeft
            backgroundLeft.setPositionX(xl - vitesse); // déplace l'origine de backgroundLeft
            backgroundRight.getImageview().setX(xr - vitesse);
            backgroundRight.setPositionX(xr - vitesse);

            //Cette partie du code est ce qui est responsable du défilement. D'ailleurs celui-ci scale en fonction de
            //la vitesse choisie.
        }

    }

}
