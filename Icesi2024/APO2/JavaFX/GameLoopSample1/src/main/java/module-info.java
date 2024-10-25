module org.icesi.stardewvalley_demo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens org.icesi.stardewvalley_demo1 to javafx.fxml;
    exports org.icesi.stardewvalley_demo1;
    exports org.icesi.stardewvalley_demo1.view;
    opens org.icesi.stardewvalley_demo1.view to javafx.fxml;
}