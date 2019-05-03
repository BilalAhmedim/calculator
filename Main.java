import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

import java.io.File;

public class Main extends Application {
  
  public static void main(String[] args){
    launch(args);
  }

  @Override
  public void start(Stage PrimaryStage) throws Exception {
    FXMLLoader loader = new FXMLLoader(new File("Calculator/cal/calculator.fxml").toURI().toURL());
    Parent root = loader.load();
    PrimaryStage.setTitle("Calculator");
    PrimaryStage.setScene(new Scene(root));
    PrimaryStage.show();
  }
}