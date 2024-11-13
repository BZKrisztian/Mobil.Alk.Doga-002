package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class PrimaryController {

    @FXML
    private Button AboutButton;

    @FXML
    private TextField AreaResult;

    @FXML
    private Button CalcButton;

    @FXML
    private TextField aSideInput;

    @FXML
    private TextField bSideInput;

    @FXML
    private TextField cSideInput;

    @FXML
    private TextField dSideInput;


    @FXML
    void onClick(ActionEvent event) {
        Alert alert_projektinfo = new Alert(Alert.AlertType.INFORMATION);
        alert_projektinfo.setTitle("Nevjegyezes");
        alert_projektinfo.setHeaderText("Trapter");
        alert_projektinfo.setContentText("Batki Zoltan Krisztian, 2024-11-13, Szoft II/1/N \nhttps://github.com/BZKrisztian");
        alert_projektinfo.showAndWait();
    }

    @FXML
    void onClickStartCalc(ActionEvent event) {
        String aSide = aSideInput.getText();
        String bSide = bSideInput.getText();
        String cSide = cSideInput.getText();
        String dSide = dSideInput.getText();

        Double a = Double.parseDouble(aSide);
        Double b = Double.parseDouble(bSide);
        Double c = Double.parseDouble(cSide);
        Double d = Double.parseDouble(dSide);

        Double area = ((a+c)/(4*(a-c))) * (Math.sqrt((a+b-c+d)*(a-b-c+d)*(a+b-c-d)*(-a+b+c+d)));

        AreaResult.setText(String.valueOf(area));
    }

}
