package eka.prak;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Number3 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Button button1 = new Button("Choose File");

        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setPrefHeight(800);

        button1.setOnAction(new OpenFile(button1, textArea, stage));

        VBox root = new VBox();
        VBox.setMargin(button1, new Insets(24, 16, 16, 16));
        VBox.setMargin(textArea, new Insets(8));
        root.setAlignment(Pos.TOP_CENTER);
        root.getChildren().addAll(button1, textArea);

        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.setTitle("File Reader");
        stage.show();
    }

    static String readFile(File file) throws Exception{
        final int size = 4096;

        FileInputStream input = new FileInputStream(file);
        ByteArrayOutputStream tempOut = new ByteArrayOutputStream();

        byte[] buf = new byte[size];
        int readed = 0;
        do {
            readed = input.read(buf);
            tempOut.write(buf, 0, readed);
        }
        while (readed == size);
            String out = tempOut.toString("UTF-8");
            input.close();
            return out;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}