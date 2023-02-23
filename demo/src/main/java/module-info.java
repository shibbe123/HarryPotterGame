module shibbe123 {
    requires javafx.controls;
    requires javafx.fxml;

    opens shibbe123 to javafx.fxml;
    exports shibbe123;
}
