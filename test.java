import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class test extends Application {
    @Override
    public void start(Stage stage) {
        WebView webView = new WebView();
        webView.getEngine().load("https://gootraxian.github.io/Blog/");

        Scene scene = new Scene(webView, 800, 600);
        stage.setScene(scene);
        stage.setTitle("CinderBlock");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

