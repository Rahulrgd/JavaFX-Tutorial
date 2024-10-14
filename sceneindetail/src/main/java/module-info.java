module com.sceneindetail {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sceneindetail to javafx.fxml;
    exports com.sceneindetail;
}
