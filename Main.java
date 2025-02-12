import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Voice Expense Tracker");
        Scene scene = new Scene(label, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Voice Expense Tracker");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}