package org.example.gameengine.model.boards;


import lombok.Data;
import org.example.gameengine.model.game.Board;

@Data
public class TicTacToeBoard extends Board {

  private String cells[][] = new String[3][3];

  public String getCell(int row, int col) {
    return cells[row][col];
  }
}
