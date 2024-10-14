module com.stagedemo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.stagedemo to javafx.fxml;
    exports com.stagedemo;
}
