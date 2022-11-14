module com.example.fxmlswap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxmlswap to javafx.fxml;
    exports com.example.fxmlswap;
}