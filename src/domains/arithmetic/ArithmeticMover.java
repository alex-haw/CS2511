/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.arithmetic;

import framework.problem.Mover;
import framework.problem.State;

/**
 *
 * @author  

 */
public class ArithmeticMover extends Mover {

    public static final String ADD = "Add 3";
    public static final String SUBTRACT = "Subtract 5";
    public static final String DIVIDE = "Divide by 2";
    public static final String MULTIPLY = "Multiply by 2";

    public ArithmeticMover() {
        super.addMove(ADD, s -> add(s));
        super.addMove(SUBTRACT, s -> subtract(s));
        super.addMove(DIVIDE, s -> divide(s));
        super.addMove(MULTIPLY, s -> multiply(s));
      }

    private State add(State state) {
        return new ArithmeticState(getPreviousValue(state) + 3);
      }

    private State subtract(State state) {
        return new ArithmeticState(getPreviousValue(state) - 5);
      }

    private State divide(State state) {
        return new ArithmeticState(getPreviousValue(state) / 2);
      }

    private State multiply(State state) {
        return new ArithmeticState(getPreviousValue(state) * 2);
      }

    private int getPreviousValue(State state) {
        String[] split = state.toString().split(": ");
        return Integer.decode(split[1]);
      }
  }
