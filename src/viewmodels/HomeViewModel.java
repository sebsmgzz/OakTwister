package viewmodels;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class HomeViewModel implements ViewModel {

    private StringProperty output;
    private StringProperty input;

    public StringProperty getOutput() {
        return output;
    }

    public StringProperty getInput() {
        return input;
    }

    public HomeViewModel() {
        this.output = new SimpleStringProperty();
        this.input = new SimpleStringProperty();
    }

    public void update() {
        output.setValue(input.getValue());
    }

}
