module com.layoutmanagerexplorer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.layoutmanagerexplorer to javafx.fxml;
    exports com.layoutmanagerexplorer;
}
