package iskn90;

import iskn90.tab.TabFile;
import iskn90.tab.TabText;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private int width = 800;
    private int height = 600;

    @Override
    public void start(Stage stage) throws Exception {
        TabPane tabPane = new TabPane();

        tabPane.getTabs().addAll(
                new TabText().getTab(),
                new TabFile().getTab()
        );

        stage.setMinWidth(width);
        stage.setMinHeight(height);
        stage.setMaxWidth(width);
        stage.setMaxHeight(height);
        stage.setWidth(width);
        stage.setHeight(height);
        stage.setScene(new Scene(new VBox(tabPane), width, height));
        stage.show();
    }
}
