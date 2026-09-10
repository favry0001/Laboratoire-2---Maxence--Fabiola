package immobilier;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFx extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                MainFx.class.getResource("/fxml/vue-principale.fxml")
        );

        Scene scene = new Scene(loader.load(), 1200, 750);

        stage.setTitle("Catalogue Immobilier");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}