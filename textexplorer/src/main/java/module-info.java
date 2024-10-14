module com.textexplorer {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.textexplorer to javafx.fxml;
    exports com.textexplorer;
}
