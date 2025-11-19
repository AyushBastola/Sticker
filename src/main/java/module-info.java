module com.example.sticker {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.sticker to javafx.fxml;
    exports com.example.sticker;
}