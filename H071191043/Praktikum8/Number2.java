package eka.prak;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Number2 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane broot = new BorderPane();
        broot.setPadding(new Insets(20, 20, 10, 10));
        
        Text text1 = new Text("Kelompok");
        Text text2 = new Text("Data");

        VBox vbox1 = new VBox();
        vbox1.getChildren().add(text1);
        vbox1.setAlignment(Pos.CENTER);
        
        VBox vbox2 = new VBox();
        vbox2.getChildren().add(text2);
        vbox2.setAlignment(Pos.CENTER);

        RadioButton radioButton1 = new RadioButton("Kelompok 1");
        RadioButton radioButton2 = new RadioButton("Kelompok 2");
        RadioButton radioButton3 = new RadioButton("Kelompok 3");
        RadioButton radioButton4 = new RadioButton("Kelompok 4");
        RadioButton[] arrKelompok = {radioButton1, radioButton2, radioButton3, radioButton4};
        //creating a ToggleGroup
        ToggleGroup group = new ToggleGroup();
        //set ToggleGroup
        //In a Group, maximum only one button is selected
        radioButton1.setToggleGroup(group);
        radioButton2.setToggleGroup(group);
        radioButton3.setToggleGroup(group);
        radioButton4.setToggleGroup(group);

        GridPane gridPane1 = new GridPane();
        gridPane1.setHgap(10);
        gridPane1.setVgap(10);
        gridPane1.setPadding(new Insets(10));
        gridPane1.setStyle("-fx-border-color: black");
        GridPane.setConstraints(vbox1, 2, 0);
        GridPane.setConstraints(radioButton1, 1, 3);
        GridPane.setConstraints(radioButton2, 3, 3);
        GridPane.setConstraints(radioButton3, 1, 4);
        GridPane.setConstraints(radioButton4, 3, 4);
        gridPane1.getChildren().addAll(vbox1, radioButton1, radioButton2, radioButton3, radioButton4);

        TextField textField1 = new TextField();
        Label label1 = new Label("NIM");
        label1.setLabelFor(textField1);
        label1.setMnemonicParsing(true);

        TextField textField2 = new TextField();
        Label label2 = new Label("Nama");
        label2.setLabelFor(textField2);
        label2.setMnemonicParsing(true);

        Label label3 = new Label("Jenis Kelamin");
        RadioButton radioButton5 = new RadioButton("Laki - Laki");
        RadioButton radioButton6 = new RadioButton("Perempuan");
        RadioButton[] arrJenisKelamin = {radioButton5, radioButton6};

        ToggleGroup group1 = new ToggleGroup();
        radioButton5.setToggleGroup(group1);
        radioButton6.setToggleGroup(group1);

        GridPane gridPane2 = new GridPane();
        gridPane2.setHgap(10);
        gridPane2.setVgap(10);
        gridPane2.setPadding(new Insets(10));
        gridPane2.setStyle("-fx-border-color: black");
        GridPane.setConstraints(vbox2, 2, 0);
        GridPane.setConstraints(label1, 1, 1);
        GridPane.setConstraints(textField1, 3, 1);
        GridPane.setConstraints(label2, 1, 2);
        GridPane.setConstraints(textField2, 3, 2);
        GridPane.setConstraints(label3, 1, 3);
        GridPane.setConstraints(radioButton5, 2, 3);
        GridPane.setConstraints(radioButton6, 2, 4);
        gridPane2.getChildren().addAll(vbox2, label1, textField1, label2, textField2, label3, radioButton5, radioButton6);

        Button button1 = new Button("SAVE");
        button1.setPadding(new Insets(10, 10, 10, 10));
        BorderPane.setAlignment(button1, Pos.TOP_RIGHT);

        button1.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                
                Toggle toggle = group.getSelectedToggle();
                int kelompokIndex = -1;
                for (int i = 0; i < arrKelompok.length; i++){
                    if (arrKelompok[i] == toggle) {
                        kelompokIndex = i;
                        break;
                    }
                }

                String nama = textField2.getText();
                String nim = textField1.getText();

                Toggle toggle1 = group1.getSelectedToggle();
                String jenisKelamin = null;
                if (toggle1 == arrJenisKelamin[0]) {
                    jenisKelamin = "Laki - Laki";
                }
                else if (toggle1 == arrJenisKelamin[1]) {
                    jenisKelamin = "Perempuan";
                }

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                StringBuilder sbuilder = new StringBuilder();
                sbuilder.append("Nama : ");
                sbuilder.append(nama);
                sbuilder.append("\n");
                sbuilder.append("NIM : ");
                sbuilder.append(nim);
                sbuilder.append("\n");
                sbuilder.append("Jenis Kelamin : ");
                sbuilder.append(jenisKelamin);
                sbuilder.append("\n");
                sbuilder.append("Kelompok : ");
                sbuilder.append(kelompokIndex + 1);;
                alert.setTitle("INFORMATION");
                alert.setHeaderText("Data Information");
                alert.setContentText(sbuilder.toString());
                alert.showAndWait();

            }

        });

        BorderPane.setMargin(gridPane1, new Insets(10,10,10,10));
        BorderPane.setMargin(gridPane2, new Insets(10,10,10,10));
        BorderPane.setMargin(button1, new Insets(10,10,10,10));

        broot.setLeft(gridPane1);
        broot.setRight(gridPane2);
        broot.setBottom(button1);

        Scene scene = new Scene(broot, 700, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}