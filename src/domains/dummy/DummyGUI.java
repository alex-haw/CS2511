
package domains.dummy;

import domains.arithmetic.ArithmeticProblem;
import interfaces.GUI;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author  

 */
public class DummyGUI extends Application {

    
    public GUI gui;
    public DummyGUI(){
        gui = new GUI(new DummyProblem(), 700    , 700);
      }
    
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(gui);
        
        primaryStage.setTitle("Testing Dummy GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
      }

    public static void main(String[] args) {
        launch(args);
      }

  }