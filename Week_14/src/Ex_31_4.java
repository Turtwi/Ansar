import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex_31_4 extends Application {
    private static int threadCount = 0;
    public static Timeline timeline;
    private static String allThread = "";
    private static Text text = new Text("");
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        String thisThread = "There are ";
        BorderPane borderPane = new BorderPane();
        stage.setScene(new Scene(borderPane, 400, 400));
        stage.show();
        borderPane.setCenter(text);
        BorderPane.setAlignment(text,Pos.TOP_CENTER);
        new Thread(() -> {
            timeline();
            try {
                ServerSocket serverSocket = new ServerSocket(666);
                while (true) {
                    Socket socket = serverSocket.accept();
                    threadCount++;
                    new Thread(() -> {
                        try {
                            DataOutputStream outClient = new DataOutputStream(socket.getOutputStream());
                            outClient.writeInt(threadCount);
                            allThread += thisThread + threadCount + " threads\n";
                            Platform.runLater(()->{
                                text.setText(allThread);
                            });
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }).start();
                }
            }catch (IOException e){
                throw new RuntimeException();
            }
        }).start();

    }
    public static void timeline(){
        timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(1),actionEvent -> {
            text.setText(allThread);
        });
        timeline.getKeyFrames().add(keyFrame);
        timeline.playFromStart();
    }
}
