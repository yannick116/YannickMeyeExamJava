/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class InscriptionEtudiantController implements Initializable {

    @FXML
    private TextField txt_numero;
    @FXML
    private ComboBox<?> cmb_classe_selection;
    @FXML
    private ComboBox<?> cmb_annee_selection;
    @FXML
    private Button btn_inscrire;
    @FXML
    private ComboBox<?> cmb_annee_filter;
    @FXML
    private ComboBox<?> cmb_classe_filter;
    @FXML
    private Button btn_ok;
    @FXML
    private TableView<?> tv_inscriptions;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
