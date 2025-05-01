module com.example.cs210finalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cs210finalproject to javafx.fxml;
    exports com.example.cs210finalproject;
}