module ni.edu.uam.gestionproductos {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.gestionproductos to javafx.fxml;
    exports ni.edu.uam.gestionproductos;
}