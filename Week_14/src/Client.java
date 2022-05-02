import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client extends Application {
    private static DataInputStream inServer;
    private static DataOutputStream outServer;

    @Override
    public void start(Stage stage) throws Exception {
        Socket client = new Socket("localhost",666);
        inServer = new DataInputStream(client.getInputStream());
        outServer = new DataOutputStream(client.getOutputStream());
        BorderPane borderPane = new BorderPane();
        Text text = new Text("");
        text.setText(String.valueOf(inServer.readInt()));
        borderPane.setCenter(text);
        stage.setScene(new Scene(borderPane,400,400));
        stage.show();

    }
}
