package com.sping.withoutweb.controller;

import com.sping.withoutweb.service.service;
import com.sping.withoutweb.service.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Component;

@Component
public class controller {


    @FXML
    private TextField lastname;

    @FXML
    private TextField name;

    @FXML
    private Button save;

    @FXML
    void lastnameAction(ActionEvent event) {

    }

    @FXML
    void nameAction(ActionEvent event) {

    }


    @FXML
    void saveAction(ActionEvent event) {
        System.out.println("Apasare este " + name.getText() + " " + lastname.getText());


        service service = new serviceImpl();
        service.instertToDb(name.getText(), lastname.getText());

    }


}
