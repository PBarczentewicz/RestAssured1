module com.example.projectnew {
    requires javafx.controls;
    requires javafx.fxml;
    requires rest.assured;


    opens com.example.projectnew to javafx.fxml;
    exports com.example.projectnew;
}