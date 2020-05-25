package id.ardnn;

import id.ardnn.button_clicked.Button_Add;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class RightLayout {
    private Button_Add obj_btnAdd = new Button_Add();

    private Text txt_data, txt_nim, txt_nama, txt_jk, txt_kelompok;
    private TextField tf_nama, tf_nim;
    private RadioButton radio_laki, radio_perempuan;
    private ChoiceBox<String> choice_kelompok;
    private Button btn_add;
    private Separator sep_top, sep_bot;

    private GridPane grid_data;
    private VBox box_layout;

    // private String name, nim, gender, group;

    public VBox layout() {
        //text
        txt_data = new Text("Data's Group member");
        txt_nama = new Text("Name");
        txt_nim = new Text("NIM");
        txt_jk = new Text("Gender");
        txt_kelompok = new Text("Group");

        //textfield
        tf_nama = new TextField();
        tf_nama.setPromptText("Your name");

        tf_nim = new TextField();
        tf_nim.setPromptText("Your NIM");

        //radio button
        radio_laki = new RadioButton("Male");
        radio_perempuan = new RadioButton("Female");
        
        // add radio button to toggle group
        ToggleGroup toggle_jk = new ToggleGroup();
        radio_laki.setToggleGroup(toggle_jk);
        radio_perempuan.setToggleGroup(toggle_jk);

        //choice box group
        choice_kelompok = new ChoiceBox<>();
        choice_kelompok.getItems().addAll("Group 1", "Group 2", "Group 3", "Group 4");
        choice_kelompok.setValue("Group 1");

        //button
        btn_add = new Button(" ADD ");
        btn_add.setPadding(new Insets(10, 25, 10, 25));

        //action if button add clicked
        btn_add.setOnAction(e -> {
            String name = tf_nama.getText();
            String nim = tf_nim.getText();
            String gender = 
                radio_laki.isSelected() ? "Male": radio_perempuan.isSelected() ? "Female" : "";
            String group = choice_kelompok.getValue();

            if (name.isEmpty()|| nim.isEmpty() || gender == "")
                AlertBox.display("Please fill in all the fields");
            else 
                obj_btnAdd.action(name, nim, gender, group);
        });

        //separator
        sep_bot = new Separator(Orientation.HORIZONTAL);
        sep_top = new Separator(Orientation.HORIZONTAL);

        //grid data
        grid_data = new GridPane();
        grid_data.setPadding(new Insets(12, 12, 12, 12));
        grid_data.setVgap(12);
        grid_data.setHgap(50);
        grid_data.setAlignment(Pos.CENTER);

        grid_data.add(txt_nama, 0, 0);
        grid_data.add(txt_nim, 0, 1);
        grid_data.add(txt_jk, 0, 2);
        grid_data.add(txt_kelompok, 0, 4);

        grid_data.add(tf_nama, 1, 0);
        grid_data.add(tf_nim, 1, 1);
        grid_data.add(radio_laki, 1, 2);
        grid_data.add(radio_perempuan, 1, 3);
        grid_data.add(choice_kelompok, 1, 4);

        //box layout
        box_layout = new VBox(15);
        box_layout.getChildren().addAll(txt_data, sep_top, grid_data, sep_bot, btn_add);
        box_layout.setPadding(new Insets(20, 20, 20, 20));
        box_layout.setAlignment(Pos.CENTER);

        return box_layout;
    }

    // //setter
    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setNim(String nim) {
    //     this.nim = nim;
    // }

    // public void setGender(boolean isMale) {
    //     this.gender = isMale ? "Male" : "Female";
    // }

    // public void setGroup(String group) {
    //     this.group = group;
    // }

    // //getter
    // public String getName() {
    //     return name;
    // }

    // public String getNim() {
    //     return this.nim;
    // }

    // public String getGender() {
    //     return this.gender;
    // }

    // public String getGroup() {
    //     return this.group;
    // }
}