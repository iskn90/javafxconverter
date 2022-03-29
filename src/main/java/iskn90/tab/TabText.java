package iskn90.tab;

import iskn90.util.JsonUtil;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TabText {
    private TextArea textAreaLeft;
    private TextArea textAreaRight;

    public Tab getTab() {
        Tab tab = new Tab("Text");
        tab.setClosable(false);

        BorderPane borderPane = new BorderPane();
        HBox top = new HBox();

        HBox left = new HBox();
        left.setPadding(new Insets(20));
        textAreaLeft = new TextArea();
        textAreaLeft.setPrefWidth(300);
        textAreaLeft.setPrefHeight(500);
        textAreaLeft.setMaxWidth(300);
        textAreaLeft.setMaxHeight(500);
        left.getChildren().add(textAreaLeft);

        HBox center = new HBox();
        center.setAlignment(Pos.CENTER);
        VBox vBoxCenter = new VBox();
        vBoxCenter.setAlignment(Pos.CENTER);
        vBoxCenter.setSpacing(10);

        Button buttonXmlToJson = new Button("xml -> json");
        buttonXmlToJson.setOnAction(e -> {
            textAreaRight.setText(JsonUtil.convertXmlToJson(textAreaLeft.getText()));
        });
        vBoxCenter.getChildren().add(buttonXmlToJson);
        Button buttonPrettyJson = new Button("pretty json");
        buttonPrettyJson.setOnAction(e -> {
            textAreaRight.setText(JsonUtil.pretty(textAreaLeft.getText()));
        });
        vBoxCenter.getChildren().add(buttonPrettyJson);
        center.getChildren().add(vBoxCenter);

        HBox right = new HBox();
        right.setPadding(new Insets(20));
        textAreaRight = new TextArea();
        textAreaRight.setPrefWidth(300);
        textAreaRight.setPrefHeight(500);
        textAreaRight.setMaxWidth(300);
        textAreaRight.setMaxHeight(500);
        right.getChildren().add(textAreaRight);

        HBox bottom = new HBox();
        borderPane.setTop(top);
        borderPane.setLeft(left);
        borderPane.setCenter(center);
        borderPane.setRight(right);
        borderPane.setBottom(bottom);

        tab.setContent(borderPane);

        return tab;
    }
}
