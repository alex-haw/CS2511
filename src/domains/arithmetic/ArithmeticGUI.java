
package domains.arithmetic;

import interfaces.GUI;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author  

 */
public class ArithmeticGUI extends Application {
    
    public GUI gui;
    public ArithmeticGUI(){
        gui = new GUI(new ArithmeticProblem(),700,700);
      }
    
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(gui);
        primaryStage.setTitle("Testing Arithmetic GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
      }

    public static void main(String[] args) {
        launch(args);
      }

  }
