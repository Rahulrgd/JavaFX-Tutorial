module com.shape2d {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.shape2d to javafx.fxml;
    exports com.shape2d;
}
