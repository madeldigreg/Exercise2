package SampleHandler;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage SampleHandler) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("SampleHandler.fxml")); // Loads the FXML file
        SampleHandler.setTitle("SampleHandler"); // Stage title is changed to SampleHandler
        SampleHandler.setScene(new Scene(root, 700, 500)); // Builds the scene graph in memory and specifies scene dimensions of 700x500
        SampleHandler.show(); // Displays the GUI
    }


    // The application main method
    public static void main(String[] args) {
        launch(args);
    }
}
