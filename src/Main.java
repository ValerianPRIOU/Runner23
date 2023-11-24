import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Image spriteSheet = new Image ("C:\\Users\\Valérian\\Desktop\\Bureau\\ENSEA\\2A_bis\\Java\\Runner\\Runner23\\Runner\\src\\img\\heros.png");
        //ImageView sprite = new ImageView(spriteSheet);
        //sprite.setViewport(new Rectangle2D(20,0,65,100));
        //sprite.setX(200);
        //sprite.setY(300);

        primaryStage.setTitle("Runner");
        Group root = new Group();
        Pane pane = new Pane(root);
        GameScene theScene = new GameScene(pane, 800, 400);
        //On met ici en place la scène (la fenêtre) dans laquelle se passera l'action.
        //On a besoin d'un pane, contenu lui-même dans un group car notre GameScene ne peut que s'afficher dans un pane.

        pane.getChildren().add(GameScene.getBackgroundLeft().getImageview());
        pane.getChildren().add(GameScene.getBackgroundRight().getImageview());

        primaryStage.setScene(theScene); //définit la scène que l'on veut voir (donc ici notre GameScene).
        primaryStage.show(); // Affiche la scène principale.

        }


        public static void main(String[]args){
        launch(args);
        } // Ce main est commun pour toutes les applications JFX?
}