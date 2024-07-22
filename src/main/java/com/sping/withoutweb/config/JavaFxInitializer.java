package com.sping.withoutweb.config;

import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFxInitializer  extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        StageHandler.setScene("/frmae.fxml");
    }
    public static void launch() {
        Application.launch();
    }
}
