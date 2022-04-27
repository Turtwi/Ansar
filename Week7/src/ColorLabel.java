import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ColorLabel extends Application {
        public double x = 0;

        @Override
        public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();

        RadioButton radioRed = new RadioButton("Red");
        RadioButton radioYellow = new RadioButton("Yellow");
        RadioButton radioBlack = new RadioButton("Black");
        RadioButton radioOrange = new RadioButton("Orange");
        RadioButton radioGreen = new RadioButton("Green");

        ToggleGroup toggleGroup = new ToggleGroup();
        radioRed.setToggleGroup(toggleGroup);
        radioYellow.setToggleGroup(toggleGroup);
        radioBlack.setToggleGroup(toggleGroup);
        radioOrange.setToggleGroup(toggleGroup);
        radioGreen.setToggleGroup(toggleGroup);

        Label label = new Label("This is text!");
        HBox hBoxLabel = new HBox();
        hBoxLabel.getChildren().add(new StackPane(label));
        hBoxLabel.setAlignment(Pos.CENTER);

        radioRed.setOnAction(e ->{
                if(radioRed.isSelected()){
                        label.setStyle("-fx-text-fill: RED");
                }
        });
        radioYellow.setOnAction(e ->{
                if(radioYellow.isSelected()){
                        label.setStyle("-fx-text-fill: Yellow");
                }
        });
        radioBlack.setOnAction(e ->{
                if(radioBlack.isSelected()){
                        label.setStyle("-fx-text-fill: Black");
                }
        });
        radioOrange.setOnAction(e ->{
                if(radioOrange.isSelected()){
                        label.setStyle("-fx-text-fill: Orange");
                }
        });
        radioGreen.setOnAction(e ->{
                if(radioGreen.isSelected()){
                        label.setStyle("-fx-text-fill: Green");
                }
        });

        Button btnRight = new Button("->");
        btnRight.setOnAction(e->{
                if(hBoxLabel.getAlignment().equals(Pos.CENTER_LEFT)){
                        hBoxLabel.setAlignment(Pos.CENTER);
                }
                else {
                        hBoxLabel.setAlignment(Pos.CENTER_RIGHT);
                }

        });
        Button btnLeft = new Button("<-");
        btnLeft.setOnAction(e ->{
                if(hBoxLabel.getAlignment().equals(Pos.CENTER_RIGHT)){
                        hBoxLabel.setAlignment(Pos.CENTER);
                }
                else {
                        hBoxLabel.setAlignment(Pos.CENTER_LEFT);
                }

        });
        HBox hboxButton = new HBox();
        hboxButton.setAlignment(Pos.CENTER);
        hboxButton.getChildren().addAll(new StackPane(btnLeft),new StackPane(btnRight));

        HBox hBoxColors =new HBox();
        hBoxColors.setAlignment(Pos.CENTER);
        hBoxColors.getChildren().addAll(new StackPane(radioRed),new StackPane(radioYellow), new StackPane(radioBlack), new StackPane(radioOrange),new StackPane(radioGreen));

        VBox vBox = new VBox();
        vBox.getChildren().addAll(new StackPane(hBoxColors),new StackPane(hBoxLabel), new StackPane(hboxButton));
        borderPane.getChildren().add(new StackPane(vBox));
        borderPane.setCenter(vBox);
        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.setTitle("16.1");
        stage.show();
    }
        public static void main(String[] args){
        launch();
    }

}
