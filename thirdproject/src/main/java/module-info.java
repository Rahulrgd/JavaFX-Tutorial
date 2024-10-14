module com.thirdproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.thirdproject to javafx.fxml;
    exports com.thirdproject;
}
