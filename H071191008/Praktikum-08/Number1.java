package eka.prak;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Number1 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        CheckBox checkBox1 = new CheckBox("Spicy Chicken");
        CheckBox checkBox2 = new CheckBox("Beef Bulgogi");
        CheckBox checkBox3 = new CheckBox("Chicken Feet");
        CheckBox checkBox4 = new CheckBox("Cheese Buldak");
        CheckBox checkBox5 = new CheckBox("Pork Bulgogi");

        Label label1 = new Label("Rp. 50.000,00");
        Label label2 = new Label("Rp. 75.000,00");
        Label label3 = new Label("Rp. 65.000,00");
        Label label4 = new Label("Rp. 80.000,00");
        Label label5 = new Label("Rp. 70.000,00");

        TextField textField1 = new TextField();
        textField1.setPrefWidth(50);
        TextField textField2 = new TextField();
        textField2.setPrefWidth(50);
        TextField textField3 = new TextField();
        textField3.setPrefWidth(50);
        TextField textField4 = new TextField();
        textField4.setPrefWidth(50);
        TextField textField5 = new TextField();
        textField5.setPrefWidth(50);

        Button button1 = new Button("Total Price");
        Label label = new Label("");

        button1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                int tF1 = Integer.parseInt(0 + textField1.getText());
                int tF2 = Integer.parseInt(0 + textField2.getText());
                int tF3 = Integer.parseInt(0 + textField3.getText());
                int tF4 = Integer.parseInt(0 + textField4.getText());
                int tF5 = Integer.parseInt(0 + textField5.getText());
                int hasil = ((tF1 * 50000) + (tF2 * 75000) + (tF3 * 65000) + (tF4 * 80000) + (tF5 * 70000));
                label.setText(String.valueOf("Rp." + hasil + ",00"));
            }
        });

        GridPane root = new GridPane();
        root.setPadding(new Insets(20));
        root.setHgap(25);
        root.setVgap(10);

        root.addRow(0, checkBox1, label1, textField1);
        root.addRow(1, checkBox2, label2, textField2);
        root.addRow(2, checkBox3, label3, textField3);
        root.addRow(3, checkBox4, label4, textField4);
        root.addRow(4, checkBox5, label5, textField5);
        root.setRowIndex(button1, 5);
        root.setColumnIndex(button1, 1);
        root.setRowIndex(label, 5);
        root.setColumnIndex(label, 2);
        root.getChildren().addAll(button1, label);

        Scene scene = new Scene (root, 550, 250);
        stage.setScene(scene);
        stage.setTitle("Restaurant");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}