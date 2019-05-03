package Calculator.cal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller{
  @FXML
  private Button Button_1;
  @FXML
  private Button Button_2;
  @FXML
  private Button Button_3;
  @FXML
  private Button Button_4;
  @FXML
  private Button Button_5;
  @FXML
  private Button Button_6;
  @FXML
  private Button Button_7;
  @FXML
  private Button Button_8;
  @FXML
  private Button Button_9;
  @FXML
  private Button Button_0;
  @FXML
  private Button Button_00;
  @FXML
  private Button Button_pl;
  @FXML
  private Button Button_min;
  @FXML
  private Button Button_mul;
  @FXML
  private Button Button_mod;
  @FXML
  private Button Button_div;
  @FXML
  private Button Button_CE;
  @FXML
  private Button Button_dot;
  @FXML
  private Button Button_eq;
  @FXML
  private TextField Text;

  private void calculate(Button button, String Op){
    String getKey = this.Text.getText() + button.getText();
    this.Text.setText(getKey);
  }
  @FXML
  public void KeyPressed(ActionEvent event){
    if(event.getSource() == Button_1){
      calculate(Button_1, "");
    }else if(event.getSource() == Button_2){
      calculate(Button_2, "");
    }
    else if(event.getSource() == Button_3){
      calculate(Button_3, "");
    }
    else if(event.getSource() == Button_4){
      calculate(Button_4, "");
    }
    else if(event.getSource() == Button_5){
      calculate(Button_5, "");
    }
    else if(event.getSource() == Button_6){
      calculate(Button_6, "");
    }
    else if(event.getSource() == Button_7){
      calculate(Button_7, "");
    }
    else if(event.getSource() == Button_8){
      calculate(Button_8, "");
    }
    else if(event.getSource() == Button_9){
      calculate(Button_9, "");
    }
    else if(event.getSource() == Button_0){
      calculate(Button_0, "");
    }
    else if(event.getSource() == Button_00){
      calculate(Button_00, "");
    }
    else if(event.getSource() == Button_pl){
      calculate(Button_pl, "");
    }
    else if(event.getSource() == Button_min){
      calculate(Button_min, "");
    }
    else if(event.getSource() == Button_div){
      calculate(Button_div, "");
    }
    else if(event.getSource() == Button_mul){
      calculate(Button_mul, "");
    }
    else if(event.getSource() == Button_mod){
      calculate(Button_mod, "");
    }
    else if(event.getSource() == Button_dot){
      calculate(Button_dot, "");
    }
    else if(event.getSource() == Button_eq){
      calculate(Button_eq, "");
    }
    else if(event.getSource() == Button_CE){
      Text.clear();
    }
  }
}