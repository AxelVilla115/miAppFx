module com.project.miappfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.miappfx to javafx.fxml;
    exports com.project.miappfx;
}