module com.buttonexplorer {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.buttonexplorer to javafx.fxml;
    exports com.buttonexplorer;
}
