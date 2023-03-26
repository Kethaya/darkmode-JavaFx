package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private BorderPane parent;
    @FXML
    private ImageView exit;

    @FXML
    private ImageView changeImg;

    @FXML
    private Button chnageMode;

    private double mode = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        exit.setOnMouseClicked(event -> {
            System.exit(0);
        });

        chnageMode.setOnMouseClicked(event -> {
            if (mode == 0){
                parent.getStylesheets().add("styles/light_mode.css");
                parent.getStylesheets().remove("styles/dark_mode.css");
                Image image  = new Image("images/night-mode.png");
                changeImg.setImage(image);
                System.out.println(" light");
                mode = 1;
            }else{
                parent.getStylesheets().add("styles/dark_mode.css");
                parent.getStylesheets().remove("styles/light_mode.css");
                Image image  = new Image("images/brightness.png");
                changeImg.setImage(image);
                System.out.println("dark");
                mode = 0;
            }

        });
    }
}
