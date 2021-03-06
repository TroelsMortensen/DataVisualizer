package datavisualizerwithobserver.view.textrepresentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TextController {

    @FXML
    Label eventLabel;

    @FXML
    TextField xTextField;
    @FXML
    TextField yTextField;
    @FXML
    TextField zTextField;

    private TextViewModel viewModel;

    public void init(TextViewModel vm) {
        viewModel = vm;
        xTextField.textProperty().bindBidirectional(vm.xStringProperty());
        yTextField.textProperty().bindBidirectional(vm.yStringProperty());
        zTextField.textProperty().bindBidirectional(vm.zStringProperty());
        eventLabel.textProperty().bind(vm.labelStringProperty());
    }

    public void onSaveButton() {
        viewModel.saveChanges();
    }
}
