import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import static javafx.scene.input.KeyCode.DOWN;
import static javafx.scene.input.KeyCode.UP;

public class CarMove extends Application {
    public int x = 0;
    public int speed = 40;

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Scene scene =new Scene(borderPane,500,100);

        Image image = new Image("C:\\Users\\Админ\\Desktop\\Car.png");
        ImageView imageView = new ImageView(image);

        borderPane.getChildren().add(imageView);
        imageView.setX(x);
        imageView.setY(0);

        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(1), actionEvent -> {
            x = x + speed;
            if(x >= 400){
                x = 0;
            }
            imageView.setX(x);
            if(speed <= 0){
                speed = 0;
            }

        });
        timeline.getKeyFrames().add(keyFrame);
        timeline.play();

        Button btnPause = new Button();
        borderPane.getChildren().add(new StackPane(btnPause));
        btnPause.setOnMousePressed(e ->{
            timeline.stop();
        });
        btnPause.setOnMouseReleased(e ->{
            timeline.play();
        });
        btnPause.setPrefSize(500,100);
        btnPause.setStyle("-fx-background-color: transparent");
        borderPane.setCenter(btnPause);

        Button btnUP = new Button();
        borderPane.getChildren().add(btnUP);
        btnUP.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()) {
                    case UP -> {
                        speed = speed + 20;
                        System.out.println(speed);
                    }
                }
            }
        });

        Button btnDOWN = new Button();
        borderPane.getChildren().add(btnDOWN);
        btnDOWN.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()) {
                    case DOWN -> {
                        speed = speed - 20;
                        System.out.println(speed);
                    }
                }
            }
        });

        borderPane.setStyle("-fx-background-color: White");
        stage.setScene(scene);
        stage.setTitle("15.29");
        stage.show();


    }
    public static void main(String[] args){
        launch();
    }
}
