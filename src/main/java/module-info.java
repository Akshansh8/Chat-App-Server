module org.example.messengerserver {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.messengerserver to javafx.fxml;
    exports org.example.messengerserver;
}