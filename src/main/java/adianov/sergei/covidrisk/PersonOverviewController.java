package adianov.sergei.covidrisk;

import adianov.sergei.covidrisk.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PersonOverviewController {

    @FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<Person,String> fioColumn;

    @FXML
    private Label fioLabel;
    @FXML Label birthdayLabel;

    private MainApp mainApp;

    public PersonOverviewController(){
    }

    @FXML
    private void initialize(){
        fioColumn.setCellValueFactory(cellData->cellData.getValue().fioProperty());
    }

    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;

        personTable.setItems(mainApp.getPersonData());
    }
}
