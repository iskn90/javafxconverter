package iskn90.tab;

import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class TabFile {
    public Tab getTab() {
        Tab tab = new Tab("File");
        tab.setClosable(false);

        BorderPane borderPane = new BorderPane();
        HBox top = new HBox();
        HBox left = new HBox();
        HBox center = new HBox();
        HBox right = new HBox();
        HBox bottom = new HBox();
        borderPane.getChildren().addAll(top, left, center, right, bottom);

        tab.setContent(borderPane);

        //        Button button = new Button("Say 'Hello World'");
//        button.setOnAction(e -> {
//        });
        return tab;
    }
}
