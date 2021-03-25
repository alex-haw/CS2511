
package domains.puzzle;

import domains.farmer.FarmerProblem;
import interfaces.GUI;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author  

 */
public class PuzzleGUI extends Application {

    public GUI gui;
    public PuzzleGUI(){
        gui = new GUI(new PuzzleProblem(), 700    , 700);
      }
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(gui);
        primaryStage.setTitle("Testing Puzzle GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
      }
    
    public static void main(String[] args) {
        launch(args);
      }

  }