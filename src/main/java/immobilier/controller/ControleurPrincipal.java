package immobilier.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControleurPrincipal {

    @FXML
    private TextField champRecherche;

    @FXML
    private ComboBox<String> comboTri;

    @FXML
    private TableView<Object> tableProprietes;

    @FXML
    private TableColumn<Object, String> colPrix;

    @FXML
    private TableColumn<Object, String> colType;

    @FXML
    private TableColumn<Object, String> colVille;

    @FXML
    private TableColumn<Object, String> colChambres;

    @FXML
    private TableColumn<Object, String> colSuperficie;

    @FXML
    private Button btnPrecedent;

    @FXML
    private Button btnSuivant;

    @FXML
    private Button btnFavoris;

    @FXML
    private Label labelPage;

    @FXML
    private Label labelPrix;

    @FXML
    private Label labelTransaction;

    @FXML
    private Label labelAdresse;

    @FXML
    private Label labelInfos;

    @FXML
    public void initialize() {

        comboTri.getItems().addAll(
                "Prix croissant",
                "Prix décroissant",
                "Superficie décroissante",
                "Année de construction",
                "Date de publication",
                "Prix au pied carré"
        );

        comboTri.setPromptText("Trier par");
    }
}