
package framework.ui;


import javafx.application.Application;
import domains.arithmetic.ArithmeticGUI;
import domains.dummy.DummyGUI;
import domains.farmer.FarmerGUI;
import domains.puzzle.PuzzleGUI;

import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 *
 * @author  

 */
public class ProblemGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        TabPane tabPane = new TabPane();

        /* Add tabs using the following */
        Tab aTab = new Tab();
        Tab dTab = new Tab();
        Tab fTab = new Tab();
        Tab pTab = new Tab();
                                
        aTab.setText("Arithmetic Problem");
        dTab.setText("Dummy Problem");
        fTab.setText("Farmer Problem");
        pTab.setText("Puzzle Problem");
        
        aTab.setContent(new ArithmeticGUI().gui);
        dTab.setContent(new DummyGUI().gui);
        fTab.setContent(new FarmerGUI().gui);
        pTab.setContent(new PuzzleGUI().gui);
        
        tabPane.getTabs().add(aTab);
        tabPane.getTabs().add(dTab);
        tabPane.getTabs().add(fTab);
        tabPane.getTabs().add(pTab);
        
        Scene scene = new Scene(tabPane);

        primaryStage.setTitle("Problem Solver");
        primaryStage.setScene(scene);
        primaryStage.show();
      }

    public static void main(String[] args) {
        launch(args);
      }
  }
