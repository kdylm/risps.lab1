module com.example.rispslab1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rispslab1 to javafx.fxml;
    exports com.example.rispslab1;
    exports models;
    opens models to javafx.fxml;
}