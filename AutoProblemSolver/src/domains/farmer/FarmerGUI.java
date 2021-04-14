
package domains.farmer;

import domains.dummy.DummyProblem;
import interfaces.GUI;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author  

 */
public class FarmerGUI extends Application {

    public GUI gui;
    public FarmerGUI(){
        gui = new GUI(new FarmerProblem(), 700    , 700);
      }
    
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(gui);
        primaryStage.setTitle("Testing Farmer GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
      }
    
    public static void main(String[] args) {
        launch(args);
      }

  }