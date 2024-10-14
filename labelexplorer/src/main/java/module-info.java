module com.labelexplorer {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.labelexplorer to javafx.fxml;
    exports com.labelexplorer;
}
