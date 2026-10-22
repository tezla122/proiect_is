module org.example.testconflict {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.testconflict to javafx.fxml;
    exports org.example.testconflict;
}