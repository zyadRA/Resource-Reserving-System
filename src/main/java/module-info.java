module com.example.resourcereservingsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.resourcereservingsystem to javafx.fxml;
    exports com.example.resourcereservingsystem;
}