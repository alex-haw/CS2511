package interfaces;

import framework.problem.Mover;
import framework.problem.Problem;
import framework.problem.State;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author  

 */
public class GUI extends VBox {

    private Label currentState, finalState, movesLabel, successLabel;
    private Problem problem;
    private GridPane pane;
    private int moves = 0;

    public GUI(Problem problem, double width, double height) {
        this.problem = problem;
        final double rem = new Text("").getLayoutBounds().getHeight();
        pane = new GridPane();
//        pane.setMaxSize(width, height);    
        this.setPrefSize(width, height);
        pane.setHgap(0.8 * rem);
        pane.setVgap(0.8 * rem);
        pane.setPadding(new Insets(0.8 * rem));

        Label welcomeMessage = new Label("Welcome to the " + problem.getName() + "Problem");
        welcomeMessage.setFont(new Font(10));
        pane.add(welcomeMessage, 2, 0);

        Label introduction = new Label(problem.getIntroduction());
        introduction.setFont(new Font(10));
        introduction.setWrapText(true);
        pane.add(introduction, 2, 1);

        currentState = setStateLabel(problem.getCurrentState().toString());
        currentState.setWrapText(true);
        pane.add(currentState, 2, 3);

        finalState = setStateLabel(problem.getFinalState().toString());
        pane.add(finalState, 2, 4);

        movesLabel = new Label("Moves (" + moves + " so far):");
        movesLabel.setFont(new Font(10));
        pane.add(movesLabel, 2, 2);

        HBox buttons = new HBox(0.8 * rem);
        Mover problemMover = problem.getMover();
        for (int i = 0; i < problemMover.getMoveNames().size(); i++) {
            String moveName = problemMover.getMoveNames().get(i);
            Button b = new Button(moveName);

            b.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    problem.setCurrentState(problemMover.doMove(moveName, problem.getCurrentState()));
                    updateState();
                  }
              });
            buttons.getChildren().add(b);
          }
        Button reset = new Button("Reset");
        reset.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                reset();
              }
          });
        buttons.getChildren().add(reset);
        pane.add(buttons, 2, 5);

        successLabel = new Label("");
        successLabel.setFont(new Font(10));
        pane.add(successLabel, 2, 6);

        super.getChildren().add(pane);
      }

    private void updateState() {
        currentState.setText(null);
        currentState.setText(setStateLabel(problem.getCurrentState().toString()).getText());
        moves++;
        movesLabel.setText("Moves (" + moves + " so far):");

        if (problem.getCurrentState().equals(problem.getFinalState())) {
            problemSuccess();
          }
      }

    private void problemSuccess() {
        successLabel.setText("You solved the problem. Congratulations.");
      }

    private void reset() {
        moves = -1;
        problem.setCurrentState(problem.getInitialState());
        updateState();
        successLabel.setText("");
      }

    private Label setStateLabel(String text) {
        Label l = new Label(text);
        l.setBorder(new Border(new BorderStroke(null, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        l.setPadding(new Insets(5));
        l.setFont(new Font(10));
        return l;
      }
  }
