module adianov.sergei.covidrisk {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens adianov.sergei.covidrisk to javafx.fxml;
    exports adianov.sergei.covidrisk;
}