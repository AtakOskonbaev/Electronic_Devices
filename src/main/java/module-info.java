module com.example.electronic_devices {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.electronic_devices to javafx.fxml;
    exports com.example.electronic_devices;
}