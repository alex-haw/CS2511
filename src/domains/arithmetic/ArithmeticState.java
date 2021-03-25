/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.arithmetic;

import framework.problem.State;

/**
 *
 * @author  

 */
public class ArithmeticState implements State {

    public ArithmeticState(int contents) {
        this.contents = contents;
      }

    @Override
    public boolean equals(Object other) {
        ArithmeticState otherState = (ArithmeticState) other;
        return this.contents == otherState.contents;
      }

    @Override
    public String toString() {
        return "The value is: " + contents;
      }

    private final int contents;
    private static final String NEW_LINE = "\n";
  }
