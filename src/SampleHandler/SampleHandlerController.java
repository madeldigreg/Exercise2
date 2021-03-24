package SampleHandler;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SampleHandlerController {
    @FXML
    private Label jumpingLabel;

    // Handler responds to the onMouseEntered event
    // When the mouse enters the jumpingLabel domain, the jumpingLabel moves to a new random position of co-ordinates (x, y) within the bounds of the scene
    public void movingLabel(){
        Random randomPos = new Random();
        jumpingLabel.setLayoutX(randomPos.nextInt(500));
        jumpingLabel.setLayoutY(randomPos.nextInt(300));
    } }