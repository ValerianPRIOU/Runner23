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
        GameScene gameScene = new GameScene();
        Group root = new Group();
        Pane pane = new Pane(root);
        Scene theScene = new Scene(pane, 600, 400, true);
        primaryStage.setScene(theScene);

        primaryStage.show();

        }


        public static void main(String[]args){
        launch(args);
        }
}