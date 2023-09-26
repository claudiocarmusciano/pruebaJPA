module com.example.integrador2 {
//    requires javafx.controls;
//    requires javafx.fxml;
    requires jakarta.persistence;


    opens com.example.integrador2 to javafx.fxml;
    exports com.example.integrador2;
}